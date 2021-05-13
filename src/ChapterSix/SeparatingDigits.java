package ChapterSix;

public class SeparatingDigits {
    String result = "";
    int rm;

    public int quotients(int a, int b){ return a / b; }

    public int remainder(int a, int b){
        return a % b;
    }

    public String displayDigits(int userInput){

        if(userInput > 0 && userInput <= 99999){
            while(userInput > 0){
               rm = remainder(userInput, 10);
               result =  rm + "  " + result;
               userInput = quotients(userInput, 10);
            }
        }
        return result;
    }
}
