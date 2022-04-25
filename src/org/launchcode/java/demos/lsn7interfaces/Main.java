package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Comparator comparator2 = new ConeComparator();
        cones.sort(comparator2);

        //Sort Toppings array;
        Comparator comparator3 = new ToppingsComparator();
        toppings.sort(comparator3);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println(flavors);
        System.out.println(cones);
        System.out.println(toppings);
    }
}
