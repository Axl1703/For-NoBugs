package practice_12;

public class DebugTask4 {
    static void main(String[] args) {
        System.out.println(isPalindrome("Лепс спел"));
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString().toLowerCase();
        return str.toLowerCase().equals(reversed);
    }
}
