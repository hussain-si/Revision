import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
    Properties properties;
    FileInputStream fis;
    public Config() throws IOException {

        //create object for properties
         properties = new Properties();

        //FileInputStream
        fis = new FileInputStream("src/test/java/data.properties");

        //load the property file
        properties.load(fis);

    }
    public String returnValue(String data){
       return properties.getProperty(data);
    }


}
