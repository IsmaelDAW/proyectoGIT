import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero1, numero2, resultado;
        String operacion;

        System.out.print("Numero 1: ");
        numero1 = input.nextDouble();
        input.nextLine();

        System.out.print("\nNumero 2: ");
        numero2 = input.nextDouble();
        input.nextLine();

        System.out.print("\n¿Que operación quieres hacer? (+, -, * , /): ");
        operacion = input.nextLine();
        input.close();

        switch(operacion){
            case "+":
                resultado = numero1 + numero2;
                mostrarResultado(resultado);
            break;
            case "-":
                resultado = numero1 - numero2;
                mostrarResultado(resultado);
            break;
            case "*":
                resultado = numero1 * numero2;
                mostrarResultado(resultado);
            break;
            case "/":
                resultado = numero1 / numero2;
                mostrarResultado(resultado);
            break;
            default:
                System.out.println("Operación no válido.");
        }
    }

    public static void mostrarResultado(double resultado){
        System.out.println("El resultado es: " + resultado);
    }
}