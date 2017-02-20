import java.util.Scanner;

class Program
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int numbers[] = new int[10];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for (int x = 0; x < numbers.length; x++) {
    			System.out.print("Enter a number: ");
    			numbers[x] = scan.nextInt();
    			if( numbers[x] < min) min = numbers[x];
    			if( numbers[x] > max) max = numbers[x];
		}
		System.out.printf("Max: %d Min: %d", max, min);
	}
}
