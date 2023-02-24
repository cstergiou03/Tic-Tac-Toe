import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String characters = "ABC";
		String numbers = "123";
		char[] text = new char[1];
		Random rand = new Random();
		String computerMove = "";
		
		char[][] board = new char[3][3];
		String move;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j] = ' ';
			}
		}
		
		board b1 = new board(board);
		
		System.out.println("************");
		System.out.println("Tic-Tac-Toe!");
		System.out.println("************");
		
		System.out.println("\n");
		
		System.out.println("Please enter the column (A, B or C) and then the row (1, 2, or 3) of your move.");
        
		b1.printBoard();
		
		boolean flag = true;
		boolean playerFlag = false;
		boolean computerFlag = false;
		boolean playerWins = false;
		boolean computerWins = false;
		
		while(flag) {
			
			playerFlag = false;
	        while(playerFlag==false) {
				System.out.print("\nPlayer Move (X): \r");
				move = in.nextLine();
				playerFlag = b1.addMove(move, 'X');
				b1.printBoard();
				playerWins = b1.winGame(move);
				if(playerWins==true) {
					playerFlag=true;
				}
	        }
	        if(playerWins==true)
	        	break;
	        
	        computerFlag = false;
	        while(computerFlag==false) {
				computerMove = "";
				characters = "ABC";
				numbers = "123";
				text[0] = characters.charAt(rand.nextInt(characters.length()));
			    computerMove += text[0];
			    text[0] = numbers.charAt(rand.nextInt(characters.length()));
			    computerMove += text[0];
				computerFlag = b1.addMove(computerMove, 'O');
				if(computerFlag==true) {
					System.out.println("\nComputer Move (O): " + computerMove + "\n");
					b1.printBoard();
					computerWins = b1.winGame(computerMove);
					if(computerWins==true) {
						computerFlag=true;
					}
				}
	        }
	        if(computerWins==true)
	        	break;
		}
		
		if(playerWins==true) {
			System.out.println("\nYou win!");
		}else if(computerWins==true){
			System.out.println("\nComputer wins!");
		}else
			System.out.println("It is a Tie!");
		in.close();
	}
	
}
