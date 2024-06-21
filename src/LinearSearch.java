public class LinearSearch {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 6, 5, 9, 8, 55, 6, 63, 2, 423, 55, 56 };
        System.out.println(Search(numeros, 6));
        System.out.println(Search("victor", 'v'));
    }

    // search para números inteiros
    static boolean Search(int[] array, int target) {
        if (array.length == 0) {
            return false;
        }

        for (int number : array) {
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

        for (char character : str.toCharArray()) {
            if (character == target) {
                return true;
            }
        }
        return false;
    }

}
