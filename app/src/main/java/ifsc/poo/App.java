package ifsc.poo;
import java.util.Scanner;
import java.util.Random;

public class App {
 
    public static void classeLampada() {
        System.out.println("---------------Classe Lâmpada---------------");
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
        System.out.println("---------------Classe Pessoa---------------");
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
            System.out.println("---------------Classe Retângulo---------------");        
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

    public static void classeRelogio(){
        System.out.println("---------------Classe Relógio---------------");
        Relogio relogio = new Relogio();

        relogio.ajustaHora((byte) 14, (byte) 58, (byte) 32);

        for (int i = 0; i < 2; i++){
            relogio.avancaMinuto();
        }

        System.out.println(relogio.getHora());

        relogio.ajustaHora((byte) 23, (byte)59, (byte)59);

        relogio.avancaSegundo();

        System.out.println(relogio.getHora());
    }

    public static void classeProduto(){
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        System.out.println("---------------Classe Produto---------------");

        produto1.setNome("Geladeira");
        produto1.setPreco(832);

        produto2.setNome("Micro-ondas");
        produto2.setPreco(499);

        produto1.setDesconto(6);
        produto2.setDesconto(12);

        System.out.printf("%.2f\n", produto1.getPreco() - (produto1.getPreco() * produto1.getDesconto() / 100));
        System.out.printf("%.2f\n", produto2.getPreco() - (produto2.getPreco() * produto2.getDesconto() / 100));

        System.out.println(produto1.anuncio());
        System.out.println(produto2.anuncio());

        //(por algum motivo minha classe produto so funciona no diretorio ifsc e não junto com as outras) 

        //resposta para pergunta
        //eu trataria os valores de preço e desconto como float, para evitar perda de precisão
        //assim eu poderia tratar o preço com desconto no próprio metodo de preço, botando desconto de 0 caso não houvesse colocado um desconto ainda
    }

    public static void classeLivro(){
        System.out.println("---------------Classe Livro---------------");
        Livro livro = new Livro();

        livro.setTitulo("O Senhor dos Anéis - A Sociedade do Anel");
        System.out.println(livro.getTitulo());

        livro.setAutor("J.R.R. Tolkien");
        System.out.println(livro.getAutor());

        livro.setGenero1("Fantasia");
        livro.setGenero2("Aventura");
        System.out.println(livro.getGenero1() + " e " + livro.getGenero2());

        livro.setMaxPaginas(464);

        //capitulos
        String[] capitulos = new String[]{
            "Uma Festa Muito Esperada",
            "A Sombra do Passado",
            "Três é Demais",
            "Um Atalho para Cogumelos",
            "Uma Conspiração Desmascarada",
            "A Floresta Velha",
            "Em Casa de Tom Bombadil",
            "Névoa nas Colinas dos Túmulos",
            "No Pônei Empinado",
            "Passolargo",
            "Um Faca na Noite",
            "Voo para o Vau",
            "Muitos Encontros",
            "O Conselho de Elrond",
            "O Anel Vai para o Sul",
            "Uma Jornada no Escuro",
            "A Ponte de Khazad-dûm",
            "Lothlórien",
            "O Espelho de Galadriel",
            "Adeus a Lórien",
            "O Grande Rio",
            "A Partida da Sociedade"
        };
        livro.setCapitulos(capitulos);
        //leitura

        livro.lerPaginas(90);
        System.out.println(livro.getCapitulo());

        livro.lerPaginas(300);
        System.out.println(livro.getCapitulo());

        livro.lerPaginas(100);

    }

    public static void main(String[] args) {
        System.out.println("Escolha a classe que queira testar: \n1 - Lampada \n2 - Pessoa \n3 - Retangulo \n4 - Relogio \n5 - Produto \n6 - Livro \n7 - Sair");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> classeLampada();

            case 2 -> classePessoa();

            case 3 -> classeRetangulo();

            case 4 -> classeRelogio();
        
            case 5 -> classeProduto();

            case 6 -> classeLivro();

            case 7 -> {
                System.out.println("Saindo...");
                scanner.close();
                return;
            }

            default -> System.out.println("Opção inválida");
        }
    }
}
