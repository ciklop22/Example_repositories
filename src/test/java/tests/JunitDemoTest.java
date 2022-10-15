package tests;

import org.junit.jupiter.api.*;

public class JunitDemoTest {

    @BeforeAll
    static void setUp() {
        System.out.println("###  @BeforeAll() !");

    }
    @AfterAll
    static void tearDown() {
        System.out.println("###     @AfterAll() !");
    }
    @BeforeEach
    void beforeEachTest() {
        // open("youtube.com");
        System.out.println("###        @BeforeEach() !");

    }
    @AfterEach
    void afterEachTest() {
        System.out.println("###        @AfterEach () !");

    }


    @Test
    void simpleTestFirst() {
        System.out.println("###  @TestFirst() !");
        Assertions.assertTrue(3>1);
    }

    @Test
    void simpleTestSecond() {
        System.out.println("###  @TestSecond() !");
        Assertions.assertTrue(3>1);
    }
}
