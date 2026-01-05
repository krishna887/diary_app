package org.example.diary_app.controller;

import org.example.diary_app.model.Diary;
import org.example.diary_app.repo.DiaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Optional;

@Controller("/diary")
public class DiaryController {
  @Autowired
  private DiaryRepo diaryRepository;

  // Load page
  @GetMapping("/")
  public String loadPage() {
    return "diary-content";
  }

  // Save content
  @PostMapping("/save")
  public String saveContent(
          @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
          @RequestParam("content") String content) {

    Diary diary = new Diary();
    diary.setDate(date);
    diary.setContent(content);

    diaryRepository.save(diary);

    return "redirect:/";
  }

  // Get content by date
  @GetMapping("/getContent")
  public String getContentByDate(
          @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
          Model model) {

    String diary = diaryRepository.getContentByDate(date);

    if (StringUtils.hasText(diary)) {
      model.addAttribute("content", diary);
    } else {
      model.addAttribute("error", "No content found for selected date");
    }

    return "diary-content";
  }


}
