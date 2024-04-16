import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas formas deseja criar: ");
        int aux = scanner.nextInt();
        FormaGeometrica[] forma = new FormaGeometrica[aux];

        for (int i = 0; i < aux; i++) {
            System.out.println("Qual forma que deseja adicionar (Quadrado, Retangulo ou Circulo)?: ");
            String tipoForma = scanner.next();

            switch (tipoForma) {
                case "Quadrado":
                    System.out.print("Digite o valor do lado do quadrado: ");
                    double ladoQuadrado = scanner.nextDouble();
                    forma[i] = new Quadrado(ladoQuadrado);
                    break;
                case "Retangulo":
                    System.out.print("Digite o valor da base do retangulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite o valor da altura do retangulo: ");
                    double altura = scanner.nextDouble();
                    forma[i] = new Retangulo(base, altura);
                    break;
                case "Circulo":
                    System.out.print("Digite o valor do raio do circulo: ");
                    double raio = scanner.nextDouble();
                    forma[i] = new Circulo(raio);
                    break;
                default:
                    System.out.println("Forma Geometrica inválida, tente novamente: ");
                    i--;
                    break;
            }
        }
        System.out.print("\nResultados: ");
        for (FormaGeometrica f : forma) {
            if (f instanceof Quadrilatero quad) {
                System.out.println("Lados: " + quad.l1 + "," + quad.l2 + "," +quad.l3 + "," + quad.l4);
            } else if (f instanceof Circulo circ) {
                System.out.println("Raio: " + circ.raio);
            }
            System.out.println("Perímetro: " + f.calcularPerimetro());
            System.out.println("Área: " + f.calcularArea());
        }
    }
}