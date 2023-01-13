package JavaLearning;

import org.junit.Test;

public class AT15_UserDir {
    @Test
    public void UserDirectory(){
        System.out.println(System.getProperty("user.dir"));
        // C:\Users\softw\IdeaProjects\VamsiProject_STL\src\test\java\JavaLearning\ScreenShot.png
        System.out.println(System.getProperty("user.dir")+"\\src\\test\\java\\JavaLearning\\ScreenShot.png");
    }
}
