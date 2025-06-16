import ifsc.poo;

public class NaveExploradora extends NaveEspacial implements Tripulada, Blindada{
    private boolean holofotes;

    public NaveExploradora() {
        if (nave instanceof ifsc.poo.naves.interfaces.Blindada) {
            this.velocidadeMaxima = 14;
        } else {
            this.velocidadeMaxima = 20;
        }
        super(velocidadeMaxima);
        this.holofotes = false;
    }

    public boolean ligarHolofotes() {
        if (!this.holofotes) {
            this.holofotes = true;
            System.out.println("Holofotes ligados.");
            return true;
        }
        System.out.println("Holofotes já estão ligados.");
        return false;
    }

    public boolean desligarHolofotes() {
        if (this.holofotes) {
            this.holofotes = false;
            System.out.println("Holofotes desligados.");
            return true;
        }
        System.out.println("Holofotes já estão desligados.");
        return false;
    }

    public boolean isHolofotesLigados() {
        System.out.println("Verificando estado dos holofotes...");
        if (this.holofotes) {
            System.out.println("Holofotes estão ligados.");
        } else {
            System.out.println("Holofotes estão desligados.");
        }
        return this.holofotes;
    }

    
}