package org.example.diary_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/diary")
public class DiaryController {
  @GetMapping("/getAll")
  public void getAllDiary(){

  }

}
