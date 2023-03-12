package testing.count;

import com.exercise.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class CounterTest {
    @Test
    @Disabled
     void test_check_that_count_is_correct() {
        Logger logger1 =  Logger.getInstance();
        logger1.log_message(Logger.LogLevel.ERROR,"the log level is:");
        Logger logger2 =  Logger.getInstance();
        logger2.log_message(Logger.LogLevel.INFO,"the log level is:");
        Logger logger3 =  Logger.getInstance();
        logger3.log_message(Logger.LogLevel.INFO,"the log level is:");
        Logger logger4 =  Logger.getInstance();
        logger4.log_message(Logger.LogLevel.INFO,"the log level is:");

        int expected = 3;
        int actual = logger1.get_level_messages_count(Logger.LogLevel.INFO);

        Assertions.assertEquals(expected, actual);
    }

}
