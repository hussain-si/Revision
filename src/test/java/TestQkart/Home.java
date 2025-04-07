package TestQkart;

import Pages.HomePage;
import Pages.RegisterPage;
import Utilities.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Home extends BaseClass
{
    Config C;
    @Test
    public void Test1() throws IOException {
        HomePage HP=new HomePage(driver);
        HP.Searchtext();
        C=new Config();
        Assert.assertEquals(HP.ValidationMessage(), C.getproperties("ValidationMessage07"));

    }

}
