package questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        int lado = scanner.nextInt();
        Quadrado q = new Quadrado(lado);
        System.out.println("Digite a largura e a altura do retângulo: ");
        int largura = scanner.nextInt();
        int altura = scanner.nextInt();
        Retangulo r = new Retangulo(largura, altura);
        System.out.println("A área do quadrado é: " + q.calcularArea() + " e a área do retângulo é: " + r.calcularArea());

    }
}
