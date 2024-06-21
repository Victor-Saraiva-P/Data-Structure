public class LinearSearch {
    public static void main(String[] args) {
        int[][] numeros = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        System.out.println(Search(numeros, 4));
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
        int min = Integer.MAX_VALUE; // caso esteja vazia esse será o valor retornado

        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    static boolean Search(int[][] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int[] row : arr) {
            for (int collum : row) {
                if (collum == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;

        for (int[] row : arr) {
            for (int collum : row) {
                if (collum < min) {
                    min = collum;
                }
            }
        }
        return min;
    }
}
