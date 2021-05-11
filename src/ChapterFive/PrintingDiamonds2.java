package ChapterFive;

public class PrintingDiamonds2 {
    public void printDiamond() {
        int spaces = 9;
        int stars = 1;
        int lines = 9;
        int div = lines / 2 + 1;

        for(int i = 1; i <= lines; i++){
            for(int s = spaces; s > 0; s--){
                System.out.print(" ");
            }
            for(int a = stars; a > 0; a--){
                System.out.print("* ");
            }
            System.out.println();
            if(i < div){
                spaces -= 2;
                stars += 2;
            }
            else if(i >= div){
                spaces += 2;
                stars -= 2;
            }
        }

    }
}
