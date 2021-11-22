package Tkachenko.Lab22;

public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString(" Roman ".toCharArray());

        myString = myString.trim();
        System.out.println(myString.length());
        System.out.println(myString.compareTo(new MyString("Roman")));
        myString = myString.concat(new MyString(" Sannikov".toCharArray()));

        myString.print();
        System.out.println(myString);
    }
}
