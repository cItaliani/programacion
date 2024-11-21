public class piramideClase {
    public static void main(String[] args) {
        /**
         * media piramide alineada a la izquierda
         */
        for (int i = 10; i >= 1; i--) { // este bucle es el contador de columnas
            for (int j = i; j >= 1; j--) { // este es el que hace las filas
                System.out.printf("%2d ", j);
            }
            System.out.println();
        }
        /**
         * piramide alineada derecha
         *
         */
        System.out.println("segunda opción");
        String nulo = " ";
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int o = 1; o <= 10-i; o++) {
                    System.out.printf("%3d", o);
                }
                System.out.println();
            }

               /**
         * piramide cen
         */
        System.out.println("segunda opción");
          nulo = " ";
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int o = 1; o <= 10-i; o++) {
                    System.out.printf("%4d", o);
                }
                System.out.println();
            }
        
    }

    
}