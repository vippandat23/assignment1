
// import java.util.Scanner;

// public class ArraySum {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the numbers of elments : ");
//         int size = scanner.nextInt();
//         int[] numbers = new int[size];
//         int sum = 0;
//         System.out.println("Enter " + size + " elements:");
//         for (int i = 0; i < size; i++) {
//             numbers[i] = scanner.nextInt();
//         }
//         for (int i = 0; i < size; i++) {
//             sum += numbers[i];
//             scanner.close();
//         }
//         System.out.println("sum = " + sum);
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size: "); // banana ,apple orange ......
//         int size = scanner.nextInt();
//         scanner.nextLine();

//         String[] element = new String[size];
//         System.out.println("Enter " + size + " strings:");
//         for (int i = 0; i < size; i++) {
//             element[i] = scanner.nextLine();
//         }
//         for (int i = 0; i < element.length / 2; i++) {
//             String temp = element[i];
//             element[i] = element[element.length - 1 - i];
//             element[element.length - 1 - i] = temp;
//         }
//         System.out.print("Reversed array: {");
//         for (int i = 0; i < element.length; i++) {
//             System.out.print(element[i]);
//             if (i < element.length - 1) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.println("}");

//         scanner.close();
//     }
// }

// import java.util.Scanner;

// public class Largestarr {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the size of array : ");
// int size = scanner.nextInt();
// if (size <= 0) {
// System.out.println("size > 0.");
// scanner.close();
// return;
// }
// int[] numbers = new int[size];
// System.out.println("Enter " + size + " elements:");
// for (int i = 0; i < size; i++) {
// numbers[i] = scanner.nextInt();
// }
// int large = numbers[0];
// for (int i = 1; i < numbers.length; i++) {
// if (numbers[i] > large) {
// large = numbers[i];
// }
// }
// System.out.println("The largest element is: " + large);
// scanner.close();
// }
// }

// import java.util.Scanner;

// public class Descending {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//            for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] < arr[j]) {  
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }

//         System.out.println("Array in descending order:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         sc.close();
//     }
// }
