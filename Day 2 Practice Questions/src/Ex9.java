public class Ex9 {
    public static void main(String[] args) {
        // Write a program which displays the reverse of a string.

        // Example :- abcd -> dcba
        // Solution 1:- Iterate over the string from the last character to the first character
        // 2] Display each character

//        String str = "some text";
//
//         for (int i = str.length() - 1; i>=0; i--)
//             System.out.print(str.charAt(i));


        // Reverse the string in a new string called reverse, then display reverse.

        //Example:
//        String str= "abcd";
//        String reverse = ""; ("dcba")

        // Solution :- 1] Iterate over the string from the last character to the first character
        // 2] Concatenate each character to reverse
        // 3] Display reverse.

        String str = "some text";
        String reverse = "";

        for (int i = str.length() - 1; i >=0; i--)
            reverse +=str.charAt(i); //reverse = reverse + str.charAt (i)
        System.out.println(reverse);

    }
}
