import ifsc.poo;

public abstract class NaveEspacial {
    protected static int id = 0; // identificador das naves
    protected int velocidadeAtual;
    protected int velocidadeMaxima;
    protected boolean emVoo;

    public NaveEspacial(int velocidadeMaxima) {
        this.id++;
        this.velocidadeMaxima = velocidadeMaxima;
        this.emVoo = false;
        this.velocidadeAtual = 0;
    }

    public void acelerar (int incremento) {
        if (emVoo) {
            this.velocidadeAtual += incremento;
            if (this.velocidadeAtual > this.velocidadeMaxima) {
                this.velocidadeAtual = this.velocidadeMaxima;
            }
        }
    }
    public void desacelerar (int decremento) {
        if (emVoo) {
            this.velocidadeAtual -= decremento;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
        }
    }
    public void decolar() {
        if (!emVoo) {
            emVoo = true;
            velocidadeAtual = 0;
        }
    }
    public void pousar() {
        if (emVoo) {
            emVoo = false;
            velocidadeAtual = 0;
        }
    }

}
