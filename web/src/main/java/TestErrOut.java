import org.apache.log4j.Logger;
public class TestErrOut{
        private static final Logger logger = Logger.getLogger(TestErrOut.class);

        public static void main(String[] args) {
        logger.debug(" This is debug!!!");
        logger.info(" This is info!!!");
        logger.warn(" This is warn!!!");
        logger.error(" This is error!!!");
        logger.fatal(" This is fatal!!!");
        }

        }

