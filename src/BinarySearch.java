public class BinarySearch {
    public static void main(String[] args) {
        int[] arryOrdenada = { 5, 7, 10, 10, 10, 11  };
        int[] arryOrdenada2 = { 5, 7, 10, 10, 11  };
        int numero = 10;

        System.out.println(buscaBinaria(arryOrdenada, numero));
        System.out.println(buscaBinaria(arryOrdenada2, numero));
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
