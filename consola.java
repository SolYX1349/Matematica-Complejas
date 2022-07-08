package mx.com.miprojecto.vistaconsola;

import mx.com.miprojecto.domain.FormulasIMP;
import java.util.*;

public class consola {
    public static void main(String[] args) {
        FormulasIMP formula = new FormulasIMP();
        Scanner inputconsole = new Scanner(System.in);

        int opc1 = 0 , opc2 = 0 ;
        boolean regreso = false ;
        double numero1 = 0 , numero2 = 0 , resultado = 0;

        try {

            do {

            System.out.println("Bienbenido que tipo de problema quieres resolver? Digita el numero."
            + "\n 1- Matematicas "
            + "\n 2- Fisica "
            + "\n 3- Salir");

            opc1 =inputconsole.nextInt();

            do {

                regreso = false;

                if (opc1 == 1 || opc1 == 2) {

                    switch (opc1) {

                        case 1:
                            System.out.println("---Tipo de operaciones---"
                                    + "\n 1-Sumar"
                                    + "\n 2-Restar"
                                    + "\n 3-Multiplicar"
                                    + "\n 4-Dividir"
                                    + "\n 5-Promediar"
                                    + "\n 6-Regresar"
                                    + "\n 7-Salir");

                            opc2 = inputconsole.nextInt();

                            switch (opc2) {

                                case 1:
                                    System.out.print("_");
                                    numero1 = inputconsole.nextDouble();

                                    System.out.print("+" + "\n_");
                                    numero2 = inputconsole.nextDouble();

                                    resultado = formula.sumar(numero1, numero2);
                                    System.out.println(numero1 +" + "+numero2 + " = " + resultado);
                                    break;

                                case 2:
                                    System.out.println("Dame un numero: ");
                                    numero1 = inputconsole.nextDouble();

                                    System.out.println("Dame un numero mas: ");
                                    numero2 = inputconsole.nextDouble();

                                    resultado = formula.restar(numero1, numero2);
                                    System.out.println(numero1 +" - "+numero2 + " = " + resultado);
                                    break;

                                case 3:
                                    System.out.println("Dame un numero: ");
                                    numero1 = inputconsole.nextDouble();

                                    System.out.println("Dame un numero mas: ");
                                    numero2 = inputconsole.nextDouble();

                                    resultado = formula.multiplicar(numero1, numero2);
                                    System.out.println(numero1 +" X "+numero2 + " = " + resultado);
                                    break;

                                case 4:
                                    System.out.println("Dame un numero: ");
                                    numero1 = inputconsole.nextDouble();

                                    System.out.println("Dame un numero mas: ");
                                    numero2 = inputconsole.nextDouble();

                                    resultado = formula.dividir(numero1, numero2);
                                    System.out.println(numero1 +" / "+numero2 + " = " + resultado);
                                    break;

                                case 5:
                                    System.out.println("Dame un numero: ");
                                    numero1 = inputconsole.nextDouble();

                                    System.out.println("Dame un numero mas: ");
                                    numero2 = inputconsole.nextDouble();

                                    resultado = formula.promediar(numero1, numero2);
                                    System.out.println(numero1 +" , "+numero2 + " = " + resultado);
                                    break;

                                case 6:
                                    regreso = true;
                                    opc1 = 3;
                                    break;
                                case 7:
                                    opc1 = 3;
                                    break;

                                default:
                                    System.out.println("Ocurrio un error o esa opcion no existe.");
                            }
                            break;

                        case 2:
                            System.out.println("Esta opcion aun no esta terminada >>>><<<<");
                            opc1 = 3;
                            regreso = false;
                            break;

                        default:
                            System.out.println("Ocurrio un error o esa opcion no existe.");
                    }
                }
            }while (opc1 != 3);
            }while (regreso == true);

        }catch (InputMismatchException ex){
            System.out.println("Ha ocurrido un problema a el ingreasar datos.");
        }finally {
            System.out.println("Revisado y ejecutado");
        }
    }
}