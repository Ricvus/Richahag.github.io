package edu.ntnu.iir.bidata;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Representerer dagboksinnlegg med tittel, forfatter og dato.
 * Tittel og forfatter kan ikke endres ved opprettelse.
 * Dato settes automatisk ved opprettelse.
 * Innhold kan endres.
 */

public class DiaryEntry {
  private String title;
  private String content;
  private final LocalDateTime date;
  private final int id;

  /**
   * Declares entities, constructors and getters and setters.
   */

  public DiaryEntry(String title, String content, int id, LocalDateTime date) {

    if (title == null || title.isBlank()) {
      throw new IllegalArgumentException("Title cannot be null or empty");
    }
    if (content == null || content.isBlank()) {
      throw new IllegalArgumentException("Content cannot be null or empty");
    }
    this.title = title;
    this.content = content;
    this.date = date;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public LocalDateTime getDate() {
    return date;
  }

  /**
   * Sets title.
   */

  public void setTitle(String title) {
    if (title == null || title.isEmpty()) {
      throw new IllegalArgumentException("Title cannot be null or empty");
    }
    this.title = title;
  }

  /**
   * Sets content.
   */

  public void setContent(String content) {
    if (content == null || content.isEmpty()) {
      throw new IllegalArgumentException("Content cannot be null or empty");
    }
    this.content = content;
  }

  /**
   * Formats LocalDateTime to a readable string.
   */

  public String timeFormatter(LocalDateTime date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return date.format(formatter);
  }

  /**
   * Overrides toString method to display diary entry information.
   */

  public String toString() {
    return "Title: " + title + "\nContent: " + content + "\nDate: " + timeFormatter(date);
  }
}
