package utils;

import base.BaseTests;
import org.testng.annotations.DataProvider;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class DataUtil extends BaseTests {
    @DataProvider
    public static Object[][] dataProvider() {
        return readYaml("src/main/resources/data1.yaml", "data1");
    }
    @DataProvider
    public static Object[][] dataProvider2() {
        return readYaml("src/main/resources/data1.yaml", "data2");
    }
    @DataProvider
    public static Object[][] dataProvider3() {
        return readYaml("src/main/resources/data1.yaml", "data3");
    }

    private static Object[][] readYaml(String filePath, String yamlObject) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        Yaml yaml = new Yaml();
        Map<String, Object> data = yaml.load(inputStream);

        Object[][] testData = new Object[1][1];
        testData[0][0] = data.get(yamlObject);

        return testData;
    }
}
