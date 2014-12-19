package de.htwg.se.Muehle.Model.Impl;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class TokenTest {

 Player p1;
 Token t1;
 Position pos;

 @Before
 public void setUp(){
 p1 = new Player("Gustav", Color.BLACK);
 pos = new Position(111);
 t1 = new Token(p1, pos, "ready");
 }

 @Test
 public void testGetPlayerOfToken(){
 assertSame(p1, t1.getPlayerOfToken());
 }

 @Test
 public void testGetTokenPosition(){
 assertSame(pos, t1.getTokenPosition());
 }

 @Test
 public void testGetTokenState(){
 assertSame("ready", t1.getTokenState());
 }

 @Test
 public void testSetTokenState(){
 assertSame("ready", t1.getTokenState());
 t1.setTokenState("set");
 assertSame("set", t1.getTokenState());
 }


}