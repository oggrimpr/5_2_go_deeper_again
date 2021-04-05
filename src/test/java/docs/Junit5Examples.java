package docs;

import org.junit.jupiter.api.*;

public class Junit5Examples {
    @BeforeAll
    static void cheese() {
        System.out.println("cheese here");
    }

    @BeforeEach
    void each() {
        System.out.println("    Before each here");
    }

    @AfterEach
    void   afterEach() {
        System.out.println("    After each here");
    }

    @AfterAll
    static void shutdown() {
        System.out.println("afterall here");
    }

    @Test
    void someTest() {
        System.out.println("        someTest here");
    }

    @Test
    void anotherTest() {
        System.out.println("        anotherTest there");
    }
}
