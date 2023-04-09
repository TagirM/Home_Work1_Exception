import java.util.Arrays;

public class Example_4 {
    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 4, 5 };
        int[] array2 = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] array3 = arr(array1, array2);

        System.out.println(Arrays.toString(array3));
    }

    public static int[] arr(int[] array1, int[] array2) {
        int[] new_array = new int[array1.length];
        if (array1.length == array2.length) {
            for (int i = 0; i < array2.length; i++) {
                new_array[i] = array1[i] + array2[i];
            }
            return new_array;
        } else {
            throw new RuntimeException(
                    String.format("Массив длиной %d не равен массиву длиной %d", array1.length, array2.length));
        }

    }
}
