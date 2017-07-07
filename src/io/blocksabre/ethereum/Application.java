/**
 * Created by Andy McCall on 07/07/2017.
 */

package io.blocksabre.ethereum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger logger =
            LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Starting up ethereum.blocksabre.info...");
        SpringApplication.run(Application.class, args);
    }
}
