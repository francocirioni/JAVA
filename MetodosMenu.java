import java.util.Scanner;

public class MetodosMenu {

    public static void main(String[] args) {

        Scanner opciones = new Scanner(System.in);
        Scanner alto = new Scanner(System.in);
        Scanner ancho = new Scanner(System.in);
        Scanner ini = new Scanner(System.in);
        Scanner fina = new Scanner(System.in);

        boolean salir = false;
        int[][] matriznueva = null;

        while (!salir) {

            System.out.println("Dame una opción:");
            int opcion = opciones.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el alto:");
                    int a = alto.nextInt();
                    System.out.println("Ingresa el ancho:");
                    int b = ancho.nextInt();
                    System.out.println("Ingresa el número mínimo:");
                    int c = ini.nextInt();
                    System.out.println("Ingresa el número máximo:");
                    int d = fina.nextInt();
                    matriznueva = crearMatriz2(a, b);
                    llenarMatriz(matriznueva, c, d);
                    System.out.println("Matriz creada:");
                    imprimirMatriz2(matriznueva);
                    break;
                case 2:
                    if (matriznueva != null) {
                        System.out.println("Matriz actual:");
                        imprimirMatriz2(matriznueva);
                    } else {
                        System.out.println("No has creado una matriz aún.");
                    }
                    break;
                case 3:
                    if (matriznueva != null) {
                        int suma = sumarElementos(matriznueva);
                        System.out.println("La suma de los elementos es: " + suma);
                    } else {
                        System.out.println("No has creado una matriz aún.");
                    }
                    break;
                case 4:
                    if (matriznueva != null) {
                        int masGrande = obtenerMayor(matriznueva);
                        System.out.println("El número más grande es: " + masGrande);
                    } else {
                        System.out.println("No has creado una matriz aún.");
                    }
                    break;
                case 5:
                    if (matriznueva != null) {
                        int masChico = obtenerMenor(matriznueva);
                        System.out.println("El número más pequeño es: " + masChico);
                    } else {
                        System.out.println("No has creado una matriz aún.");
                    }
                    break;
                case 10:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        opciones.close();
        alto.close();
        ancho.close();
        ini.close();
        fina.close();
    }

    private static int[][] crearMatriz2(int alto, int ancho) {
        return new int[alto][ancho];
    }

    private static void llenarMatriz(int[][] matriz, int inicio, int finaliza) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (finaliza - inicio + 1)) + inicio;
            }
        }
    }

    private static void imprimirMatriz2(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    private static int sumarElementos(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        return suma;
    }

    private static int obtenerMayor(int[][] matriz) {
        int mayor = Integer.MIN_VALUE;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento > mayor) {
                    mayor = elemento;
                }
            }
        }
        return mayor;
    }

    private static int obtenerMenor(int[][] matriz) {
        int menor = Integer.MAX_VALUE;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento < menor) {
                    menor = elemento;
                }
            }
        }
        return menor;
    }
}


// 1. Generar matriz.

// 2. Mostrar matriz.

/// 3. Sumar todos los elementos de la matriz.

// 4. Imprimir número más grande.

// 5. Imprimir número más pequeño.

// 6. Imprimir cantidad de números pares.

// 7. Imprimir cantidad de números impares.

// 8. Imprimir una matriz en orden inverso.

// 9. Imprimir transposición de la matriz.

// 10. Salir.