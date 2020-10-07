package TechProEd;

import org.junit.*;

public class day08_BeforeAfterMethod {
    @BeforeClass
    public static void setUp(){
        System.out.println("Setup calisti");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("Teardown calisti");
    }

    @Before
    public void methoddanOnce(){
        System.out.println("methoddan önce calisti");
    }
    @Test
    public void test1(){
        System.out.println("Test1 calisti");
    }
    @Test
    public void test2(){
        System.out.println("Test2 calisti");
    }
    @After
    public void methoddanSonra(){
        System.out.println("methoddan sonra calisti");
    }

}
