public class sorting {
    static void BubbleSort(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length - 1; j++) {
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] angka = {9, 8, 7, 4, 10, 12,};
        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka ke" + i + "=" + angka[i]);
        }
        System.out.println("");
        BubbleSort(angka);
        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka ke" + i + "=" + angka[i]);
        }
    }
}