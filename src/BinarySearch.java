public class BinarySearch {
    public static void main(String[] args) {
        int[] arryOrdenada = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        int[] arryInversa = { 90, 75, 18, 126, 4, 3, 1 };
        int numero = 1;

        System.out.println(buscaBinaria(arryInversa, numero));
        System.out.println(buscaBinaria(arryOrdenada, numero));
    }

    static int buscaBinaria(int[] arr, int alvo) {
        int comeco = 0;
        int fim = arr.length - 1;

        // checar se a array é ascendente ou descendente
        boolean isAsc;

        if (arr[comeco] < arr[fim]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (comeco <= fim) // repetir o loop até o começo ser maior que o fim, logo a array toda foi
                              // percorrida
        {
            int mid = comeco + ((fim - comeco) / 2);

            if (arr[mid] == alvo) {
                return mid;
            }

            if (isAsc) {
                if (alvo < arr[mid]) // o alvo está a esquerda da array?
                {
                    fim = mid - 1;
                } else if (arr[mid] < alvo) // o alvo então está na direita array?
                {
                    comeco = mid + 1;
                }
            } else {
                if (arr[mid] < alvo)// o alvo está a esquerda da array?
                {
                    fim = mid - 1;
                } else if (alvo < arr[mid]) // o alvo então está na direita array?
                {
                    comeco = mid + 1;
                }
            }

        }
        return -1;
    }
}
