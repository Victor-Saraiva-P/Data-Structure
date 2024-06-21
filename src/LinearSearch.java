public class LinearSearch {
    public static void main(String[] args) {
        int[] numeros = {55, 6, 63, 2, 423, 55, 56 };
        System.out.println(Search(numeros, 6));
        System.out.println(Search("victor", 'v', 1, 5));
        System.out.println(min(numeros));
    }

    // search para números inteiros
    static boolean Search(int[] array, int target) {
        if (array.length == 0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number == target) {
                return true;
            }
        }
        return false;
    }

    // Search para Strings
    static boolean Search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == target) {
                return true;
            }
        }
        return false;
    }

    // search para números inteiros, com range
    static boolean Search(int[] array, int target, int begin, int end) {
        if (array.length == 0) {
            return false;
        }

        while (begin != end) {
            int number = array[begin];
            if (number == target) {
                return true;
            }
            begin++;
        }
        return false;
    }

    // Search para Strings, com range
    static boolean Search(String str, char target, int begin, int end) {
        if (str.length() == 0) {
            return false;
        }

        while (begin != end) {
            char character = str.charAt(begin);
            if (character == target) {
                return true;
            }
            begin++;
        }
        return false;
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;

        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
