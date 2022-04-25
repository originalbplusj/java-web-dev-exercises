package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class ConeComparator implements Comparator<Cone> {


    @Override
    public int compare(Cone o1, Cone o2) {
        if (o1.getCost() < o2.getCost()) {
            return -1;
        }
        if (o1.getCost() > o2.getCost()) {
            return 1;
        }
        return 0;
    }
}
