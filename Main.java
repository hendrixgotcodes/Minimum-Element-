package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the length of your array");
        System.out.println(findMin(readIntegers(scanner.nextInt())));
        //Notice here,
        // The method readIntegers() takes in the parameter scanner.nextInt() which returns the next integer in the sequence
        //The method findMin() takes in the method readIntegers() as a parameter because it returns an array needed by the findMin()
        //The method findMin() then returns an integers which is the smallest among the integers in the array

    }

    static int[] readIntegers(int count)
    {
        int[] anArray = new int[count];

        for (int i = 0; i < anArray.length; i ++)
        {
            System.out.println("Please Enter a number");

            anArray[i] = scanner.nextInt();
        }
        return anArray;
    }

    static int findMin(int[] anArray)
    {
        int min = 0;
        for (int io = anArray.length-1; io > 0; io--)
        {
            for (int i = 0; i < io; i++)
            {
                if (anArray[i] > anArray[i+1])
                {
                    min = anArray[i];
                }
            }
        }
        return min;
    }

}
