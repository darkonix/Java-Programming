package Tkachenko.Lab21;

public class Main {
    public static void main(String[] args) {
        System.out.print("=== TEST 1 ===");
        Solution1 s1 = new Solution1();
        s1.recursion(5, 0);

        System.out.println("\n=== TEST 2 ===");
        Solution2 s2 = new Solution2();
        s2.recursion(15);

        System.out.println("\n=== TEST 3 ===");
        Solution3 s3 = new Solution3();
        s3.recursion(1, 15);
        s3.recursion(15, 1);
    }
}
