package exercises;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapExercise {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newIdInput;
        Integer newId;

        System.out.println("Enter the student's ID number (or ENTER to finish): ");

        do {
            System.out.print("ID Number: ");
            newIdInput = input.nextLine();

            if (!newIdInput.equals("")) {
                newId = Integer.parseInt(newIdInput);
                System.out.print("Name: ");
                String newStudent = input.nextLine();
                students.put(newId, newStudent);

                input.nextLine();
            }

        } while(!newIdInput.equals(""));
        System.out.println(("\nClass roster:"));

        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + ": " + student.getValue());

        }
    }
}
