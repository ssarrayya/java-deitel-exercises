package ChapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N    10 * N     100 * N      1000 * N");
        int value = 1;
        while(value <= 5){
            System.out.printf("%d      %d        %d          %d%n", value, 10 * value, 100 * value, 1000 * value);
            value++;
        }
    }

}
