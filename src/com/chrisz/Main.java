package com.chrisz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Reference vs Value type

        // Value Type
        int myIntValue = 10;
        int anotherIntValue = myIntValue; // works independent of myIntValue

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);
        // variables are not tied to each other

        // Reference Type
        int[] myIntArray = new int[5]; // myIntArray is a reference type, reference in memory
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));
        // both match because they both point to the same space in memory
        // both references point to same array in memory

        modifyArray(myIntArray);
        System.out.println("After method call myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After method call anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5}; // this array is not associated with previously declared arrays
    }
}
