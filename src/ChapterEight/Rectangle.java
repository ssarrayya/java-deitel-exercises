/*
8.4 (Rectangle Class) Create a class Rectangle with attributes length and width, each of which
defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
methods for both length and width. The set methods should verify that length and width are each
floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.
 */

package ChapterEight;

public class Rectangle {
    private float length = 1;
    private float width = 1;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if(length < 0.0 || length > 20.0) {
            throw new IllegalArgumentException("Length is between 0 - 20");
        }
        this.length = length;

    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if(width < 0.0 || width > 20.0) {
            throw new IllegalArgumentException("Width is between 0 - 20");
        }
        this.width = width;
    }

    public float calculatePerimeter(float length, float width) {
        return 2 * (length + width);
    }

    public float calculateArea(float length, float width) {
        return length * width;
    }
}
