package JavaLearning;

import org.junit.Test;

import java.util.ArrayList;


public class AT11_ArrayList {

    @Test
    public void ArrayList() {
        //syntax of arraylist
        ArrayList<String> ListOfCars = new ArrayList<String>();
        // let add items into arraylist
        ListOfCars.add("BMW");
        ListOfCars.add("Toyota");
        ListOfCars.add("Benz");
        ListOfCars.add("RangeRover");
        ListOfCars.add("Honda");
        System.out.println("Cars inside ArrayList are : "+ ListOfCars);
        //count
        int carsCount = ListOfCars.size();
        System.out.println("carsCount : "+ carsCount); //5
        //for loop
        for(int i=0;i<carsCount;i++){
            System.out.println("Array Index is : "+i+" and its value is : "+ListOfCars.get(i) );

        }
    }
}
