package com.example;

import java.util.Scanner;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        LocalDate horaActual = LocalDate.now();

        System.out.println(horaActual);

        System.out.println("---------------------------------------------------------");

        LocalDate fecha2 = LocalDate.of(1997, 07, 16);
        System.out.println(fecha2);

        System.out.println("---------------------------------------------------------");

        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.println("dame un dia");
         * 
         * int dia = scanner.nextInt();
         * 
         * System.out.println("dame un mes");
         * 
         * int mes = scanner.nextInt();
         * 
         * System.out.println("dame un anio");
         * 
         * int an = scanner.nextInt();
         * 
         * LocalDate fecha3 = LocalDate.of(an, mes, dia);
         * 
         * System.out.println(fecha3);
         * 
         */

        System.out.println("---------------------------------------------------------");

        /*
         * Scanner scanner4 = new Scanner(System.in);
         * System.out.println("dame una fecha separada - ");
         * String fecha4 = scanner4.nextLine();
         * LocalDate diaelegido = LocalDate.parse(fecha4);
         * DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         * String fechaformateada =diaelegido.format(formateador);
         * System.out.println(fechaformateada);
         * 
         */

        System.out.println("---------------------------------------------------------");
        /*
         * Scanner scanner4 = new Scanner(System.in);
         * System.out.println("dame una fecha separada - ");
         * String fecha4 = scanner4.nextLine();
         * LocalDate diaElegido = LocalDate.parse(fecha4);
         * LocalDate asumar = LocalDate.of(3, 2, 15);
         * diaElegido = diaElegido.plusYears(asumar.getYear())
         * .plusMonths(asumar.getMonthValue())
         * .plusDays(asumar.getDayOfMonth());
         * System.out.println(diaElegido);
         */

        System.out.println("---------------------------------------------------------");

        /*
         * Scanner scanner6 = new Scanner(System.in);
         * System.out.println("dame una fecha separada - ");
         * String fecha6 = scanner6.nextLine();
         * LocalDate diaElegido6 = LocalDate.parse(fecha6);
         * LocalDate asumar6 = LocalDate.of(3, 2, 15);
         * diaElegido6 = diaElegido6.minusYears(asumar6.getYear())
         * .minusMonths(asumar6.getMonthValue())
         * .minusDays(asumar6.getDayOfMonth());
         * System.out.println(diaElegido6);
         * 
         */
        System.out.println("---------------------------------------------------------");

        /*
         * Scanner scanner7 = new Scanner(System.in);
         * System.out.println("dame una fecha separada - ");
         * String fecha7 = scanner7.nextLine();
         * LocalDate diaElegido7 = LocalDate.parse(fecha7);
         * 
         * System.out.println(diaElegido7.isLeapYear());
         */
        System.out.println("---------------------------------------------------------");

        LocalDate mia = LocalDate.of(1997, 07, 16);
        boolean igual = true;
        LocalDate fechaelegida = null;

        do {
            Scanner scanner8 = new Scanner(System.in);
            System.out.println("Ingrese una fecha (yyyy-MM-dd): ");
            String elegida = scanner8.nextLine();
            fechaelegida = LocalDate.parse(elegida);

            // Utilizar fechaelegida fuera del bucle
            if (mia.isAfter(fechaelegida)) {
                System.out.println("La fecha ingresada es anterior.");
            } else if (mia.isBefore(fechaelegida)) {
                System.out.println("La fecha ingresada es posterior.");
            } else {
                System.out.println("Las fechas son iguales.");

                scanner8.close();
            }

        } while (igual == true);

        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        /*
         * 
         * Ejercicio 1
         * Crear un objeto LocalDate representando la fecha actual.
         * 
         * Ejercicio 2
         * Crear un objeto LocalDate representando una fecha específica, como tu
         * cumpleaños.
         * 
         * Ejercicio 3
         * Permitir a un usuario ingresar por separado dia , mes y año para crear un
         * LocalDate
         * 
         * Ejercicio 4
         * Permitir a un usuario ingresar en un formato predefinido por ti la fecha por
         * consola para crear un LocalDate.
         * 
         * Ejercicio 5
         * Dado un objeto LocalDate ingresado por el usuario, obtener el día de la
         * semana luego de añadir 15 días, 2 meses y 3 años.
         * 
         * Ejercicio 6
         * Dado un objeto LocalDate ingresado por el usuario, obtener el día de la
         * semana luego de restar 13 días, 10 meses y 1 año.
         * 
         * Ejercicio 7
         * Dado un objeto LocalDate ingresado por el usuario, verificar si el año es un
         * año bisiesto.
         * 
         * Ejercicio 8
         * Crear un juego de adivinanza de una fecha, donde crees una LocalDate
         * aleatorio y le preguntes al usuario cuál es. Solo puedes decirle si la fecha
         * ingresada es antes o después de la fecha objetivo. Cuando adivine la fecha
         * termina el juego y lo felicitas por haberme logrado.
         */

    }
}
