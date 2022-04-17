
import org.junit.Test;
import static org.junit.Assert.fail;

public class AVLTree_Bug {
    public static boolean debug = false;

    @Test
    public void test2() throws Throwable {
        AVLTree treetest = new AVLTree();
        treetest.insert(5);
        treetest.insert(0);
        try {
            treetest.delete(5);
        } catch (NullPointerException ex) {
            fail("Expected exception was thrown");
        }
    }
}
