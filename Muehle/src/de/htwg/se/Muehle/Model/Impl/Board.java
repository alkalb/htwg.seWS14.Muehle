package de.htwg.se.Muehle.Model.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Board {

	private static final int TOKENCOUNT = 24;
	private Token board[];
	private Map<Integer, int[]> connections;

	public Board(){
		board = new Token[TOKENCOUNT];
		/*for(int i = 0; i < board.length; i++){
		board[i] = new Token(null, null, null);
		}*/

		connections = new HashMap<Integer, int[]>();
		connections.put(0, new int[]{7,1,-1,-1});
		connections.put(1, new int[]{9,2,-1,0});
		connections.put(2, new int[]{3,-1,-1,1});
		connections.put(3, new int[]{4,-1,2,11});
		connections.put(4, new int[]{-1,-1,3,5});
		connections.put(5, new int[]{-1,4,13,6});
		connections.put(6, new int[]{-1,5,7,-1});
		connections.put(7, new int[]{6,15,0,-1});
		connections.put(8, new int[]{15,9,-1,-1});
		connections.put(9, new int[]{17,10,1,8});
		connections.put(10, new int[]{11,-1,-1,9});
		connections.put(11, new int[]{12,3,10,19});
		connections.put(12, new int[]{-1,-1,11,13});
		connections.put(13, new int[]{5,12,21,14});
		connections.put(14, new int[]{-1,13,15,-1});
		connections.put(15, new int[]{14,23,8,7});
		connections.put(16, new int[]{23,17,-1,-1});
		connections.put(17, new int[]{-1,18,9,16});
		connections.put(18, new int[]{19,-1,-1,17});
		connections.put(19, new int[]{20,11,18,-1});
		connections.put(20, new int[]{-1,-1,19,21});
		connections.put(21, new int[]{13,20,-1,22});
		connections.put(22, new int[]{-1,21,23,-1});
		connections.put(23, new int[]{22,-1,16,15});
		
	}

	public boolean isPositionEmpty(int x){

		return (board[x] == null);

	}

	public void setPosition(int x, Token t){
		board[x] = t;
	}
}