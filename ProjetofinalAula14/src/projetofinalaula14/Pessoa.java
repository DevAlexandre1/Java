package projetofinalaula14;
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String Sexo;
    protected float experiencia;

    public Pessoa(String nome, int idade, String Sexo) {
        this.nome = nome;
        this.idade = idade;
        this.Sexo = Sexo;
        this.experiencia = 0;
    }
       

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
    protected void ganharExp(){
       this.setExperiencia(this.getExperiencia() +1);
    }
    
}
