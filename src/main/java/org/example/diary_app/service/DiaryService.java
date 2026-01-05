package org.example.diary_app.service;

import lombok.RequiredArgsConstructor;
import org.example.diary_app.model.Diary;
import org.example.diary_app.repo.DiaryRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class DiaryService {
  private final DiaryRepo diaryRepo;

  String getContent(LocalDate localDate){
  return   diaryRepo.getContentByDate(localDate);
  }
}
