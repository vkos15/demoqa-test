package ru.vkost;

import org.junit.jupiter.api.*;

public class DemoQATest {
@BeforeEach
void beforeEach(){
    System.out.println("beforetest\n");
}

    @AfterEach
    void afterEach(){
        System.out.println("aftertest\n");
    }


    @BeforeAll
   static void beforeAll(){
        System.out.println("beforeall\n");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterall\n");
    }


    @Test
    void firstTest(){
        System.out.println("i love\n");
    }
    @Test
    void secondTest(){
        System.out.println("i love\n");
    }
}
