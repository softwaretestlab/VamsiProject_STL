package JavaLearning;

import org.junit.Test;

public class AT14_TrimLearning {

    @Test
    public void TrimLearn(){
        String MyName = "    TestLab   ";
        System.out.println("MyName : "+MyName );
        //leading and trailing space removed by Trim
        System.out.println("MyName : " + MyName.trim());
    }
}
