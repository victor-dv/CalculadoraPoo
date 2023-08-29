package Main;

public class Conta {
    private int numero1;
    private int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }


    public int Soma(int numero1, int numero2){
        return numero1 + numero2;
    }
    public int Subtracao(int numero1, int numero2){
        return numero1 - numero2;
    }
    public int Multiplicacao(int numero1, int numero2){
        return numero1 * numero2;
    }
    public int Divisao(int numero1, int numero2){
        return numero1 / numero2;
    }



}
