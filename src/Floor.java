public class Floor {
    public static void main(String[] args) {
        int[] arryOrdenada = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        System.out.println(findCeiling(arryOrdenada, 21));
    }

    static int findCeiling(int[] arr, int alvo) {
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
                return arr[mid];
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

        return arr[fim]; // recebe o valor do ceiling, pois o comeco vai marcar o ceiling do número
    }
}
