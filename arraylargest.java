import java.util.Scanner;

class arraylargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Elements in array are");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        int largest = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("The largest number is " + largest);
    }
}