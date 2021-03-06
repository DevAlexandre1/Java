package projetofinalaula14;
public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;
    
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao =1;
        this.curtidas = 0;
        this.reproduzindo= false;
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    

    @Override
    public void play() {
        if(this.reproduzindo = false){
            System.out.println("Vídeo continuando, play!");
            this.reproduzindo = true;
        }else{
            System.out.println("Video já estava sendo reproduzido, desconsiderando o play");
        }
    }

    @Override
    public void pause() {
        if(this.reproduzindo = true){
            System.out.println("Vídeo pausado");
            this.reproduzindo=false;
        }else{
            System.out.println("Vídeo já estava pausado, desconsiderar!");
        }
    }

    @Override
    public void like() {
        this.avaliacao++;
    }
}
