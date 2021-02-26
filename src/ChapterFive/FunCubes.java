package ChapterFive;

public class FunCubes {
    public static void main(String[] args){
        /*int counter = 1000;

        while(counter >= 1){
            System.out.printf("%d ", counter * counter * counter);
            counter--;
        }

        int counter = 1;

        while(counter <= 10){
            System.out.printf("%d ", counter * counter * counter);
            counter++;
        }*/

        int count = 0;
        int check = 1;
        for(int i = 7; i <= 77; i += 7){
            System.out.println(i);
            System.out.println( check++);
        }
        count++;
    }
}
