package pravin;

public class Demo2{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 5, 7, 8, 7};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println("Duplicate element: " + arr[j]);
                    break;
                }
            }
        }

        System.out.println("Total number of duplicates: " + count);
    }
}
