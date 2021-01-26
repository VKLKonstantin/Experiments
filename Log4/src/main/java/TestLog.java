
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestLog {

    public static void main(String[] args) throws IOException {
      /*  BasicConfigurator.configure();
       //PropertyConfigurator.configure("src/main/resources/log4j.properties");
        Logger admin=Logger.getLogger("admin");
        admin.info("This is info");
        admin.warn("This is warn");
        admin.error("This is error");
        admin.fatal("This is fatal");

        Logger file = Logger.getLogger("file");

        file.info("This is info");
        file.warn("This is warn");
        file.error("This is error");
        file.fatal("This is fatal");*/
        Logger logger = (Logger) LogManager.getLogger();
        logger.info("1");
        logger.warn("2");
        logger.error("3");

        Files.readAllBytes(Paths.get("src/1"));


    }
}
