public class SortSelection {

    public SortSelection() {
    }

    public void sortAscendente(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int posMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[posMenor]) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                int temp = numeros[i];
                numeros[i] = numeros[posMenor];
                numeros[posMenor] = temp;
            }
        }
    }

    public void sortDescendente(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int posMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[posMenor]) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                int temp = numeros[i];
                numeros[i] = numeros[posMenor];
                numeros[posMenor] = temp;
            }
        }
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
