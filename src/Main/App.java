package Main;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Conta numero = new Conta();
        int resultado = 0;
        String operador;
        System.out.println("numero 1: ");
        numero.setNumero1(scanner.nextInt());

        System.out.println("Operação: ");
        operador = scanner.next();

        System.out.println("numero 2: ");
        numero.setNumero2(scanner.nextInt());

        switch (operador){
            case "+":
                resultado = numero.Soma(numero.getNumero1(), numero.getNumero2());
                break;
            case "-":
                resultado = numero.Subtracao(numero.getNumero1(), numero.getNumero2());
                break;
            case "*":
                resultado = numero.Multiplicacao(numero.getNumero1(), numero.getNumero2());
                break;
            case "/":
                resultado = numero.Divisao(numero.getNumero1(), numero.getNumero2());
                break;
        }

        System.out.println("Resultado: " + resultado);





    }
}
