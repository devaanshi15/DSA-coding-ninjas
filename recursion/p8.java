

public class p8 {

    public static boolean isPalindrome(String s) {
        // Base case: if the string is empty or has only one character, it's a palindrome
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        // Check the first and last characters
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Recursively check the substring that excludes the first and last characters
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String testString = "racecar"; // example string
        System.out.println(isPalindrome(testString)); // should print true

        testString = "hello";
        System.out.println(isPalindrome(testString)); // should print false
    }
}
