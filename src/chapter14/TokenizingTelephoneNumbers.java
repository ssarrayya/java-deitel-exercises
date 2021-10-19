package chapter14;

/*
14.8 (Tokenizing Telephone Numbers) Write an application that inputs a telephone number as a string in the form
(555) 555-5555. The application should use String method split to extract the area code as a token, the first
three digits of the phone number as a token and the last four digits of the phone number as a token. The seven
digits of the phone number should be concatenated into one string. Both the area code and the phone number
should be printed. Remember that you’ll have to change delimiter characters during the tokenization process.
 */

import java.util.Scanner;

public class TokenizingTelephoneNumbers {
    public static String collectPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your telephone number in the form (555) 555-5555");

        return scanner.nextLine();
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[(]\\d{3}[)]\\s\\d{3}[-]\\d{4}");
    }

    public static void main(String[] args) {
        String telephoneNumber = collectPhoneNumber();

        if(!validatePhoneNumber(telephoneNumber)) {
            System.out.println("Number does not follow the form (555) 555-5555");
        } else {
            String areaCodeSubstring = telephoneNumber.substring(0, 5);
            String[] areaCodeToken = areaCodeSubstring.split("[(]?[)]?");

            String phoneNumberSubstring = telephoneNumber.substring(6);
            String[] phoneNumberToken = phoneNumberSubstring.split("-");

            System.out.println("Area code: ");
            for (String areaCode : areaCodeToken) {
                System.out.print(areaCode);
            }
            System.out.println();

            System.out.println("Phone number: ");
            for (String phoneNumber : phoneNumberToken) {
                System.out.print(phoneNumber);
            }
        }
    }
}
