package Tkachenko.Lab21;

public class Solution1 {
    public void recursion(int n, int curN) {
        if(n < curN)
            return;

        for (int i = 0; i < curN; i++)
            System.out.print(curN);
        System.out.println();

        recursion(n, curN + 1);
    }
}
