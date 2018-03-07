import java.util.Arrays;
import java.util.ArrayList;

public class JavaBasic13Test{

    public static void main(String[] args){

        JavaBasic13 jb = new JavaBasic13();

        int[] myArr = {0,1,2,3,4,5,6,7,8,9};
        Integer[] myArr2 = {0,1,2,3,4,5,6,7,8,9};
        String[] myArr3 = {"Nina", "Abby", "Muffins"};
        int[] myArr4 = {-2,5,-7,2,-765,32,8,-5};

        jb.print1to255();
        jb.printIntsAndSum0to255();
        jb.printMaxOfArray(myArr);
        jb.printOdds1to255();
        jb.printArrayValues(myArr2);
        jb.printArrayValues(myArr3);
        jb.printAverageOfArray(myArr);
        jb.numGreaterThanY(myArr,5);
        jb.printMaxMinAverageArrayVals(myArr);
        jb.squareArrVals(myArr);
        jb.zeroOutArrayNegativeVals(myArr4);
        jb.shiftArrValsLeft(myArr4);
        jb.swapStringForArrayNegativeVals(myArr4);
    }
}
