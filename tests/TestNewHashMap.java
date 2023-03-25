import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNewHashMap {
    NewHashMap<String, Integer> nhm;

    @Before
    public void setup() {
        nhm = new NewHashMap<>();
    }

    @Test
    public void testPut() {
        nhm.put("grapes", 10000);
        nhm.put("apples", 10000);
        nhm.put("bananas", 10000);
        nhm.put("melons", 10000);
        nhm.put("pears", 10000);
        nhm.put("dragon fruit", 10000);
        nhm.put("strawberries", 10000);
        nhm.put("blueberries", 10000);
        nhm.put("grapes", 85);
    }

    @Test
    public void testGet() {
        nhm.put("grapes", 10000);
        Assert.assertEquals(10000, (int)nhm.get("grapes"));
        Assert.assertNull(nhm.get("apples"));
        nhm.put("apples", 10000);
        nhm.put("bananas", 10000);
        nhm.put("melons", 10000);
        nhm.put("pears", 10000);
        nhm.put("dragon fruit", 10000);
        nhm.put("strawberries", 10000);
        nhm.put("blueberries", 10000);
        Assert.assertEquals(10000, (int)nhm.get("apples"));
        Assert.assertEquals(10000, (int)nhm.get("bananas"));
        Assert.assertEquals(10000, (int)nhm.get("melons"));
        Assert.assertEquals(10000, (int)nhm.get("pears"));
        Assert.assertEquals(10000, (int)nhm.get("dragon fruit"));
        Assert.assertEquals(10000, (int)nhm.get("strawberries"));
        Assert.assertEquals(10000, (int)nhm.get("blueberries"));
    }

    @Test
    public void testRemove() {
        nhm.put("grapes", 10000);
        nhm.put("apples", 10000);
        nhm.put("bananas", 10000);
        nhm.put("melons", 10000);
        nhm.put("pears", 10000);
        nhm.put("dragon fruit", 10000);
        nhm.put("strawberries", 10000);
        nhm.put("blueberries", 10000);
        nhm.remove("pizza");
    }

    @Test
    public void testKeys() {
        nhm.put("grapes", 10000);
        nhm.put("apples", 10000);
        nhm.put("bananas", 10000);
        nhm.put("melons", 10000);
        nhm.put("pears", 10000);
        nhm.put("dragon fruit", 10000);
        nhm.put("strawberries", 10000);
        nhm.put("blueberries", 10000);
        Assert.assertEquals("dragon fruit, strawberries, apples, bananas, melons, blueberries, grapes, pears", nhm.getKeys());

    }
}