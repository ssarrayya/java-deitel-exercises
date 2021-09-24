/*
6.21 (Separating Digits) Write methods that accomplish each of the following tasks:
a) Calculate the integer part of the quotient when integer a is divided by integer b.
b) Calculate the integer remainder when integer a is divided by integer b.
c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
each pair of digits by two spaces. For example, the integer 4562 should appear as
4 5 6 2
Incorporate the methods into an application that inputs an integer and
calls displayDigits by passing the method the integer entered. Display the results
 */

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
