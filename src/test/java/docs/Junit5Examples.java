package docs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5Examples {
    @BeforeAll
    static void cheese() {
        System.out.println("cheese here");
    }

    @BeforeEach
    void each() {
        System.out.println("each here");
    }

    @Test
    void someTest() {
        System.out.println("someTest here");
    }

    @Test
    void anotherTest() {
        System.out.println("anotherTest there");
    }
}
