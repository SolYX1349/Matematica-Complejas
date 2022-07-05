package mx.com.miprojecto.vistaconsola;

import mx.com.miprojecto.domain.FormulasIMP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class consola {
    public static void main(String[] args) {
        FormulasIMP formula = new FormulasIMP();
        Scanner inputconsole = new Scanner(System.in);

        int opc = 0;
        double numero1 = 0 , numero2 = 0 , resultado = 0;

        try {

            System.out.println("Bienbenido que tipo de problema quieres resolver? Digita el numero."
            + "\n 1- Matematicas "
            + "\n 2- Fisica "
            + "\n 3- Salir");

            opc = Integer.parseInt(inputconsole.nextLine());

            do {
                if (opc != 3) {
                    switch (opc) {
                        case 1:

                            System.out.println("---Tipo de operaciones---"
                                    + "\n 1-Sumar"
                                    + "\n 2-Restar"
                                    + "\n 3-Multiplicar"
                                    + "\n 4-Dividir"
                                    + "\n 5-Promediar"
                                    + "\n 6-Regresar");

                            opc = Integer.parseInt(inputconsole.nextLine());

                            switch (opc) {
                                case 1:
                                    System.out.println("Dame un numero: ");
                                    numero1 = Double.parseDouble(inputconsole.nextLine());

                                    System.out.println("Dame un numero mas: ");
                                    numero2 = Double.parseDouble(inputconsole.nextLine());

                                    resultado = formula.sumar(numero1, numero2);
                                    System.out.println("resultado suma = " + resultado);
                                    break;

                                case 2:
                                    System.out.println("Dame un numero: ");
                                    numero1 = Double.parseDouble(inputconsole.nextLine());

                                    System.out.println("Dame un numero mas: ");
                                    numero2 = Double.parseDouble(inputconsole.nextLine());

                                    resultado = formula.restar(numero1, numero2);
                                    System.out.println("resultado resta = " + resultado);
                                    break;

                                case 3:
                                    System.out.println("Dame un numero: ");
                                    numero1 = Double.parseDouble(inputconsole.nextLine());

                                    System.out.println("Dame un numero mas: ");
                                    numero2 = Double.parseDouble(inputconsole.nextLine());

                                    resultado = formula.multiplicar(numero1, numero2);
                                    System.out.println("resultado multiplicar = " + resultado);
                                    break;
                                case 4:


                                    resultado = formula.dividir(numero1, numero2);
                                    System.out.println("resultado divicion = " + resultado);
                                    break;

                                case 5:
                                    System.out.println("Dame un numero: ");
                                    numero1 = Double.parseDouble(inputconsole.nextLine());

                                    System.out.println("Dame un numero mas: ");
                                    numero2 = Double.parseDouble(inputconsole.nextLine());

                                    resultado = formula.promediar(numero1, numero2);
                                    System.out.println("resultado promedio = " + resultado);
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Ocurrio un error o esa opcion no existe.");
                            }
                            break;

                        case 2:
                            break;
                        default:
                            System.out.println("Ocurrio un error o esa opcion no existe.");
                    }
                }
            }while (opc != 3);

        }catch (InputMismatchException ex){
            System.out.println("Ha ocurrido un problema a el ingreasar datos.");
        }finally {
            System.out.println("Revisado y ejecutado");
        }
    }
}
