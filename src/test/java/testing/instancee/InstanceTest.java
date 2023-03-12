package testing.instancee;

import com.exercise.Logger;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;

public class InstanceTest {
    @Test
    @Disabled
     void test_same_instance() {
        Logger sing1 =  Logger.getInstance();
        Logger sing2 =  Logger.getInstance();

        boolean expected = true;
        boolean actual = sing1.hashCode() == sing2.hashCode();

        Assertions.assertEquals(expected, actual);
    }
}
