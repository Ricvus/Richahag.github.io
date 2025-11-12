package edu.ntnu.iir.bidata;

/**
 * Main skal kjøre programmet.
 */
public class Main {

  /**
   * Main metode.
   *
   * @param args Kommando linje argumenter som ikke brukes.
   */

  public static void main(String[] args) { // Kjører programmet
    UserInterface ui = new UserInterface(); // Oppretter instans av UserInterface
    ui.init();
    ui.start(); // Kjører UserInterface klassens start metode

  }
}

