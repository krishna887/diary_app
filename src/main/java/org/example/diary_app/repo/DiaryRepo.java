package org.example.diary_app.repo;

import org.example.diary_app.model.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Optional;


public interface DiaryRepo extends JpaRepository<Diary,Integer> {
@Query("select d.content from  Diary d where d.date =:date")
String getContentByDate(@Param("date")LocalDate date);
}
