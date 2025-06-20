/*
 * This file contains the source code for the 'GuessGame' class,
 * which encapsulates the core logic of the "Guess the Number" game.
 * It manages the target number, interacts with player objects,
 * and determines if there's a winner.
 */
package ch2; // Declares the package for this class. It's in the same 'ch2' package
// as GameLauncher and Player, allowing them to easily access each other.

public class GuessGame { // Defines a class named 'GuessGame'. This class is the central manager for the game.

  Player p1; // Declares a Player object for player 1. These are instance variables,
  Player p2; // meaning each 'GuessGame' object will have its own set of players.
  Player p3; // They are not yet initialized (they are null at this point).

  public void startGame() { // Defines the public method to start and manage the game's flow.
    // This method will be called by the GameLauncher.

    p1 = new Player(); // Creates a new Player object for player 1 and assigns it to 'p1'.
    p2 = new Player(); // Creates new Player objects for player 2 and 3 as well.
    p3 = new Player(); // Each 'Player' object is a separate instance.

    int guessp1 = 0; // Declares an integer variable to hold Player 1's guess. Initialized to 0.
    int guessp2 = 0; // Variables for Player 2's guess.
    int guessp3 = 0; // Variables for Player 3's guess.

    boolean p1isRight = false; // Declares a boolean flag for Player 1's correct guess. Initialized to false.
    boolean p2isRight = false; // Flags for Player 2 and 3.
    boolean p3isRight = false;

    // Generates a random number between 0 (inclusive) and 9 (exclusive) for the target number.
    // 'Math.random()' returns a double between 0.0 and 1.0. Multiplying by 10 makes it 0.0 to 9.999...
    // Casting to '(int)' truncates the decimal, resulting in an integer from 0 to 9.
    int targetNumber = (int) (Math.random() * 10);
    System.out.println("I'm thinking of a number between 0 and 9..."); // Informs the players of the range.

    while (true) { // Starts an infinite 'while' loop. This loop will continue indefinitely
      // until a 'break' statement is encountered, which happens when a winner is found.

      System.out.println("Number to guess is " + targetNumber); // Reveals the target number for debugging/clarity.

      p1.guess(); // Calls the 'guess()' method on the 'p1' (Player) object.
      // This makes Player 1 generate and store their random guess.
      p2.guess(); // Player 2 makes a guess.
      p3.guess(); // Player 3 makes a guess.

      guessp1 = p1.number; // Retrieves the guessed number from Player 1's object.
      System.out.println("Player one guessed " + guessp1); // Announces Player 1's guess.

      guessp2 = p2.number; // Retrieves and announces Player 2's guess.
      System.out.println("Player two guessed " + guessp2);

      guessp3 = p3.number; // Retrieves and announces Player 3's guess.
      System.out.println("Player three guessed " + guessp3);

      if (guessp1 == targetNumber) { // Checks if Player 1's guess matches the target number.
        p1isRight = true; // If true, sets Player 1's winning flag to true.
      }
      if (guessp2 == targetNumber) { // Checks Player 2's guess.
        p2isRight = true;
      }
      if (guessp3 == targetNumber) { // Checks Player 3's guess.
        p3isRight = true;
      }

      // Uses a logical OR operator (||) to check if any of the players have guessed correctly.
      if (p1isRight || p2isRight || p3isRight) {
        System.out.println("We have a winner!"); // Announces that a winner has been found.
        System.out.println("Player one got it? " + p1isRight); // States the winning status for each player.
        System.out.println("Player two got it? " + p2isRight);
        System.out.println("Player three got it? " + p3isRight);
        break; // Exits the 'while(true)' loop immediately, ending the game.
      } else { // If no player guessed correctly in this round.
        System.out.println("Players will have to try again."); // Informs players to try again.
      } // Ends the if/else block for winner check.
    } // Ends the while loop.
  } // Ends the startGame method.
} // Ends the GuessGame class.

/*
 * Summary of Concepts in GuessGame.java:
 * This file demonstrates:
 * 1.  **Class Definition**: Defines a class (`GuessGame`) that orchestrates game logic.
 * 2.  **Object Instantiation**: Creates multiple `Player` objects (`p1`, `p2`, `p3`) using `new`.
 * 3.  **Instance Variables**: `GuessGame` has `Player` objects as its instance variables.
 * 4.  **Methods**: Defines a method (`startGame()`) that encapsulates the game's entire flow.
 * 5.  **Random Number Generation**: Uses `Math.random()` to generate the secret number.
 * 6.  **Control Flow**:
 * * `while` Loop: Creates game rounds that repeat until a winning condition is met.
 * * `if-else` Statements: Used for decision-making (e.g., checking guesses, determining winner).
 * 7.  **Boolean Variables & Operators**: Uses boolean flags (`p1isRight`) and the logical OR (`||`) operator to manage game conditions.
 * 8.  **Object Interaction**: Calls methods on `Player` objects (`p1.guess()`) to get their actions.
 * 9.  **Loop Control**: Uses `break` to exit the `while` loop when a winner is found.
 */
