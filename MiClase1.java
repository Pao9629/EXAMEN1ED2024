package Borradores2;

public class Main {

    int cuartos;
    int habitantes;

    public static void main(String[] args) {
        Calculadora miCalc = new Calculadora();
        miCalc.setCuartos(4);
        miCalc.setHabitantes(2);
	    System.out.println("Hola Mundo!");
        System.out.println("Como estás");
        System.out.println("Cambio de Marcelo");
        System.out.println(miCalc.cantidadDeCuartosPorHabitante());

    }
}