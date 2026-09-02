// Bernardo Fogaça olivieri
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite sua primeira nota");
        double nota1 = entrada.nextDouble();
        System.out.println("digite sua segunda nota");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("sua media é:" + media);
        entrada.close();
    }
    
}
