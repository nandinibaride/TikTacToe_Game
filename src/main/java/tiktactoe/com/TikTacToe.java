package tiktactoe.com;

public class TikTacToe {
	public static void main(String args[]) {
		
		char arr[] = new char[9];  // create array
		for (int i=0;i<arr.length;i++) {   // using for loop
				arr[i] = '-';             // blank space initialize
				System.out.println(arr[i]);
		}
		
	}

}
