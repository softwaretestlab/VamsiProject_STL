package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        obj.encMethod01(20,20);
        obj.encMethod01(60,20);


        int x= obj.encMethod02(50,50);
        int l = x+100;
        System.out.println(" l value is : " + l);

    }
}
