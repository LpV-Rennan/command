public class LuzInteligente {
    private boolean estaLigado;
    private  String nome;

    public LuzInteligente(String nome) {
        this.nome = nome;
        this.estaLigado = false;
    }

    public boolean getEstaLigado() {
        return estaLigado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean ligar(){
        this.estaLigado = true;
        return this.estaLigado;
    }
    public boolean desligar(){
        this.estaLigado = false;
        return this.estaLigado;
    }

}
