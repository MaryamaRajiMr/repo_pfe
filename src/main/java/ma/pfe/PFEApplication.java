package ma.pfe;

import ma.pfe.controllers.StudentController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PFEApplication {
    private final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);

    public static void main(String[] args) {

//        LOGGER.debug("start application log 1");
//        LOGGER.warn("start application log 2");
//        LOGGER.info("start application log 3");
//        LOGGER.error("start application log 4");
        SpringApplication.run(PFEApplication.class, args);
    }
}