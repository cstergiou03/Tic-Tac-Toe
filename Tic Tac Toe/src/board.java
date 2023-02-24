public class board {
	
	private char[][] board;

	public board(char[][] board) {
		this.board = board;
	}
	
	public void printBoard() { 
		System.out.println("   A B C");
		for(int i=0;i<3;i++) {
			System.out.println(i+1 + " |" + board[i][0] + "|" + board[i][1] + "|" + board[i][2] + "|");
		}
	}

	//η χρηση της addmove γινεται για να ενημερωθεί το ταμπλο για την κινηση του παικτη ή του υπολογιστή και ηια να μην χρειαζεται να την κανουμε 2 φορες
	//για τον χρηστη με το γραμμα Χ και το υπολογιστή με το γραμμα Ο δίνουμε σαν ορισμα σε καθε κλήση της μεθόδου το Χ ή το Ο αναλογα
	public boolean addMove(String move, char Symbol) {
		
		char first = move.charAt(0);
		char second = move.charAt(1);
		
		if(first=='A') {
			if(second=='1') {
				if(board[0][0]==' '){
					board[0][0]=Symbol;
					return true;
				}else {
					if(Symbol=='O')
						return false;
					System.out.println("The space entered is already taken.\n");
					return false;
				}
			}else if(second=='2') {
				if(board[1][0]==' '){
					board[1][0]=Symbol;
					return true;
				}else {
					if(Symbol=='O')
						return false;
					System.out.println("The space entered is already taken.\n");
					return false;
				}
			}else if(second=='3') {
				if(board[2][0]==' '){
					board[2][0]=Symbol;
					return true;
				}else {
					if(Symbol=='O')
						return false;
					System.out.println("The space entered is already taken.\n");
					return false;
				}
			}else {
				System.out.println("Invalid Input: Please enter the column and row of your move (Example: A1).\n");
				return false;
			}
		}else if(first=='B') {
			if(second=='1') {
				if(board[0][1]==' '){
					board[0][1]=Symbol;
					return true;
				}else {
					if(Symbol=='O')
						return false;
					System.out.println("The space entered is already taken.\n");
					return false;
				}	
			}else if(second=='2') {
				if(board[1][1]==' '){
					board[1][1]=Symbol;
					return true;
				}else {
					if(Symbol=='O')
						return false;
					System.out.println("The space entered is already taken.\n");
					return false;
				}
			}else if(second=='3') {
				if(board[2][1]==' '){
					board[2][1]=Symbol;
					return true;
				}else {
					if(Symbol=='O')
						return false;
					System.out.println("The space entered is already taken.\n");
					return false;
				}
			}else {
				System.out.println("Invalid Input: Please enter the column and row of your move (Example: A1).\n");
				return false;
			}
		}else if(first=='C') {
			if(second=='1') {
				if(board[0][2]==' '){
					board[0][2]=Symbol;
					return true;
				}else {
					if(Symbol=='O')
						return false;
					System.out.println("The space entered is already taken.\n");
					return false;
				}
			}else if(second=='2') {
				if(board[1][2]==' '){
					board[1][2]=Symbol;
					return true;
				}else {
					if(Symbol=='O')
						return false;
					System.out.println("The space entered is already taken.\n");
					return false;
				}
			}else if(second=='3') {
				if(board[2][2]==' '){
					board[2][2]=Symbol;
					return true;
				}else {
					if(Symbol=='O')
						return false;
					System.out.println("The space entered is already taken.\n");
					return false;
				}
			}else {
				System.out.println("Invalid Input: Please enter the column and row of your move (Example: A1).\n");
				return false;
			}
		}else {
			System.out.println("Invalid Input: Please enter the column and row of your move (Example: A1).\n");
			return false;
		}
	}
	
	//η μεθοδος winGame καλείται μετα απο καθε κίνηση του παικτη ή του υπολογιστή ωστε να ελεξγει εαν αυτη η κινηση τους, τους εχει οδηγησει στην νικη
	//και επιστρεφει την τιμη true ή false στην αντιστοιχη μεταβλητη flag που εχουν παικτης κ υπολογιστης
    public boolean winGame(String move) {
			
		char first = move.charAt(0);
		char second = move.charAt(1);
		char Symbol;
			
		if(first=='A') {
			if(second=='1') {
				Symbol = board[0][0];
				if(Symbol==' ')
					return false;
				if(Symbol==board[1][0] && Symbol==board[2][0]) {
					return true;
				}else if(Symbol==board[0][1] && Symbol==board[0][2]) {
					return true;
				}else if(Symbol==board[1][1] && Symbol==board[2][2]) {
					return true;
				}else 
					return false;
			}else if(second=='2') {
				Symbol = board[1][0];
				if(Symbol==' ')
					return false;
				if(Symbol==board[0][0] && Symbol==board[2][0])	{
					return true;
				}else if (Symbol==board[1][1] && Symbol==board[1][2]) {
					return true;
				}else
					return false;
			}else {
				Symbol = board[2][0];
				if(Symbol==' ')
					return false;
				if(Symbol==board[0][0] && Symbol==board[1][0]) {
					return true;
				}else if(Symbol==board[2][1] && Symbol==board[2][2]) {
					return true;
				}else if(Symbol==board[1][1] && Symbol==board[0][2]) {
					return true;
				}else
					return false;
			}
		}else if(first=='B') {
			if(second=='1') {
				Symbol = board[0][1];
				if(Symbol==' ')
					return false;
				if(Symbol==board[0][0] && Symbol==board[0][2]) {
					return true;
				}else if(Symbol==board[1][1] && Symbol==board[2][1]) {
					return true;
				}else 
					return false;
			}else if(second=='2') {
				Symbol = board[1][1];
				if(Symbol==' ')
					return false;
				if(Symbol==board[0][1] && Symbol==board[2][1]) {
					return true;
				}else if(Symbol==board[1][0] && Symbol==board[1][2]) {
					return true;
				}else if(Symbol==board[0][0] && Symbol==board[2][2]) {
					return true;
				}else if(Symbol==board[0][2] && Symbol==board[2][0]) {
					return true;
				}else 
					return false;
			}else {
				Symbol = board[2][1];
				if(Symbol==' ')
					return false;
				if(Symbol==board[0][1] && Symbol==board[1][1]) {
					return true;
				}else if(Symbol==board[2][0] && Symbol==board[2][2]) {
					return true;
				}else
					return false;
			}
		}else {
			if(second=='1') {
				Symbol = board[0][2];
				if(Symbol==' ')
					return false;
				if(Symbol==board[0][0] && Symbol==board[0][1]) {
					return true;
				}else if(Symbol==board[1][1] && Symbol==board[2][0]) {
					return true;
				}else if(Symbol==board[1][2] && Symbol==board[2][2]) {
					return true;
				}else 
					return false;
			}else if(second=='2') {
				Symbol = board[1][2];
				if(Symbol==' ')
					return false;
				if(Symbol==board[0][2] && Symbol==board[2][2]) {
					return true;
				}else if(Symbol==board[1][1] && Symbol==board[1][0]) {
					return true;
				}else 
					return false;
			}else {
				Symbol = board[2][2];
				if(Symbol==' ')
					return false;
				if(Symbol==board[0][0] && Symbol==board[1][1]) {
					return true;
				}else if(Symbol==board[0][2] && Symbol==board[1][2]) {
					return true;
				}else if(Symbol==board[2][0] && Symbol==board[2][1]) {
					return true;
				}else
					return false;
			}
		}
	}
}	