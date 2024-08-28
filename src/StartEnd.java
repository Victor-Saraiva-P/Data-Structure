import java.util.Arrays;

public class StartEnd {
    public static void main(String[] args) {
        // int[] arryNumeros = { 5, 7, 7, 8, 8, 10 };
        int[] arryNumeros = { 5, 7, 10, 10, 10, 11 };
        int num = 10;

        arryNumeros = searchStartEnd(arryNumeros, num);
        System.out.println(Arrays.toString(arryNumeros));
    }

    static int[] searchStartEnd(int[] arr, int alvo) {
        int[] resposta = { -1, -1 };

        int comeco = 0;
        int fim = arr.length - 1;

        while (comeco <= fim) // repetir o loop até o começo ser maior que o fim, logo a array toda foi
                              // percorrida
        {
            int mid = comeco + ((fim - comeco) / 2);

            if (arr[mid] == alvo) {
                // pegar o inicio
                resposta[0] = mid; // possivel resposta
                int left = mid;
                while (left != -1) {

                    int[] newArray = Arrays.copyOfRange(arr, 0, left);

                    left = buscaBinaria(newArray, alvo);
                    if (left != -1) {
                        resposta[0] = left;
                    }
                }

                resposta[1] = mid;
                int right = mid;
                while (right != -1) {
                    int[] newArray = Arrays.copyOfRange(arr, right + 1, arr.length);
                    right = buscaBinaria(newArray, alvo);
                    if (right != -1) {
                        resposta[1] = right;
                        right+=right;
                    }
                }
            }

            if (alvo < arr[mid]) // o alvo está a esquerda da array?
            {
                fim = mid - 1;
            } else if (arr[mid] < alvo) // o alvo então está na direita array?
            {
                comeco = mid + 1;
            }

        }
        return resposta;
    }

    static int buscaBinaria(int[] arr, int alvo) {
        int comeco = 0;
        int fim = arr.length - 1;

        while (comeco <= fim) // repetir o loop até o começo ser maior que o fim, logo a array toda foi
                              // percorrida
        {
            int mid = comeco + ((fim - comeco) / 2);

            if (arr[mid] == alvo) {
                return mid;
            }

            if (alvo < arr[mid]) // o alvo está a esquerda da array?
            {
                fim = mid - 1;
            } else if (arr[mid] < alvo) // o alvo então está na direita array?
            {
                comeco = mid + 1;
            }

        }
        return -1;
    }
}
