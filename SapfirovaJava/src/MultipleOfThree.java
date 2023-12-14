public class MultipleOfThree {
    public static void main(String[] args) {
        int[] array = {5, 8, 6, 14, 18, 21, 17, 33, 24, 16};

        for (int i = 0; i < array.length; i++ ) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}

