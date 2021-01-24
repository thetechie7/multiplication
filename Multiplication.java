import java.util.Scanner;


public class Multiplication {

	public static void main(String[] args) {
		
		System.out.println("The program prints a multiplication table");
		System.out.print("Please enter table size: ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.close();
		
		
		for (int lcv = 1; lcv <= size; lcv++) {
			
			for (int row = 1; row <= size; row++) {
				System.out.print(lcv * row + " ");
			}
			System.out.println();
		}
		

	}

}
