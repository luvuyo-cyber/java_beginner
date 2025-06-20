package ch3;

class Triangle {

  double area;   // Stores the triangle's area
  int height;    // Triangle height
  int length;    // Triangle base length

  public static void main(String[] args) {
    int x = 0; // Loop counter

    Triangle[] ta = new Triangle[4]; // Array to hold 4 Triangle objects

    while (x < 4) {
      ta[x] = new Triangle();        // Create a new Triangle object
      ta[x].height = (x + 1) * 2;    // Set height: 2, 4, 6, 8
      ta[x].length = x + 4;          // Set length: 4, 5, 6, 7
      ta[x].setArea();               // Calculate area
      System.out.println("triangle " + x + ", area = " + ta[x].area); // Print area
      x = x + 1; // Go to next index
    }

    int y = x;      // y is now 4
    x = 27;         // x changes to 27

    Triangle t5 = ta[2]; // t5 refers to the same object as ta[2]
    ta[2].area = 343;    // Change area of the object

    System.out.println("y = " + y + ", t5 area = " + t5.area); // Print y and t5's area
  }

  void setArea() {
    area = (height * length) / 2.0; // Formula to calculate area
  }
}

/*
Summary:
- This code creates and uses Triangle objects.
- Each Triangle gets a height and length, and its area is calculated.
- It shows how object references can point to the same object in memory.
*/
