package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String firstSentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?";

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String word = input.next();
        input.close();
        firstSentence=firstSentence.toLowerCase();
        word = word.toLowerCase();


        if (firstSentence.contains(word)) {
            System.out.println("Congrats, your word was found!");
            System.out.println(word.length());
            System.out.println(firstSentence.indexOf(word));
        } else {
            System.out.println("Sorry, your word was not found.");
        }

        String updatedSentence = firstSentence.replace(word, "");
        System.out.println(updatedSentence);

    }
}
