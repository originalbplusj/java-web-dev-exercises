package org.launchcode.java.studios.countingcharacters;

import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {


    public static void main(String[] args) {

        //String stringToSplit = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String stringToSplit;
        Scanner input;
        //char[] charactersInString = stringToSplit.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        System.out.println(System.getProperty("user.dir"));

        //input = new Scanner(System.in);
        //System.out.println("Enter your string: ");

        //stringToSplit = input.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
        stringToSplit = processText("/Users/bethjohnson/Desktop/java-practice/chapter1/java-web-dev-exercises/src/WaltWhitman.txt");
        System.out.println(stringToSplit);
        char[] charactersInString = stringToSplit.toCharArray();

        for (char c : charactersInString) {
            if (!characters.contains(c)) {
                characters.add(c);
                Collections.sort(characters);
            }
        }

        for (int i = 0; i < characters.size(); i++) {
            int counter = 0;
            for (int j = 0; j < charactersInString.length; j++) {
                if (characters.get(i).equals(charactersInString[j])) {
                    counter++;

                }

            }
            count.add(counter);
            System.out.println(characters.get(i) + ":" + " " + count.get(i) + "");
            counter = 0;
        }

    }

    private static String processText(String filepath) {
        StringBuilder builder = new StringBuilder();
        File file = new File("/Users/bethjohnson/Desktop/java-practice/chapter1/java-web-dev-exercises/src/WaltWhitman.txt");
        try(BufferedReader buffer = new BufferedReader(new FileReader(filepath))){
            String stringFromTextFile;


            while((stringFromTextFile = buffer.readLine()) != null) {
                builder.append(stringFromTextFile).append("\n");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return builder.toString();
    }

}

    

