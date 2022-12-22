package com.rest.application;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        //TODO: factorial
        /*int n = factorial(4);
        System.out.println(n);*/

        //TODO: max num from array
       /* int[] a = {1,2,3,6,5};
        System.out.println(getMax(a));*/

        /*//TODO: remove alternate numbers from list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(removeElements(list));*/

      /*  //TODO: reverse a string
        String s = "maximum";
        System.out.println(reverseAString(s));*/

       /* //TODO: check if list contains odd numbers
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        System.out.println(checkListISOdd(list));*/

        /*//TODO: 2nd largest element in array
        int[] a = {5,2,7,0,8};
        System.out.println(getSecondLargestNum(a));*/

       /* //TODO: find the frequency of a digit in an number
        System.out.println(findFrequecncy(1223444,2));*/

        /*//TODO: Toggle the case of every characcter of a string
        System.out.println(toggleEveryChar("aPpLe"));*/

       /* //TODO: count vowels and consonants in the string
//        System.out.println(countVowelsAndConsonants("seiob"));
        Arrays.stream(countVowelsAndConsonants("seiob")).forEach(l-> System.out.print(l + "----"));*/

       /* //TODO: rotate a array by 1
        Integer[] a = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(rotateArrayByOne(a)).forEach(l -> System.out.print(l));
*/
        //TODO Pyramid of characters
//        pyramidOfChar();

        //TODO subarray with given sum
        /*int[] arr = {1,2,3,7,5};
        Practice.subarraySum(arr, 5, 12).stream().forEach(System.out::print);*/

        //TODO Missing number
        /*int[] arr = {2, 3, 1, 4};
        System.out.println(Practice.missingNumber(arr, 5));*/

        //TODO star pattern
//        starPattern(6);

        //TODO Reverse array in groups
     /*   int[] arr = {1,2,3,4};
        reverseArray(arr,3);*/

        //TODO count the characters in the string and print only values > 1
//        countCharacters("My name is Mohammed Rahamathulla");

        //TODO find the missing number
        int[] arr = {1,2,3,4,6};
        findMissingNumber(arr,6);
    }

    private static void findMissingNumber(int[] arr, int length) {
        int miss = 0;
        for(int i=1;i<length-1;i++){
            if(arr[i] - arr[i-1]!=1)
                miss = arr[i] - 1;
            else
                miss = length;
        }
        System.out.println(miss);


    }

    private static void countCharacters(String str) {

        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            else
                map.put(str.charAt(i), 1);
        }

       map.entrySet().stream().filter(m->m.getValue()>1).forEach(k-> System.out.println(k.getKey() + "-->"+ k.getValue()));
    }

    private static void reverseArray(int[] arr, int k) {
        Integer[] a = new Integer[arr.length];
        for(int i=k-1,j=0;i>=0;i--,j++)
            a[j] = arr[i];
        for(int i=arr.length-1,j=k;i>k-1;i--,j++)
            a[j] = arr[i];

        Arrays.stream(a).forEach(System.out::println);
    }

    private static void starPattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
                System.out.print(" *");
            System.out.println();
        }
    }

    static int missingNumber(int array[], int n) {
        int a[] = new int[n];
        int temp = 0, j = 0;

        if (n == 2) {
            if (array[0] == 1)
                temp = 2;
            else
                temp = 1;
        } else {
            Arrays.sort(array);

            for (int i = 0; i < n; i++) {
                if (i + 1 == array[i])
                    a[i] = array[i];
                else {
                    temp = i + 1;
                    break;
                }
            }
        }
        return temp;
    }


    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int sum = 0, temp = 0;
        for (int j = i; j < n; j++) {
            sum += arr[j];
            if (sum == s) {
                temp = j;
                break;
            } else if (sum > s) {
                sum = 0;
                i++;
                j = i;
            }
        }

//        for(int k=i+1;k<=temp;k++)
        list.add(i);
        list.add(temp);
        return list;
    }

    private static void pyramidOfChar() {

        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static Integer[] rotateArrayByOne(Integer[] a) {
        int temp = a[a.length - 1];
        int j = a.length - 1;
        for (int i = j; i > 0; i--) {
            a[i] = a[i - 1];
            j--;
        }
        a[0] = temp;

        return a;
    }


   /* private static Integer[] countVowelsAndConsonants(String s) {

        int countConsonants = 1;
        int countVowels = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c)!=null){
                map.put(c,map.get(c)+1);
            } else
                countConsonants = countConsonants + 1;
        }
        for (int i = ; i < map.size(); i++) {
            countVowels+=map.get('a');
        }
        Integer[] total = new Integer[2];
        total[0] = countConsonants;
        total[1] = countVowels;
        return total;
    }*/

    private static String toggleEveryChar(String s) {
        System.out.println(s.length());
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32));
            } else
                sb.append(c);

        }
        return sb.toString();
    }

    private static int findFrequecncy(int i, int i1) {
        int count = 0;
        while (i > 0) {
            int j = i % 10;
            if (i1 == j)
                count = count + 1;
            i = i / 10;
        }
        return count;
    }

    private static int getSecondLargestNum(int[] a) {
        int max = a[0];
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                min = max;
                max = a[i];
            } else if (min < a[i])
                min = a[i];

        }
        return min;
    }

    private static boolean checkListISOdd(List<Integer> list) {

        boolean flag = false;
        flag = list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList()).isEmpty();
        return flag;
    }

    private static String reverseAString(String s) {

        char[] c = s.toCharArray();
        char[] c1 = new char[s.length()];
        int j = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            c1[j] = c[i];
            j++;
        }


        return new String(c1);
    }

    private static List<Integer> removeElements(List<Integer> list) {

        for (int i = list.size() - 2; i >= 0; i = i - 2) {
            list.remove(i);
        }

        return list;
    }

    private static int getMax(int[] a) {

        int max = a[0];

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    private static int factorial(int i) {

        if (i == 1)
            return 1;
        else
            return i * factorial(i - 1);
    }
}
