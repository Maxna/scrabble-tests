package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScrabbleTest {

    @Test
    public void calculateScore_returnScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnScoreForTwoLetters_2() {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("ae"));
    }

    @Test
    public void calculateScore_returnScoreForWord_14() {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 14;
        assertEquals(expected, testScrabble.calculateScore("java"));
    }

    @Test
    public void calculateScore_returnScoreForMixedCase_14() {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 14;
        assertEquals(expected, testScrabble.calculateScore("Java"));
    }
}