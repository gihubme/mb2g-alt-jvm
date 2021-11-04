
public class JavaHelloWorldTest {
    public void testGetHello() { //pojo style tests
        JavaHelloWorld h=new JavaHelloWorld();
        assert(h.getHello().equals("Hello World"));
    }
}