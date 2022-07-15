public class ComandoLuzLigar implements Comando {
    private LuzInteligente luz;

    public ComandoLuzLigar(LuzInteligente luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        this.luz.ligar();
    }

    @Override
    public void cancelar() {
        this.luz.desligar();
    }
}
