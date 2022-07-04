package mx.com.miprojecto.vistaconsola;

import mx.com.miprojecto.domain.FormulasIMP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class consola {
    public static void main(String[] args) {
        FormulasIMP formula = new FormulasIMP();
        Scanner inputconsole = new Scanner(System.in);

        double numero1 = 0 , numero2 = 0 , resultado = 0;

        try {

            System.out.println("Dame un numero: ");
            numero1 = Double.parseDouble(inputconsole.nextLine());

            System.out.println("Dame un numero mas: ");
            numero2 = Double.parseDouble(inputconsole.nextLine());

            resultado = formula.sumar(numero1,numero2);
            System.out.println("resultado suma = " + resultado);

            resultado = formula.dividir(numero1 , numero2);
            System.out.println("resultado divicion = " + resultado);

            resultado = formula.restar(numero1 , numero2);
            System.out.println("resultado resta = " + resultado);

            resultado = formula.promediar(numero1 , numero2);
            System.out.println("resultado promedio = " + resultado);

            resultado = formula.multiplicar(numero1 , numero2);
            System.out.println("resultado multiplicar = " + resultado);

        }catch (InputMismatchException ex){
            System.out.println("Ha ocurrido un problema a el ingreasar datos.");
        }finally {
            System.out.println("Revisado y ejecutado");
        }
    }
}
