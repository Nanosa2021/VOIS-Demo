package CommonClasses;

import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.File;
import java.io.FileInputStream;

public class Property {

    /**
     * gets string data from any properties file on given path
     */
    public static String getProperty(String key)
    {
        return getProperties().getString(key);
    }

    /**
     * gets properties
     */
    public static PropertiesConfiguration getProperties() {
        PropertiesConfiguration props = new PropertiesConfiguration();
        try {
            File propsFile = new File("src//main//resources//config.properties");
            FileInputStream inputStream = new FileInputStream(propsFile);
            props.load(inputStream);
            inputStream.close();
        } catch (Exception e) {
            return null;
        }
        return props;
    }



}
