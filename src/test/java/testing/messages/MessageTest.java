package testing.messages;

import com.exercise.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MessageTest {
    @Test
     void test_check_that_the_massage_contain_the_correct_log_level1() {
        Logger logger1 = Logger.getInstance();
        logger1.log_message1(Logger.LogLevel.ERROR, "the log level is:");

        boolean expected = true;
        boolean actual = logger1.log_message1(Logger.LogLevel.ERROR,"the log level is:").contains("ERROR");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_check_that_the_massage_contain_the_correct_log_level2() {
        Logger logger2 = Logger.getInstance();
        logger2.log_message1(Logger.LogLevel.INFO, "the log level is:");

        boolean expected = true;
        boolean actual = logger2.log_message1(Logger.LogLevel.INFO,"the log level is:").contains("INFO");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test_check_that_the_massage_contain_the_correct_log_level3() {
        Logger logger3 = Logger.getInstance();
        logger3.log_message1(Logger.LogLevel.VERBOSE, "the log level is:");

        boolean expected = true;
        boolean actual = logger3.log_message1(Logger.LogLevel.VERBOSE,"the log level is:").contains("VERBOSE");

        Assertions.assertEquals(expected, actual);

    }
    @Test
    void test_check_that_the_massage_contain_the_correct_log_level4() {
        Logger logger4 = Logger.getInstance();
        logger4.log_message1(Logger.LogLevel.DEBUG, "the log level is:");

        boolean expected = true;
        boolean actual = logger4.log_message1(Logger.LogLevel.DEBUG,"the log level is:").contains("DEBUG");

        Assertions.assertEquals(expected, actual);

    }
    @Test
    void test_check_that_the_massage_contain_the_correct_log_level5() {
        Logger logger5 = Logger.getInstance();
        logger5.log_message1(Logger.LogLevel.WARNING, "the log level is:");

        boolean expected = true;
        boolean actual = logger5.log_message1(Logger.LogLevel.WARNING,"the log level is:").contains("WARNING");

        Assertions.assertEquals(expected, actual);
    }
    }
