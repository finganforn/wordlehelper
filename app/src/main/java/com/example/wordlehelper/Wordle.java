package com.example.wordlehelper;

import java.io.File;
import java.util.ArrayList;

public class Wordle {

    private ArrayList<String> englishWords;
    private String fileLoc = "";

    public Wordle() {
        File directory = new File("./");
        String fileP = directory.getAbsolutePath();
        fileLoc = fileP.substring(0, fileP.length()-1);
    }

    public String hello(String s) {
        return "hello " + s;
    }


    public String fileLoc (){
        return fileLoc;
    }
    public String sampleWords() {
        int size = englishWords.size();
        return "";
    }
    private static int solutionsCount(String word, ArrayList<Character> allowedChars, ArrayList<Character> requiredChars, ArrayList<Character> wildcards) {
        int empty = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ')
                empty++;
        }
        ArrayList<Character> allLetters = new ArrayList<Character>();


        for (Character c : allowedChars) {
            if (!allLetters.contains(c))
                allLetters.add(c);
        }
        for (Character c : requiredChars) {
            if (!allLetters.contains(c))
                allLetters.add(c);
        }
        for (Character c : wildcards) {
            if (!allLetters.contains(c))
                allLetters.add(c);
        }


        int solutions = (int) Math.pow(allowedChars.size(), empty);
        return solutions;
    }
}
