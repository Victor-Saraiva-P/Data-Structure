public class LinearSearch {
    public static void main(String[] args) {
        int[] numeros = {};
        System.out.println(linearSearch(numeros, 6));
    }

    // search in the array, return if the item is found
    // otherwise if not found return -1
    static int linearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }

        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
