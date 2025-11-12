package edu.ntnu.iir.bidata;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DiaryEntryTest {

  /**
   * Tests the getters and setters.
   */

  @Test
  void getId() {
  }

  @Test
  void getTitle() {
  }

  @Test
  void getContent() {
  }

  @Test
  void getDate() {
  }

  @Test
  void setTitle() {
  }

  @Test
  void setContent() {
  }

  @Test
  void timeFormatter() {
  }

  @Test
  public void testConstructorWithoutAuthor() {
    DiaryEntry entry = new DiaryEntry("123", "abc", 4,
        LocalDateTime.of(2025, 10, 25, 16, 20));
    assertEquals("abc", entry.getContent());
    assertEquals("123", entry.getTitle());
    assertEquals(4, entry.getId());
    assertEquals(LocalDateTime.of(2025, 10, 25, 16, 20), entry.getDate());
  } // Tests if the constructor works with the correct parameters.

  @Test
  public void testConstructorWithAuthorContent() {
    assertThrows(IllegalArgumentException.class, () -> new DiaryEntry("", "",1, LocalDateTime.now()));
  } // Tests if my exception is thrown if the title or content is empty.





}