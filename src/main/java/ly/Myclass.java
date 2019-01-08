package ly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Myclass {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Myclass.class);
        System.out.println(logger.getName());
    }
}
