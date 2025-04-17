package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    private void setCpf(String cpf){
        if(cpf.isEmpty() || cpf == null){
            this.cpf = "123.456.789-00";
        } else {
            this.cpf = cpf;
        }
    }
    
    public Pessoa(String cpf, String nome, int idade){
        setCpf(cpf);
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String cpf, String nome){
        setCpf(cpf);
        this.nome = nome;
    }   
    public Pessoa(String cpf){
        setCpf(cpf);
    }

    public String getCpf(){
        return this.cpf;
    }

    public boolean setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido");
            return false;
        }   
        this.nome = nome;
        return true;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida");
            return false;
        }
        this.idade = idade;
        return true;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public void felizAniversario() {
        this.idade++;
        System.out.println("Feliz Aniversário " + this.nome + "!");
    }    
}