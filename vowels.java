import java.util.*;

class stringfunc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        int count = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));

            if (vowels.contains(ch)) {
                count++;
            }
        }

        System.out.println("Number of vowels is: " + count);

        sc.close();
    }
}
