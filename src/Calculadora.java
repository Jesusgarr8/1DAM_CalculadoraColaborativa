import java.util.Scanner;

public class Calculadora {

    public static int sumar (int a, int b){
        return a + b;
    }



    public static int restar (int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Iniciando calculadora...");

        Scanner sc= new Scanner(System.in);
        System.out.println("Primer número");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Suma o resta ('+' o '-')");
        String operador = sc.nextLine();

        System.out.println("Segundo número");
        int num2 = sc.nextInt();
        sc.nextLine();

        if (operador.equals("+")){
            System.out.println("Suma: " + sumar(num1, num2));
        }

        if (operador.equals("-")){
            System.out.println("Resta: " + restar(num1, num2));
        }

    
    }
}
