package Tkachenko.Lab6;

import java.util.LinkedList;
import java.util.Queue;
import java.lang.String;

public class Main {
    public static void main(String[]args){
        String one = "13579";
        String two = "24680";
        Game(one,two);
    }

    public static void Game(String one, String two){
        Queue<Integer> q1 = new LinkedList();
        Queue<Integer> q2 = new LinkedList();
        for(int i = 0; i<one.length() ; i++){
            q1.add(one.charAt(i)-'0');
            q2.add(two.charAt(i)-'0');
        }
        int n = 0, a ,b;
        while(!q1.isEmpty() && !q2.isEmpty()) {
            n++;
            a = q1.peek();
            b = q2.peek();
            q1.remove();
            q2.remove();
            if ((a > b && a != 9 && b != 0) || a == 0 && b == 9) {
                q1.add(a);
                q1.add(b);
            } else {
                q2.add(b);
                q2.add(a);
            }
            if (n == 106) {
                System.out.println("botva");
                break;
            }
            if(q1.isEmpty()){
                System.out.println("second "+n);
            } else if(q2.isEmpty()) System.out.println("first "+n);
        }
    }
}
