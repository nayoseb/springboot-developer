import org.junit.jupiter.api.*;

public class JUnitCycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    void test1() {
        System.out.println("@Test1");
    }

    @Test
    void test2() {
        System.out.println("@Test2");
    }

    @Test
    void test3() {
        System.out.println("@Test3");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }
}
