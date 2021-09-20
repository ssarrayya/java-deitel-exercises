package ChapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle();
    }

    @Test
    void createARectangle() {
        assertEquals(1, rectangle.getWidth());
        assertEquals(1, rectangle.getLength());
    }

    @Test
    void calculatePerimeterOfRectangle() {
        assertEquals(2 * (3 + 5), rectangle.calculatePerimeter(3, 5));
    }

    @Test
    void calculateAreaOfRectangle() {
        assertEquals(3 * 5, rectangle.calculateArea(3, 5));
    }
}
