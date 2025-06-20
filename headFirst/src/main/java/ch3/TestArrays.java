package ch3;

class TestArrays {

  public static void main(String[] args) {

    // Create an array of integers to use as indexes
    int[] index = new int[4];
    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;

    // Create an array of island names
    String[] islands = new String[4];
    islands[0] = "Bermuda";
    islands[1] = "Fiji";
    islands[2] = "Azores";
    islands[3] = "Cozumel";

    int y = 0; // Loop counter
    int ref;   // To store index from 'index' array

    // Loop through the 'index' array
    while (y < 4) {
      ref = index[y]; // Get index from 'index' array
      System.out.println("island = " + islands[ref]); // Print island name from 'islands' array
      y = y + 1; // Move to next index
    }
  }
}

/*
Summary:
- Two arrays are used: one with island names and one with custom index order.
- The program uses the index array to access elements in the islands array in a specific order.
- Demonstrates array usage, indirect indexing, and simple loop control.
*/
