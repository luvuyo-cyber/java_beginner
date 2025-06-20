package ch1; // Declares the package for this class, helping organize Java files.

public class PhraseOMatic { // Defines a public class named 'PhraseOMatic'.

  public static void main(String[] args) { // This is the main method, where the program execution begins.

    // Creates the first array (set) of words.
    String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};

    // Creates the second array (set) of words.
    String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};

    // Creates the third array (set) of words.
    String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design", "orientation"};

    // Determines the number of elements (words) in each array.
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    // Creates a new Random object to generate random numbers.
    java.util.Random randomGenerator = new java.util.Random();

    // Generates a random integer for each list, within the bounds of that list's length.
    // This gives a random index for selecting a word.
    int rand1 = randomGenerator.nextInt(oneLength);
    int rand2 = randomGenerator.nextInt(twoLength);
    int rand3 = randomGenerator.nextInt(threeLength);

    // Builds the complete phrase by combining a randomly selected word from each list.
    // The words are accessed using their random index (e.g., wordListOne[rand1]).
    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    // Prints the final generated phrase to the console.
    System.out.println("What we need is a " + phrase);
  }
}

/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Arrays: Storing collections of `String` elements.
 * 2.  Variables: Declaring and using `int` and `String` variables.
 * 3.  Object Instantiation: Creating an object of the `Random` class.
 * 4.  Random Number Generation: Using `randomGenerator.nextInt()` to get random indices.
 * 5.  String Concatenation: Combining strings and array elements to form a sentence.
 * 6.  Array Indexing: Accessing elements in an array using `[]` and an index.
 * 7.  Output: Displaying the result to the console (`System.out.println`).
 * 8.  Basic Program Structure: Using a `package` and `main` method within a `class`.
 */