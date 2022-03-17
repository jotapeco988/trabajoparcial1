package co.gprestaurante;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputData = new Scanner(System.in);
        int numpersonas, mesas, valorplato;
        double plato = 0, descuento, total = 0, totalpropina, cuentaconpropina, propina;
        System.out.println("Bienvenido a muertelenta: Ingrese por favor la cantidad de personas a ingresar");
        numpersonas = inputData.nextInt();

        System.out.println("Que plato deseas escoger y cuantas personas lo van a escoger:1-hamburguesa por un valor de 10000 pesos" + "\n el plato dos es perro por un valor de 8000 pesos" + "\n el plato tres es salchipapas por un valor de 6000 pesos" + "\n el plato cuatro es chorizos por 7000 pesos");
        plato = inputData.nextInt();

        if (plato == 1 && numpersonas >= 2) {
            plato = (numpersonas * 10000);
            descuento = plato * 0.15;
            total = plato - descuento;
            System.out.println("el valor total de las personas que escogieron hamburguera es " + plato + " con un descuento por compras mayores a 20 mil pesos: " + total);

        } else if (plato == 1) {
            plato = (numpersonas * 10000);
            System.out.println("el valor total de las personas que escogieron hamburguesa es de " + plato);

        } else if (plato == 2 && numpersonas >= 3) {
            plato = numpersonas * 8000;
            descuento = plato * 0.15;
            total = plato - descuento;

            System.out.println("el valor total de las personas que escogieron perro es " + plato + " con un descuento por compras mayores a 20 mil pesos: " + total);
        } else if (plato == 2) {
            plato = numpersonas * 8000;
            System.out.println("el valor total de las personas que escogieron perro es: " + plato);
        } else if (plato == 3 && numpersonas >= 4) {
            plato = numpersonas * 6000;
            descuento = plato * 0.15;
            total = plato - descuento;
            System.out.println("el valor total de las personas que escogieron salchipapa es " + plato + " con un descuento por compras mayores a 20 mil pesos: " + total);
        } else if (plato == 3) {
            plato = numpersonas * 6000;
            System.out.println("el valor total de las personas que escogieron salchipapa es: " + plato);

        } else if (plato == 4 && numpersonas >= 3) {
            plato = numpersonas * 7000;
            descuento = plato * 0.15;
            total = plato - descuento;
            System.out.println("el valor total de las personas que escogieron chorizo es " + plato + " con un descuento por compras mayores a 20 mil pesos: " + total);
        } else if (plato == 4) {
            plato = numpersonas * 6000;
            System.out.println("el valor total de las personas que escogieron chorizo es: " + plato);
            ;
        }
        System.out.println("Ingrese 1 por favor si deseas agregar propina y 2 si no lo desea: ");
        totalpropina = inputData.nextInt();
        if (totalpropina == 1) {
            propina = plato * 0.10;
            cuentaconpropina = propina + plato;
            System.out.println("Su total con propina es de: " + cuentaconpropina);
        }
        else if (totalpropina == 1){
            propina = total * 0.10;
            cuentaconpropina = propina + plato;
            System.out.println("Su total con propina es de: " + cuentaconpropina);
        }
        if (totalpropina ==2){
            System.out.println("Su total es de: "+plato);
        }
        else if (totalpropina==2){
            System.out.println("Su total es de: "+total);
        }

    }

}



