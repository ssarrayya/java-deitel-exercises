package hackerranksolutions.thirtydaysofcode.day13;

/*
Abstract Classes
Link to problem: https://www.hackerrank.com/challenges/30-abstract-classes/problem?isFullScreen=true
 */

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        String author = input.nextLine();
        int price = input.nextInt();
        MyBook book = new MyBook(title, author, price);
        book.display();
    }
}

class MyBook {
    private String title;
    private String author;
    private int price;

    public MyBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
