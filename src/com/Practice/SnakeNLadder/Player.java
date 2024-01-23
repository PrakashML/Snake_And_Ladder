package com.Practice.SnakeNLadder;
import java.lang.Math;
public class Player {
    int position = 0;
    Player(){
    }
    public int Roll_Die(){
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        return (int) (Math.random()*range + min);
    }
}
