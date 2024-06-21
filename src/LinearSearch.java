public class LinearSearch {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 6, 5, 9, 8, 55, 6, 63, 2, 423, 55, 56 };
        System.out.println(Search(numeros, 6));
        System.out.println(Search("victor", 'V'));
    }

    // search para números inteiros
    static boolean Search(int[] array, int target) {
        if (array.length == 0) {
            return false;
        }

        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // Search para Strings
    static boolean Search(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            // lembrando de garantinr que vai estar minusculo
            char element = Character.toLowerCase(str.charAt(index)); 
            if (element == Character.toLowerCase(target)) {
                return true;
            }
        }
        return false;
    }

}
