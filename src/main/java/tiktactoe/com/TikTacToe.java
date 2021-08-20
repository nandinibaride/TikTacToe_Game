package tiktactoe.com;

public class TikTacToe {
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
	
	public static void main(String args[]) {
			createBoard();
	}

}
