package ChapterEight;

public class Rectangle {
    float length = 1;
    float width = 1;
    float perimeter;
    float area;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if(length > 0.0 && length < 20.0) {
            this.length = length;
        }
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if(length > 0.0 && length < 20.0) {
            this.width = width;
        }
    }

    public float calculatePerimeter(float length, float width) {
        return perimeter = 2 * (length + width);
    }

    public float calculateArea(float length, float width) {
        return area = length * width;
    }
}
