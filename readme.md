# Projeto Java - Modelagem de Objetos

Este projeto em Java implementa diversas classes para representar objetos do mundo real. A ideia principal é aplicar os conceitos de **Programação Orientada a Objetos (POO)**, como encapsulamento, métodos, atributos e boas práticas de modelagem.

---

## Estrutura do Projeto

### 1. `Lampada.java`

Modela uma lâmpada que pode ser ligada ou desligada.

- **Atributos:**
  - `boolean ligada`
- **Métodos:**
  - `ligar()` – Liga a lâmpada.
  - `desligar()` – Desliga a lâmpada.
  - `verEstado()` – Retorna `true` se estiver ligada, `false` se desligada.

**Testes realizados:**
- Criar duas lâmpadas.
- Ligar uma e desligar a outra.
- Imprimir o estado de cada uma.

---

### 2. `Pessoa.java`

Modela uma pessoa com nome e idade.

- **Atributos:**
  - `String nome`
  - `int idade`
- **Métodos:**
  - `setNome(String nome)`
  - `getNome()`
  - `setIdade(int idade)`
  - `getIdade()`
  - `felizAniversario()` – Incrementa a idade em 1.

**Testes realizados:**
- Criar "Alice" (22 anos) e "Bruno" (25 anos).
- Bruno faz 3 aniversários.
- Impressão das idades.
- Testes com valores inválidos (idade negativa e nome vazio).

---

### 3. `Retangulo.java`

Modela um retângulo em um plano cartesiano.

- **Atributos:**
  - `float largura`
  - `float altura`
- **Métodos:**
  - `setLargura(float largura)`
  - `setAltura(float altura)`
  - `getArea()` – Retorna `largura * altura`.
  - `getPerimetro()` – Retorna `2 * (largura + altura)`.

**Testes realizados:**
- Criar um retângulo 5x4.
- Verificar se a área é 20 e o perímetro é 18.
- Criar vetor com 10 retângulos aleatórios.
- Encontrar e exibir a maior razão área/perímetro.

---

### 4. `Relogio.java`

Modela um relógio que exibe a hora no formato `HH:MM:SS`.

- **Atributos:**
  - `byte hora`
  - `byte minuto`
  - `byte segundo`
- **Métodos:**
  - `ajustaHora(byte h, byte m, byte s)`
  - `getHora()` – Retorna a hora como string `HH:MM:SS`.
  - `avancaHora()`, `avancaMinuto()`, `avancaSegundo()` – Avançam o tempo corretamente.

**Testes realizados:**
- Criar relógio com hora `14:58:32`.
- Avançar 2 minutos → `15:00:32`.
- Ajustar para `23:59:59`, depois avançar 1 segundo → `00:00:00`.
- Discussão: como alterar o formato para algo como `"11pm 30m 45s"` (modificar o método `getHora()`).

---

### 5. `Produto.java`

Modela um produto com nome, preço e desconto.

- **Atributos:**
  - `String nome`
  - `int preco`
  - `int desconto` (em %)
- **Métodos:**
  - `setNome(String nome)`
  - `getNome()`
  - `setPreco(int preco)`
  - `getPreco()` – Retorna o preço com desconto aplicado.
  - `setDesconto(int desconto)`
  - `getDesconto()`

  ### 5. `Livro.java`

Recebe o máximo de páginas e os nomes dos capítulos e pode informar as páginas lidas

- **Atributos:**
  - `String titulo`
  - `String autor`
  - `String genero1`
  - `String genero2`

  - `int max_capitulos`
  - `int capituloAtual`
  - `String nomesCapitulos[]`


  - `int paginas`
  - `mudanca_capitulo`
- **Métodos:**
  - `void setTitulo(String titulo)`
  - `String getTitulo()`
  - `void setAutor(String autor)`
  - `String getAutor()`
  - `void setGenero1()`
  - `void getGenero1()`
  - `void setGenero2()`
  - `void getGenero2()`
  - `String setCapitulos()`
  - `String getCapitulo()`
  - `void setMaxPaginas(int paginas)`
  - `void lerPaginas(int paginas)`


  

