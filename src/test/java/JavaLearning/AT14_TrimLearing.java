package JavaLearning;

import org.junit.Test;

public class AT14_TrimLearing {
    @Test
    public void TrimLearn(){
        String MyName = "            SoftwareTestLab          ";
        System.out.println("MyName is : "+ MyName);
        //Trim will remove front and back spaces
        System.out.println("trimmed MyName is : "+ MyName.trim());
    }
}
