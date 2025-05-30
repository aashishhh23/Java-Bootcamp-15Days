public class Ex10 {
    public static void main(String[] args) {
        // Write a program which finds if a string is a palindrome string or not.
        // A palindrome string is read the same starting from the start or the end.
        // Examples:-aba, noon, 12321

        String str = "noon";


//        int j = str.length() -1;  // Keep inside the for loop

        boolean isPalindrome = true;
        for (int i =0, j = str.length() -1; i < j; i++ , j--)  {
            if (str.charAt(i)== str.charAt(j))
            continue;

            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome ? "palindrome" : "not palindrome");





    }
}
