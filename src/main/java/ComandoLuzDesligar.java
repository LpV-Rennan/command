public class ComandoLuzDesligar implements Comando {
    private LuzInteligente luz;

    public ComandoLuzDesligar(LuzInteligente luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        this.luz.desligar();
    }

    @Override
    public void cancelar() {
        this.luz.ligar();
    }
}
