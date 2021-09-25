package com.person;

import java.util.Scanner;

public final class PersonClient extends AbstractPerson{

    public int a;

    Scanner in = new Scanner(System.in);
    String name = in.nextLine();

    public PersonClient()
    {
    }

    @Override
    public String think(){
        th = "Я клиент компании";
        return th;
    }

    @Override
    public String getName(int n)
    { return name;}

    public String service()
    {
        String s1;
        s1 = "1) massage\n2) fitness room";
        return s1;
    }


    public float price()
    {
        float p1, p2;
        p1 = 10;
        p2 = 1000;
        a = in.nextInt();
        if (a<1 || a>2) {
            try {
                throw new PersonException("Service is incorrect");
            } catch (PersonException e) {
                e.printStackTrace();
            }
        }
        if(a == 1)
        {
            return p1;
        }
        else
        {
            return p2;
        }
    }
}
