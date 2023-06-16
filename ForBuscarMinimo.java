public class ForBuscarMinimo {

    public static void main(String[] args) {

        int[] array = { 4, 2, 3, 4, 5, 6, 1 };
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println( minValue);

    }

}
