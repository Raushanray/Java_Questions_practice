package java_8_functions_questions;

public class ArrayEqualityExample {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 4, 5, 6};

        boolean newArray = areArrayEquals(arr1, arr2);
        System.out.println(newArray);

//        boolean equalsArray = Arrays.equals(arr1, arr2);
//        System.out.println(equalsArray);

    }

    private static boolean areArrayEquals(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
