package BTT9;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {

    private static final Logger logger =
            LoggerFactory.getLogger(MathUtils.class);

    public static int max(int a, int b) {
        logger.info("Finding maximum between {} and {}", a, b);

        if (a >= b) {
            logger.debug("Maximum value is {}", a);
            return a;
        }

        logger.debug("Maximum value is {}", b);
        return b;
    }

    public static int divide(int a, int b) {
        logger.info("Dividing {} by {}", a, b);

        if (b == 0) {
            logger.error("Division failed: divisor must not be zero");
            throw new IllegalArgumentException(
                    "Divider must not be zero"
            );
        }

        int result = a / b;

        logger.info("Division result: {}", result);
        return result;
    }
}
