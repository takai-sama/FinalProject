package stepDef;

import io.cucumber.java.*;

import static helper.utility.quitDriver;
import static helper.utility.startDriver;


public class Hooks {
    @BeforeAll
    public static void setUp(){

    }
    @AfterAll
    public static void tearDown(){

    }

    @Before
    public void beforeTest(){
        startDriver();
    }
    @After
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
