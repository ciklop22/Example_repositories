import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class ExampleTest {
    @Test
    void exampleTest() {
        Assertions.assertTrue( new Random().nextInt()>1);
    }

}



