package ChapterEight;

public class Rectangle {
    private float length = 1;
    private float width = 1;

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
        return 2 * (length + width);
    }

    public float calculateArea(float length, float width) {
        return length * width;
    }
}
