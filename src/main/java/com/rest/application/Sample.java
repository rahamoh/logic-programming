package com.rest.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Sample {

    public static void main(String[] args) {

        int[] a = {1, 4, 2, 7, 1, 8, 2, 4, 1};
//        int b[] = new int[a.length];
//        int delIndex = 6;

//        delEleInArr(a, b, delIndex);
//        stringContainsDigits("abc123");
//        findTheMissingNumber(a);
//        productOfAArray(a, b);
//        occurenceOfEveryEle(a);
//        pattern(6);
//       palindrome("momm");

//        sortAnArray(a);

    }

    private static void sortAnArray(int[] a) {
        int mid = a[a.length/2];
        int low = a[0];
        int high = a[a.length-1];

        for(int i=0;i< a.length;i++){

        }

        Arrays.stream(a).forEach(System.out::print);
    }

    private static void palindrome(String s) {

        StringBuilder builder = new StringBuilder();
        for(int i=0;i<s.length();i++)
             builder = builder.append(s.charAt(s.length()-(i+1)));
       String s1 = builder.toString();

        if(s.equals(s1))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome" + s1);
    }

    private static void pattern(int n) {

        callHorizontalFor(6);
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            System.out.print(" -");
            System.out.println();
        }
        callHorizontalFor(6);
    }

    private static void callHorizontalFor(int n) {
        for (int i = 0; i < n+2; i++) {
            System.out.print(" -");
        }
    }

    private static void occurenceOfEveryEle(int[] a) {

        HashMap<Integer, Integer> map = new HashMap<>();
//        int count = 1;
        for (int i = 0; i < a.length; i++) { //1, 4, 2, 7, 1, 8, 2, 4, 1
            if (!map.containsKey(a[i]))
                map.put(a[i], 1);
            else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));
    }

    private static void productOfAArray(int[] a, int[] b) {
        int temp = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                temp *= a[j];
                b[i] = temp;
            }
        }
        System.out.println(Arrays.toString(b));
    }

    private static void findTheMissingNumber(int[] a) {
        int num = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] != 1)
                num = a[i + 1] - 1;
        }
        System.out.println(num);
    }

    private static void stringContainsDigits(String str) {

        char[] arr = str.toCharArray();
        int count = 0;
        System.out.print("String has digits ");
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                count = 1;
                System.out.print(arr[i]);
            }
        }
        if (count == 0)
            System.out.println("0");

    }

    private static void delEleInArr(int[] a, int[] b, int delIndex) {

        for (int i = 0; i < a.length; i++) {
            if (i < delIndex)
                b[i] = a[i];
            else if (i == delIndex)
                b[delIndex] = a[delIndex + 1];
            else if (i == a.length && i == delIndex)
                b[i - 1] = a[i];
            else
                b[i - 1] = a[i];

        }
        Arrays.stream(b).forEach(System.out::print);
    }
}

class Multi extends Thread{
    public void run(){
        System.out.println("running");
    }
}