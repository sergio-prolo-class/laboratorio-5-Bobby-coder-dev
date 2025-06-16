import ifsc.poo;

public interface Autonoma{
    // Método para iniciar o voo autônomo
    void controleAutomatico();

    // Método para parar o voo autônomo
    void desligar();

    // Método para verificar se a nave está em voo autônomo
    boolean isAutomatico();
}