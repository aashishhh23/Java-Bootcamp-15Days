public class Ex8 {
    public static void main(String[] args) {
        // Write a program which displays a string with a space after each character.
        // Example :- ab cd = a b  c d

        // HINT :- charAt() method

        // Solution :- 1] Iterate over the string using a loop
        //             2] Display each character concatenated with a space.

        String str = "ab cd";

                for(int i = 0; i <= str.length() -1; i++)
        System.out.print(str.charAt(i) + " ");
    }
}
