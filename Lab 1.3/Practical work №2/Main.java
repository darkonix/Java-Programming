package com.company;
import java.util.Scanner;

public class Main extends Author {

    public Main(String n, String e, char g) {
        super(n, e, g);
    }

    public static void main(String[] args) {
        Author a1 = new Author("Lev Tolstoi", "ltolstoi@gmail.com", 'm');
        System.out.println(a1);
    }

}
