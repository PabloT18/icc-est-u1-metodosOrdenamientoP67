
public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 10, 0, -5, 5, 15, 2 };
        System.out.println("Estudiante Pablo Torres");

        // CREAR LA CLASE == INSTANCIAR LA CLASE CON VALOR
        System.out.println("Array Original:");
        // SortBubble claseSortBubble = new SortBubble();=
        // claseSortBubble.printArray(numeros); // IMPRIME

        // claseSortBubble.sortAscendente(numeros);
        // System.out.println("Ordenado Ascendente:");
        // claseSortBubble.printArray(numeros); // IMPRIME

        // claseSortBubble.sortDescendente(numeros);
        // System.out.println("Ordenado Descendente:");
        // claseSortBubble.printArray(numeros); // IMPRIME\\

        // SELECTION
        SortSelection claseSortSelection = new SortSelection();
        System.out.println("Metodo Seleccion");
        System.out.println("Original");
        claseSortSelection.printArray(numeros);
        claseSortSelection.sortAscendente(numeros);
        System.out.println("Ordenado Ascendente");
        claseSortSelection.printArray(numeros);
        System.out.println("Ordenado Descendente");
        claseSortSelection.sortDescendente(numeros);
        claseSortSelection.printArray(numeros);

    }
}
