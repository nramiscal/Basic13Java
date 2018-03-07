import java.util.Arrays;
import java.util.ArrayList;

public class JavaBasic13{

    // Print 1-255
    // Print all the integers from 1 to 255.

    public void print1to255(){
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    // Print Ints and Sum 0-255
    // Print integers from 0 to 255, and the sum so far.

    public void printIntsAndSum0to255(){
        int sum = 0;
        for (int i = 0; i <= 255; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum is " + sum);
    }

    // Print Max of Array
    // Print the largest element in a given array, by iterating through it and comparing values.

    public void printMaxOfArray(int[] arr){
        int max = arr[0];

        for (int elem: arr){
            if (elem > max){
                max = elem;
            }
        }
        System.out.println("Max is " + max);
    }

    // Print Odds 1-255
    // Print all odd integers from 1 to 255.

    public void printOdds1to255(){
        for (int i = 1; i <=255; i+=2){
            System.out.println(i);
        }
    }

    // Print Array Values
    // Print all values in a given array by iterating through it.

    // note: for this to work for an array of any type, use Object[] in the method and Integer[] instead of int[] when invoking

    public void printArrayValues(Object[] arr){
        for (Object elem: arr){
            System.out.println(elem);
        }
    }

    // Print Average of Array

    public void printAverageOfArray(int[] arr){
        double sum = 0.0;
        for (int elem: arr){
            sum += elem;
        }
        System.out.println("Average is " + sum/arr.length);
    }

    // Greater than Y
    // Count and print the number of array values greater than a given Y.

    public void numGreaterThanY(int[] arr, int y){
        int count = 0;
        for (int elem: arr){
            if (elem > y){
                count += 1;
            }
        }
        System.out.println("Number of elements greater than " + y + ": " + count);
    }

    // Print Max, Min, Average Array Values
    // Given an array, print max, min and average values.

    public void printMaxMinAverageArrayVals(int[] arr){
        int max = arr[0];
        int min = arr[0];
        double sum = 0.0;

        for (int elem: arr){
            if (elem > max){
                max = elem;
            }
            if (elem < min){
                min = elem;
            }
            sum += elem;
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        System.out.println("Average is " + sum/arr.length);
    }


    // Square Array Values
    // Given an array, square each value in the array.

    public void squareArrVals(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    // Zero Out Array Negative Values
    // Set negative array values to zero.

    public void zeroOutArrayNegativeVals(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Shift Array Values Left
    // Shift array values: drop the first and leave '0' at end.

    public void shiftArrValsLeft(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }

    // Swap String for Array Negative Values
    // Replace any negative array values with 'Dojo'.

    public void swapStringForArrayNegativeVals(int[] arr){
        ArrayList<Object> array = new ArrayList<Object>();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                array.add("Dojo");
            } else {
                array.add(arr[i]);
            }
        }

        System.out.println(array);

    }

}
