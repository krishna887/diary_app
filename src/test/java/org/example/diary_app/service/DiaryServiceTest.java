package org.example.diary_app.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class DiaryServiceTest {
  @Autowired
private DiaryService diaryService;
  @Test
  void shouldGetContent(){
    LocalDate date=LocalDate.of(2026,1,1);
    String content=diaryService.getContent(date);
    System.out.println(content);
  }


}