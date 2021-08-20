package tiktactoe.com;
import java.util.*;

public class UC2PlayTheGame {
	private static char computerSymbol;
	private static char playerSymbol;
	
	/*
	 * @purpose: Create a Board and initialize blank space
	 * @return: No return value  
	 */
	public static void createBoard(){      
		char arr[] = new char[10];          
		for (int i=1;i<arr.length;i++) {   
				arr[i] = ' ';             
				System.out.println(arr[i]);
		}
	}
	/*
	 * @purpose: Choose a symbol for playing game 
	 * @return: No return value
	 */
	
	public static void chooseSymbol() {
		
		Scanner sc = new Scanner(System.in);      
		System.out.print("Enter the symbol: ");  
		char enteredSymbol = sc.next().toUpperCase().charAt(0);
		
		if(enteredSymbol == 'X') {
			playerSymbol = 'X';
			computerSymbol = 'O';		
		} else if(enteredSymbol == 'O') {
			computerSymbol = 'O';
			playerSymbol = 'X';
		} else {
			System.out.println("Please enter correct symbol");
	    }
		
		System.out.println("Computer Symbol: " + computerSymbol);
		System.out.println("Player Symbol: " + playerSymbol);
	    
		sc.close();
	}
		
		public static void main(String args[]) {
		createBoard();
		chooseSymbol();
		}
}
