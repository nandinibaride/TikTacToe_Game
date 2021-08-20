package tiktactoe.com;

public class TikTacToe {
	public static void main(String args[]) {
		
		char arr[] = new char[10];  // create array
		for (int i=1;i<arr.length;i++) {   // using for loop
				arr[i] = '-';             
				System.out.println(arr[i]);
		}
		
	}

}
