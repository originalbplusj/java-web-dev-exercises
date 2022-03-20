package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(0,1,1,2,3,5,8,13,21,34));
        System.out.println(sumNums(nums));

        ArrayList<String> words = new ArrayList<String>(Arrays.asList("puppy", "kitten", "fox", "robin", "tiger", "zebra", "hippo", "giraffe"));
        String firstSentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?";

        String newStr[] = firstSentence.split(" ");
        List<String> sentenceAlice = new ArrayList<String>();
        sentenceAlice = Arrays.asList(newStr);
        System.out.println(fiveLetterWords(sentenceAlice));

    }

    public static Integer sumNums(ArrayList<Integer> list){
        int sumOfNums = 0;
        for (Integer i: list) {
            sumOfNums += i;
        }
        return sumOfNums;
    }

    public static ArrayList<String> fiveLetterWords(List<String> list){
        ArrayList<String> selectedWords = new ArrayList<String>();
        Scanner input;
        int wordLength = 0;
        input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        wordLength = Integer.parseInt(input.next());

        for (String s: list) {
            if(s.length() == wordLength){
                selectedWords.add(s);
            }
        }
        return selectedWords;


    }
}
