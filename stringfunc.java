import java.util.*;

class stringfunc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");

        String s = sc.nextLine();

        System.out.println(s);

        System.out.println("character at 6th location" + s.charAt(6));
        System.out.println("length" + s.length());
        System.out.println("uppercase" + s.toUpperCase());
        System.out.println("lower case" + s.toLowerCase());
        System.out.println("string starts with" + s.startsWith("Hello"));
        System.out.println("string ends with" + s.endsWith("ava"));
        System.out.println("string contains" + s.contains("Hello"));
        System.out.println("string index" + s.indexOf("H"));
        System.out.println("subrtring of 7" + s.substring(0, 7));

    }
}
