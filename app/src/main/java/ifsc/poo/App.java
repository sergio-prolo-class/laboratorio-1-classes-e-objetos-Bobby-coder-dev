package ifsc.poo;
import java.util.Scanner;

public class App {
 
    public static void classeLampada() {
        Lampada[] lamps = new Lampada[2];

        lamps[0] = new Lampada();
        lamps[1] = new Lampada();

        lamps[0].ligar();
        lamps[1].desligar();

        if(lamps[0].verEstado()){
            System.out.println("Lampada 1 está ligada");
        } else {
            System.out.println("Lampada 1 está desligada");
        }
        if(lamps[1].verEstado()){
            System.out.println("Lampada 2 está ligada");
        } else {
            System.out.println("Lampada 2 está desligada");
        }
    }

    public static void classePessoa() {
        Pessoa[] pessoas = new Pessoa[2];

        pessoas[0] = new Pessoa();
        pessoas[1] = new Pessoa();

        pessoas[0].setNome("Alice");
        pessoas[0].setIdade(22);

        pessoas[1].setNome("Bruno");
        pessoas[1].setIdade(25);

        pessoas[1].felizAniversario();
        pessoas[1].felizAniversario();
        pessoas[1].felizAniversario();

        System.out.printf("Idade de %s é %d\n", pessoas[0].getNome(), pessoas[0].getIdade());
        System.out.printf("Idade de %s é %d\n", pessoas[1].getNome(), pessoas[1].getIdade());
    }

    public static void classeRetangulo() {
            Retangulo retangulo1 = new Retangulo();
            Retangulo[] retangulos = new Retangulo[10]; 

            retangulo1.setLargura(5);
            retangulo1.setAltura(4);

            System.out.printf("Retângulo 1 tem área: %.2f e perímetro: %.2f\n", retangulo1.getArea(), retangulo1.getPerimetro());

            float razao = 0;
            int numRet = -1;

            Random random = new Random(); 

            for (int i = 0; i < retangulos.length; i++) {
                retangulos[i] = new Retangulo();

                retangulos[i].setLargura(random.nextFloat() * 10 + 1); 
                retangulos[i].setAltura(random.nextFloat() * 10 + 1);

                float razaoRet = retangulos[i].getArea() / retangulos[i].getPerimetro();

                if (razao < razaoRet) {
                    razao = razaoRet;
                    numRet = i;
                }
        }

        if (numRet != -1) { 
            System.out.println("O retângulo com maior razão entre área e perímetro é o retângulo " + numRet + " com razão " + razao);
        }
    }
    public static void main(String[] args) {
        System.out.println("Escolha a classe que queira testar: \n1 - Lampada \n2 - Pessoa");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> classeLampada();

            case 2 -> classePessoa();

            case 3 -> classeRetangulo();

            default -> System.out.println("Opção inválida");
        }
    }
}
