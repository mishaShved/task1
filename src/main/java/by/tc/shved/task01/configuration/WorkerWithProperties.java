package by.tc.shved.task01.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorkerWithProperties {// и как я должна понять, где мне этот класс приенять, он настолько глобален?

    private static WorkerWithProperties ourInstance;
    private String fileName;

    private WorkerWithProperties() throws IOException{

        Properties props = new Properties();
        props.load(new FileInputStream(new File("src/main/resources/properties.ini")));// хардкодим путь к src...
        // вот ты задумался, как твоя программа будет выполняться без IDE, ведь уже не будет src каталога
        fileName = props.getProperty("FILE_NAME");

    }

    public static WorkerWithProperties getOurInstance() throws IOException{

        if (ourInstance == null) {
            return ourInstance = new WorkerWithProperties();
        }else {
            return ourInstance;
        }
    }

    public String getFileName() {
        return fileName;
    }
}
