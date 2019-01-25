//Author Uday Dikshit
//Version 1.2.13
//Purpose To merge two sorted arrays into a sorted array.
import java.util.Scanner;
 public class MergeArrays {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of A: ");
        int lengthOfA = scanner.nextInt();
        int[] a = new int[lengthOfA];
        System.out.println("Enter elements of A: ");
        for (int i = 0; i < lengthOfA; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter size of B: ");
        int lengthOfB = scanner.nextInt();
        int[] b = new int[lengthOfB];
        System.out.println("Enter elements of B: ");
        for (int i = 0; i < lengthOfB; i++) {
            b[i] = scanner.nextInt();
        }
        int[] mergedArray = merge(a, b);
        System.out.println("Merged array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
 
    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int indexA = a.length - 1;
        int indexB = b.length - 1;
        for (int i = 0; i < c.length; i++) {
            if (indexA == -1) {
                c[i] = b[indexB];
                indexB--;
            } else if (indexB == -1) {
                c[i] = a[indexA];
                indexA--;
            } else if (a[indexA] > b[indexB]) {
                c[i] = a[indexA];
                indexA--;
            } else {
                c[i] = b[indexB];
                indexB--;
            }
        }
        return c;
    }
 
}