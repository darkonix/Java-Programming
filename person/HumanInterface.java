package com.person;

import java.util.Scanner;

public interface HumanInterface {

    Scanner in = new Scanner(System.in);

    String think();
    String getName(int n);
}
