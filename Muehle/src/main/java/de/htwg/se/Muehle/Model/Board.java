package de.htwg.se.Muehle.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {
	
	Token board[];
	HashMap<Integer, ArrayList<Integer>> connections;
	
	public void Board(){
		board = new Token[24];
		
		connections = new HashMap<Integer, ArrayList<Integer>>();
		/*for(int i = 0; i < 24; i++){
			
		}*/
	}
	
	public boolean isPositionEmpty(int x){
		if(board[x] == null){
			return true;
		} else {
			return false;
		}
	}
	
	public void setPosition(int x, Token t){
		board[x] = t;
	}
}
