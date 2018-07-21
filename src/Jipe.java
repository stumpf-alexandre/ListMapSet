public class Jipe extends Automovel {
    private boolean tracionado;

    @Override
    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;
        if (tracionado){
            novaVelocidade = novaVelocidade * 0.75;
        }
        if (verificaVelocidadeMaxima(velocidade)){
            this.velocidadeAtual = novaVelocidade;
        }
        else {
            this.velocidadeAtual = velocidadeMaxima;
        }
    }

    public boolean getTracionado() {
        return tracionado;
    }

    public void setTracionado(boolean tracionado) {
        this.tracionado = tracionado;
    }
}