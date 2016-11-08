import java.util.Scanner;

public class SimpleMath
{
  public static void main(String[]args) { 

    Scanner sc=new Scanner(System.in);
    int first, second, option, result;

    System.out.println("Input first number");
    first = sc.nextInt();

    System.out.println("Input second number");
    second = sc.nextInt();

    System.out.println("Input option, where 1 is Addition, 2 is Subtraction, 3 is Multiplication, and 4 is Division");
    option = sc.nextInt();

    switch(option){

    case 1:
        result = first + second;
        break;

    case 2:
        result = first - second;
        break;

    case 3:
        result = first * second;
        break;

    case 4:
        if(second != 0) result = first / second;
        break;

    default:
        option = 0;
        break;
    }
    
    if(option == 0) { System.out.println("Invalid option used."); }
    else if (option == 4 && second == 0) { System.out.println("Can not divide by zero.");}
    else {
    System.out.println(result);
    }
  }
}
