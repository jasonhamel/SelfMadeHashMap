import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNode {
    Node<String, Integer> node;
    @Before
    public void setup() {
        node = new Node<>("grapes", 10000);
    }

    @Test
    public void testNode() {
        Assert.assertNotNull(node);
        Assert.assertEquals("grapes", node.getKey());
        Assert.assertEquals(10000, (int)node.getValue());
        Assert.assertNull(node.getNext());
        node.setValue(65);
        Assert.assertEquals(65, (int)node.getValue());
    }
}
