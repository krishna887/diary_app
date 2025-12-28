package org.example.diary_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Diary {
  @Id
 public int id;
  public String content;
 public Date date;

}
