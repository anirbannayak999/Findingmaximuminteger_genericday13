package com.bridgelabz;

public class Maximumintegerday13 {

    String checkMaximum(String x, String y, String z) {
        String max = x; //Assuming x is the largest (initially)

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // now z is the largest

        return  max;
    }

    public static void main(String[] args) {
        Maximumintegerday13 obj = new Maximumintegerday13 ();
        System.out.println("The maximum integer is : " + obj.checkMaximum("Apple", "Peach", "Banana"));

    }

}





