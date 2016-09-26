// Needed for Scanner Input
import java.util.Scanner;
     
// Class
class Associative {
     
// Variables
  int A;
  int B;
  int C;
  
  // Constructor
  public Associative(int passedX, int passedY, int passedZ) {
  A = passedX;
  B = passedY;
  C = passedZ;
  } // End Constructor
  
  // firstTwo Method
  int firstTwo(){
  return (A + B) * C;
  }
  
  //lastTwo Method
  int lastTwo(){
  return A + (B * C);
  }
  
  //Main Method
  public static void main(String[] args) {
  
  // Variables
  int X;
  int Y;
  int Z;
  
  // Create Scanner that detects/accepts user input
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Input first number");
  X = Integer.parseInt(scan.nextLine());
  
  System.out.println("Input second number");
  Y = Integer.parseInt(scan.nextLine());
  
  System.out.println("Input third number");
  Z = Integer.parseInt(scan.nextLine());
  
  Associative associative = new Associative(X,Y,Z); // Instantiate Associative class
  System.out.println(associative.firstTwo()); // Print result of firstTwo()
  System.out.println(associative.lastTwo()); // Print result of lastTwo()

  } // End Main Method

} // End Class
