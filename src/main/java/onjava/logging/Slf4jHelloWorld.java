package onjava.logging;

// slf4j-api-1.7.36 package
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jHelloWorld {
    public static void main(String[] args) {
        // to really log successfully, need to provide slf4j binding
        Logger logger = LoggerFactory.getLogger(Slf4jHelloWorld.class);
        logger.info("Hello, World");
    }
}
