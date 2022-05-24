package com.bridgelabz;

import java.util.Scanner;

public class InsertionSortWithString {


    String array[] = new String[5];

    public void getData() {
        System.out.println("enter 6 numbers for sorting...");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.next();
            insertionSortCode(i);
        }
    }

    public void display() {
        for (int i = 0; i < 5; i++)
            System.out.println(array[i]);
    }

    public void insertionSortCode(int n) {
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((array[i].compareToIgnoreCase(array[j])>0)) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }





}
