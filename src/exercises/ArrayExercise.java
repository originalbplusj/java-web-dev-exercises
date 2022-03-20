package exercises;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8};

        for (int i : nums) {
            System.out.println(i);
        }

        for (int i : nums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String testSentence = "I would not, could not, in a box. I would not, could not with " +
                "a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String [] output = testSentence.split("\\.");
        System.out.println(Arrays.toString(output));

    }

}
