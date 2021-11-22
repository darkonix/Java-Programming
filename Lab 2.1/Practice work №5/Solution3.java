package Tkachenko.Lab21;

public class Solution3 {
    public void recursion(int a, int b) {
        System.out.print(a + " ");

        if(a == b)
        {
            System.out.print("\n");
            return;
        }
        else if (a < b)
            recursion(a+1, b);
        else
            recursion(a-1, b);
    }
}
