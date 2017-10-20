import junit.framework.TestCase;

public class TriangleTest extends TestCase {
    public void testConstructor() {
        Triangle triangle = new Triangle(3, 5, 7);

        assertTrue(triangle.getA() == 3);
        assertTrue(triangle.getB() == 5);
        assertTrue(triangle.getC() == 7);
    }

    public void testIsValid() {
        Triangle t = null;

        t = new Triangle(-5, 3, 7);
        assertFalse(t.isValid());

        t = new Triangle(3, 5, 7);
        assertTrue(t.isValid());
    }
}
