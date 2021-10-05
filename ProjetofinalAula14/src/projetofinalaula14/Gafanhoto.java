package projetofinalaula14;
public class Gafanhoto extends Pessoa {
    private String login;
    private int totassistido;

    public Gafanhoto(String nome, int idade, String Sexo, String login) {
        super(nome, idade, Sexo);        
        this.totassistido = 0;
        this.login =  login;
        
    }


    public int getTotassistido() {
        return totassistido;
    }

    public void setTotassistido(int totassistido) {
        this.totassistido = totassistido;
    }
    
    public void viuMaisUm(){
        this.setTotassistido(this.getTotassistido() +1);
    }
    
    
}
