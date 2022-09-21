import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class ExampleTest {
    @Test
    void exampleTest0() {
        Assertions.assertFalse( new Random().nextInt()<=10);
    }
    @Test
    void exampleTest1() {
        Assertions.assertTrue( 3>=2);
    }

}



