package com.company.dahms;

public class Main {

    public static void main(String[] args) {
        String cityName = "Columbus";
        int zipCode = 43119;
        int[] highTemp = {32,25,27,40,45};
        int avg = 0;

        for (int j : highTemp) {
            avg += j;
        }
        avg = avg / highTemp.length;

        System.out.println("City: " + cityName);
        System.out.println("Zip: " + zipCode);
        System.out.println("Average Temp: " + avg);

    }
}
