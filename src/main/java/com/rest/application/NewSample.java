package com.rest.application;

public class NewSample {

    public static void main(String[] args) {
        trianglePattern();
    }

    private static void trianglePattern() {
        for (int j = 0; j < 6; j++) {
            for (int i = j; i < 6; i++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= j; k++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}
