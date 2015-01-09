package de.htwg.se.aUI;

import de.htwg.se.Muehle.Controller.IGameController;
import de.htwg.se.Muehle.Model.IBoard;
import de.htwg.se.Muehle.Model.IField;

public class TextualUserInterface {
	private IGameController gamCon;
	private IBoard board;
	private static final int ZERO = 0;
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int FOUR = 4;
	private static final int FIVE = 5;
	private static final int SIX = 6;
	private static final int SEVEN = 7;
	private static final int EIGHT = 8;
	private static final int NINE = 9;
	private static final int TEN = 10;
	private static final int ELEVEN = 11;
	private static final int TWELVE = 12;
	private static final int THIRTEEN = 13;
	private static final int FOURTEEN = 14;
	private static final int FIFTEEN = 15;
	private static final int SIXTEEN = 16;
	private static final int SEVENTEEN = 17;
	private static final int EIGHTTEEN = 18;
	private static final int NINETEEN = 19;
	private static final int TWENTY = 20;
	private static final int TWENTYONE = 21;
	private static final int TWENTYTWO = 22;
	private static final int TWENTYTHREE = 23;
	private static final int SIZE = 24;
	
	public TextualUserInterface(IGameController gc){
		gamCon = gc;
		board = gamCon.getBoard();
	}
	
	
	
	
	
	
	
	
	
	
	public void printHelp(){
		print("/restart Restarts the game\n"
				+ "/exit Exits the game\n"
				+ "/help Shows this text\n");
	}
	

	

	public void printGame(){
		
		IField[] fields = board.getFields();
		String[] output = new String[SIZE];
		
		for(int i = 0; i < SIZE; i++){
			output[i] = fields[i].getFieldColor();
		}		
		

		
		
		System.out.printf("\n6----------5---------4 \t\t%s---------%s---------%s\n" +
				  "|          |         | \t\t|         |         |\n" +
				  "|  14-----13-----12  | \t\t|  %s------%s------%s  |\n" +
				  "|  |       |      |  | \t\t|  |      |      |  |\n" +
				  "|  |  22---21--20 |  | \t\t|  |  %s---%s---%s  |  |\n" +
				  "|  |   |       |  |  | \t\t|  |  |       |  |  |\n" +
				  "7--15--23      19-11-3 \t\t%s--%s--%s       %s--%s--%s\n" +
				  "|  |   |       |  |  | \t\t|  |  |       |  |  |\n" +
				  "|  |  16---17--18 |  | \t\t|  |  %s---%s---%s  |  |\n" +
				  "|  |       |      |  | \t\t|  |      |      |  |\n" +
				  "|  8-------9------10 | \t\t|  %s------%s------%s  |\n" +
				  "|          |         | \t\t|         |         |\n" +
				  "0----------1---------2 \t\t%s---------%s---------%s\n", output[SIX], output[FIVE], output[FOUR], output[FOURTEEN],
			  output[THIRTEEN], output[TWELVE], output[TWENTYTWO], output[TWENTYONE], output[TWENTY],
			  output[SEVEN], output[FIFTEEN],  output[TWENTYTHREE], output[NINETEEN],
			  output[ELEVEN], output[THREE], output[SIXTEEN], output[SEVENTEEN],
			  output[EIGHTTEEN], output[EIGHT],  output[NINE], output[TEN], output[ZERO], output[ONE],
			  output[TWO]);
	}
	
	
	private void print(String s){
		System.out.printf(s);
	}
	

}