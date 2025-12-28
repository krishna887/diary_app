package org.example.diary_app.repo;

import org.example.diary_app.model.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepo extends JpaRepository<Diary,Integer> {
}
