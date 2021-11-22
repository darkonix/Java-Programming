package Tkachenko.Lab21;

public class Solution2 {
    public void recursion(int n) {
        if (n > 1) recursion(n-1);
        System.out.println(n);
    }
}
