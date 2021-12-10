package Tkachenko.Lab62;

public class Main {
    public static void main(String[] args){
        MyArrayList arr = new MyArrayList();
        arr.add('a');
        arr.add('b');
        arr.add('c');
        arr.add('d');
        System.out.println("Data: " + arr);
        System.out.println("Size: " + arr.size());
        System.out.println("Is empty? " + arr.isEmpty());
        arr.clear();
        System.out.println("Data: " + arr);
    }
}
