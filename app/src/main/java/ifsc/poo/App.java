package ifsc.poo;
import java.util.Scanner;
import java.util.Random;

public class App {
 
    public static void classeLampada() {
        System.out.println("---------------Classe Lâmpada---------------");
        Lampada[] lamps = new Lampada[3];

        lamps[0] = new Lampada(true); //ligada
        lamps[1] = new Lampada(false); //desligada
        lamps[2] = new Lampada(true); //ligada

        if(lamps[0].ligar()){
            System.out.println("Lampada Ligada!");
        } else {
            System.out.println("Lampada já está ligada!");
        }

        if(lamps[0].desligar()){
            System.out.println("Lampada desligada!");
        } else {
            System.out.println("Lampada já está desligada!");
        }

        if(lamps[1].desligar()){
            System.out.println("Lampada desligada!");
        } else {
            System.out.println("Lampada já está desligada!");
        }if(lamps[1].ligar()){
            System.out.println("Lampada Ligada!");
        } else {
            System.out.println("Lampada já está ligada!");
        }

        System.out.printf("Foram criadas %d lampadas no total!\n", Lampada.contar_lampadas());
        
    }

    public static void classePessoa() {
        System.out.println("---------------Classe Pessoa---------------");
        Pessoa[] pessoas = new Pessoa[3];

        pessoas[0] = new Pessoa("929.181.232-23", "Pablo", 23);
        pessoas[1] = new Pessoa("424.664.123-67");
        pessoas[2] = new Pessoa("");

        System.out.printf("Pessoa: %s, com cpf %s, tem %d anos\n", pessoas[0].getNome(), pessoas[0].getCpf(), pessoas[0].getIdade());

        System.out.println(pessoas[1].getCpf());
        
        System.out.println(pessoas[2].getCpf());
    }

    public static void classeRetangulo() {
            System.out.println("---------------Classe Retângulo---------------");        
            Retangulo retangulo1 = new Retangulo(5, -5);
            Retangulo[] retangulos = new Retangulo[10]; 

            System.out.printf("Retângulo 1 tem área: %.2f e perímetro: %.2f\n", retangulo1.getArea(), retangulo1.getPerimetro());

            int maiorAreaIndice = -1;
            float maiorArea = 0;
            int menorPerimetroIndice = -1;
            float menorPerimetro = 1000;

            Random random = new Random(); 

            for (int i = 0; i < retangulos.length; i++) {
                retangulos[i] = new Retangulo(random.nextFloat() * 10 + 1,random.nextFloat() * 10 + 1);

                float areaAtual = retangulos[i].getArea();
                float perimetroAtual = retangulos[i].getPerimetro();

                if (areaAtual > maiorArea) {
                    maiorArea = areaAtual;
                    maiorAreaIndice = i;
                }
                if (perimetroAtual < menorPerimetro) {
                    menorPerimetro = perimetroAtual;
                    menorPerimetroIndice = i;
                }
        }

        System.out.println("Triangulo de maior área foi o triangulo " + maiorAreaIndice + " com Área: " + maiorArea);
        System.out.println("Triangulo de menor perimetro foi o triangulo " + menorPerimetroIndice + " com Perimetro: " + menorPerimetro);
    }

    public static void classeRelogio(){
        System.out.println("---------------Classe Relógio---------------");
        Relogio relogio1 = new Relogio((byte) 14, (byte) 58, (byte) 32);
        Relogio relogio2 = new Relogio((byte) 22, (byte)52, (byte)52);

        System.out.println(relogio1.getHora());
        System.out.println(relogio2.getHora());

        relogio2.sincronizaRelogio(relogio1);

        System.out.println(relogio1.getHora() + " é igual a " + relogio2.getHora());

        relogio2.ajustaHora((byte) 22, (byte)52, (byte)52);

        System.out.println("Diferença em segundos: " + relogio2.diferencaRelogio(relogio1));
    }

    public static void classeProduto(){
        System.out.println("---------------Classe Produto---------------");

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        
        /*
        produto1.setNome("Geladeira");
        produto1.setPreco(832);

        produto2.setNome("Micro-ondas");
        produto2.setPreco(499);

        produto1.setDesconto(6);
        produto2.setDesconto(12);

        System.out.printf("%.2f\n", produto1.getPreco());
        System.out.printf("%.2f\n", produto2.getPreco());

        System.out.println(produto1.anuncio());
        System.out.println(produto2.anuncio());
        */

        Produto p1 = new Produto("Geladeira", 832);
        p1.setDesconto(6);

        Produto p2 = new Produto("Micro-ondas", 499);
        p2.setDesconto(12);
        
        Produto p3 = new Produto("Fogão", 677);
        
        String[] csv = Produto.exportarCSV();
        for (String linha : csv) {
            System.out.println(linha);
        }

        //(por algum motivo minha classe produto so funciona no diretorio ifsc e não junto com as outras) 

        //resposta para pergunta
        //eu trataria os valores de preço e desconto como float, para evitar perda de precisão
        //assim eu poderia tratar o preço com desconto no próprio metodo de preço, botando desconto de 0 caso não houvesse colocado um desconto ainda
    }
/*
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
*/
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
