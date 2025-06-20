package ch3;

class HeapQuiz {

  int id = 0; // Each object has its own id value

  public static void main(String[] args) {

    int x = 0; // Loop counter and id value

    HeapQuiz[] hq = new HeapQuiz[5]; // Create array to hold 5 HeapQuiz object references

    while (x < 3) {
      hq[x] = new HeapQuiz(); // Create new object
      hq[x].id = x;           // Set object id
      x = x + 1;              // Move to next index
    }

    // Reference assignments and reassignments
    hq[3] = hq[1]; // hq[3] points to same object as hq[1] (id=1)
    hq[4] = hq[1]; // hq[4] also points to object with id=1
    hq[3] = null;  // hq[3] no longer refers to any object
    hq[4] = hq[0]; // hq[4] now points to object with id=0
    hq[0] = hq[3]; // hq[0] is now null
    hq[3] = hq[2]; // hq[3] points to object with id=2
    hq[2] = hq[0]; // hq[2] is now null

    // Final state:
    // hq[0]: null
    // hq[1]: id=1
    // hq[2]: null
    // hq[3]: id=2
    // hq[4]: id=0
  }
}

/*
Summary:
- Creates 3 HeapQuiz objects (id 0, 1, 2).
- Uses an array to store and manipulate references to these objects.
- Shows how assigning, reassigning, and nullifying references affects object accessibility.
- At the end, all 3 original objects are still reachable:
  id=0 via hq[4], id=1 via hq[1], id=2 via hq[3].
*/
