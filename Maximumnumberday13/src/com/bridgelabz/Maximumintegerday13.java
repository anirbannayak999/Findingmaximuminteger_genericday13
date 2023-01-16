package com.bridgelabz;

public class Maximumintegerday13 {

    float checkMaximum(Float x, Float y, Float z) {
        float max = x; //Assuming x is the largest (initially)

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // now z is the largest

        return  max;
    }

    public static void main(String[] args) {
        Maximumintegerday13 obj = new Maximumintegerday13();
        System.out.println("The maximum integer is : " + obj.checkMaximum(1.25f, 7.51f, 5.026f));

    }

}



