package JavaLearning;

import org.junit.Test;

public class AT10_ArrayLoop {
    @Test
    public void test14(){
        int[] age = {10,20,30,40,50,60};
        //lenght of array is
        int LengthOfArray = age.length;
        System.out.println("Length of Array is : "+ LengthOfArray); //6
        //for loop
        for(int i=0; i<LengthOfArray; i++){
            System.out.println("Array index is : "+i+" and its value is : "+age[i]);
        }
    }
}
