public class Palindrome {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        if (rev == x)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int n = 72;
        System.out.println(isPalindrome(n));
    }
}
