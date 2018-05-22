package models;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;


public class Scrabble {


    Map<String, Integer> scoreScrabble = new HashMap<String, Integer>();

    public Scrabble() {
        scoreScrabble.put("a",1);
        scoreScrabble.put("e",1);
        scoreScrabble.put("i",1);
        scoreScrabble.put("o",1);
        scoreScrabble.put("u",1);
        scoreScrabble.put("l",1);
        scoreScrabble.put("n",1);
        scoreScrabble.put("r",1);
        scoreScrabble.put("s",1);
        scoreScrabble.put("t",1);
        scoreScrabble.put("d",2);
        scoreScrabble.put("g",2);
        scoreScrabble.put("b",3);
        scoreScrabble.put("c",3);
        scoreScrabble.put("m",3);
        scoreScrabble.put("p",3);
        scoreScrabble.put("f",4);
        scoreScrabble.put("h",4);
        scoreScrabble.put("v",4);
        scoreScrabble.put("w",4);
        scoreScrabble.put("y",4);
        scoreScrabble.put("k",5);
        scoreScrabble.put("j",8);
        scoreScrabble.put("x",8);
        scoreScrabble.put("q",10);
        scoreScrabble.put("z",10);
    }



    public Integer calculateScore(String inputWord){
        String[] inputArray = inputWord.toLowerCase().split("");
        Integer scoreTotal = 0;
        for (int i = 0; i < inputArray.length; i++){
            scoreTotal += scoreScrabble.get(inputArray[i]);
        }

        return scoreTotal;

    }
}
