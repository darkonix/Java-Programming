package Tkachenko.Lab22;

import java.util.Arrays;

public class MyString {
    private final char c[];

    MyString(char[] c) {
        this.c = c;
    }

    MyString() { c = null; }

    MyString(MyString original) { this.c = original.c; }

    MyString(String original) { this.c = original.toCharArray(); }

    public MyString concat(MyString str) {
        char[] st = new char[str.c.length+this.c.length];
        MyString mst = new MyString(st);
        int count = 0;
        for(int i = 0; i < this.c.length; i++) {
            st[i] = this.c[i];
            count++;
        }
        for(int j = 0; j<str.c.length; j++) {
            st[count++] = str.c[j];
        }
        return mst;
    }

    public void print() {
        for(int i = 0; i < c.length; i++)
        {
            System.out.print(c[i]);
        }
    }

    public char CharAt(int index) {
        return c[index];
    }

    public boolean isEmpty() {
        if (c.length == 0) return true;
        else return  false;
    }

    public MyString trim() {
        int begin = 0;
        int end = c.length;

        for (int i = 0; i < c.length; i++, begin++)
            if(c[i] != ' ') break;

        for (int i = c.length - 1; i >= 0; i--, end--)
            if(c[i] != ' ') break;

        return substring(begin, end);
    }

    public int length() { return c.length; }

    public int compareTo(MyString anotherString) {
        for (int i = 0; i < anotherString.c.length && i < c.length; i++) {
            if(c[i] < anotherString.c[i]) return c[i] - anotherString.c[i];
            else if(c[i] > anotherString.c[i]) return c[i] - anotherString.c[i];
        }

        if(c.length > anotherString.c.length) return 1;
        else if(c.length < anotherString.c.length) return -1;
        else return 0;
    }

    public MyString substring(int begin, int end) {
        if(end > c.length)
            return new MyString();

        int newLength = end - begin;
        char[] newArray = new char[newLength];

        for (int i = begin; i < end; i++) {
            newArray[i - begin] = c[i];
        }

        return new MyString(newArray);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        return Arrays.equals(c, myString.c);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(c);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.c);
    }

}
