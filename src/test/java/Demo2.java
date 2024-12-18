import org.testng.annotations.Test;

import java.io.IOException;

public class Demo2 {
    @Test
    public void Test1() throws IOException {
        Config cf=new Config();
        System.out.println(cf.returnValue("url"));
    }
}
