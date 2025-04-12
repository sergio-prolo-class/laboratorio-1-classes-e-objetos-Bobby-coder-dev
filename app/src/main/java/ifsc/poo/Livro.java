package ifsc.poo;

public class Livro {
    private String titulo;
    private String autor;
    private String genero1;
    private String genero2;

    private int max_capitulos;
    private int capituloAtual = 0;
    private String nomesCapitulos[] = new String[30];

    private int paginas = 0;
    private int max_paginas;
    private int mudanca_capitulo[] = new int[]{
        23,
        44,
        66,
        89,
        110,
        131,
        154,
        176,
        197,
        219,
        240,
        261,
        282,
        301,
        320,
        341,
        361,
        383,
        403,
        423,
        446,
    };
    //titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    //autor
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }
    //generos
    public void setGenero1(String genero1) {
        this.genero1 = genero1;
    }
    public String getGenero1() {
        return this.genero1;
    }
    public void setGenero2(String genero2) {
        this.genero2 = genero2;
    }
    public String getGenero2() {
        return this.genero2;
    }

    //capitulos
    public void setCapitulos(String[] nomesCapitulos) {
        for(int i = 0; i < nomesCapitulos.length; i++) {
            this.nomesCapitulos[i] = nomesCapitulos[i];
        }
        this.max_capitulos = nomesCapitulos.length;
    }
    public String getCapitulo() {
        return this.nomesCapitulos[this.capituloAtual];
    }

    //paginas
    public void setMaxPaginas(int paginas) {
        this.max_paginas = paginas;
    }
    public void lerPaginas(int paginas) {
        this.paginas += paginas;

        //checar capitulo
        for (int i = capituloAtual; i < this.mudanca_capitulo.length; i++) {
            if (this.paginas >= this.mudanca_capitulo[i]) {
                capituloAtual++;
            }
        }

        if (this.paginas >= this.max_paginas) {
            this.paginas = this.max_paginas;
            System.out.println("Você terminou de ler o livro!");
        }
    }
}