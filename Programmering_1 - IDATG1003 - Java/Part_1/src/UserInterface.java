package edu.ntnu.iir.bidata;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner; // Biblioteket vi skal ta i bruk for at brukeren kan skrive inn sin innlegg.

/**
 * UserInterface skal stå for det brukeren ser og interagerer med.
 */

public class UserInterface {

  Scanner userInput = new Scanner(System.in); // Creates a new Scanner object.
  ArrayList<DiaryEntry> fakeEntry = new ArrayList<>();

  /**
   * Metoden init initialiserer applikasjonen.
   */

  public void init(){

     //fakeEntry.add(new DiaryEntry("", "", 4, LocalDateTime.now()));
     fakeEntry.add(new DiaryEntry("Entry 1", "This is entry 1", 0,
         LocalDateTime.of(2025, 10, 25, 16, 20)));
     fakeEntry.add(new DiaryEntry("Entry 2", "This is entry 2", 1,
         LocalDateTime.of(2025, 10, 25, 16, 20)));
     fakeEntry.add(new DiaryEntry("Entry 3", "This is entry 3", 2,
         LocalDateTime.of(2025, 10, 25, 16, 20)));
     fakeEntry.add(new DiaryEntry("Entry 4", "This is entry 4", 3,
         LocalDateTime.of(2025, 10, 25, 16, 20)));


   }
  private void entryPrinter(DiaryEntry fakeEntries) {

    System.out.println("""
        *********************************************
        Title:""" + fakeEntries.getTitle() + """ 
        \nContent:""" + fakeEntries.getContent() + """
        \nDate:""" + fakeEntries.timeFormatter(fakeEntries.getDate()) + """
        \n*********************************************
        """);
  }

  /**
   * Metoden start starter applikasjonen når vi tilkaller den i main med .start();.
   */
  public void start() { // Main calls this method
    System.out.print(""" 
        Welcome to the Diary!
        You can write your diary entries here.
        You can also view your diary entries.
        You can also add new entries.
        You can also delete entries.
        You can also search for entries.
        Do you wish to enter the diary?
        "1": yes or "2": no
        :"""); // Welcome message and introduction to the diary.



    String choice1 = ""; // Empty string to store the users input.


    while (true) {
      /* We need a while loop to repeat the invalid message in the default section,
      the user must enter a valid input to escape the loop.
       */

      choice1 = userInput.nextLine(); // Reads the user input.

      switch (choice1) { // Switch is used to check if the input matches one of the options.
        case "1" -> System.out.println("You have chosen to enter the diary.");
        // case is one of the options, the input must match one of the options.

        case "2" -> {
          System.out.println("Goodbye!");
          userInput.close();
          return; // Exits the loop and the method.
        }
        default -> { // Default catches any inputs that don't match the above cases.
          System.out.println("Invalid input.");
          continue; // Continue is used to continue the switch and proceed.
        }
      }
      break; // Break is used to break the switch and proceed
    }

    System.out.println("""
        What do you want to do next?
        1. View entries
        2. Add entry
        3. Delete entry
        4. Exit
        """);

    while (true) {
      /* We need a while loop to repeat the invalid message in the default section,
      the user must enter a valid input to escape the loop.
       */

      choice1 = userInput.nextLine();

      switch (choice1) { // Switch is used to check if the input matches one of the options.
        case "1" -> {
          System.out.println("You have chosen to view entries.");
        // case is one of the options, the input must match one of the options.
          break;
        }
        case "2" -> System.out.println("You have chosen to add an entry.");

        case "3" -> System.out.println("You have chosen to delete an entry.");

        case "4" -> System.out.println("You have chosen to exit.");

        default -> { // Default catches any inputs that don't match the above cases.
          System.out.println("Invalid input.");
          continue; // Continue is used to continue the switch and proceed.
        }
      }
      break; // Break is used to break the switch and proceed
    }

    System.out.println("""
        What do you want to do next?
        1. View all entries
        2. View entry 1
        3. View entry 2
        4. View entry 3
        5. View entry 4
        6. Exit
        """);

    while (true) {
      /* We need a while loop to repeat the invalid message in the default section,
      the user must enter a valid input to escape the loop.
       */

      choice1 = userInput.nextLine();

      switch (choice1) { // Switch is used to check if the input matches one of the options.
        case "1" -> {
          System.out.println("You have chosen to view all entries.");
          // case is one of the options, the input must match one of the options.
          for (DiaryEntry fakeEntries : fakeEntry){
            entryPrinter(fakeEntries);
          }
        }

        case "2" -> {
          System.out.println("You view entry 1.");
          entryPrinter(fakeEntry.getFirst());
        }

        case "3" -> {
          System.out.println("You view entry 2.");
          entryPrinter(fakeEntry.get(1));
        }

        case "4" -> {
          System.out.println("You view entry 3.");
          entryPrinter(fakeEntry.get(2));
        }

        case "5" -> {
          System.out.println("You view entry 4.");
          entryPrinter(fakeEntry.get(3));
        }

        case "6" -> System.out.println("You have chosen to exit.");

        default -> { // Default catches any inputs that don't match the above cases.
          System.out.println("Invalid input.");
          continue; // Continue is used to continue the switch and proceed.
        }
      }
      break; // Break is used to break the switch and proceed
    }
  }
}




