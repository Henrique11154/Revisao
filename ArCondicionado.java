package sadjsafj;

public class ArCondicionado{

    private int temp;
    private int velocidade;
    private boolean estaLigado;
    private boolean estaOscilando;
    private String modelo;
    private int timer;
 
    public ArCondicionado(int temp, int velocidade, boolean estaLigado, boolean estaOscilando, String modelo,
            int timer) {
        this.temp = temp;
        this.velocidade = velocidade;
        this.estaLigado = estaLigado;
        this.estaOscilando = estaOscilando;
        this.modelo = modelo;
        this.timer = timer;
    }

    public ArCondicionado(){}
    
    public ArCondicionado(int temp, String modelo) {
        this.temp = temp;
        this.modelo = modelo;
    }

    public void ligar(){        // Metodo para ligar o ar
        estaLigado = true;
    }

    public void desligar(){     // Metodo para desligar o ar
        estaLigado = false;
    }
    
    public void AumentarTemp(){     // Aumentar a temperatura do ar
        temp++;
    }

    public void diminuirTemp(){     // Diminuir a temperatura
        temp--;
    }

    public void ligaOscilacao(){     // Liga a Oscilação
        estaOscilando = true;
    }

    public void desligaOscilacao(){     //Desliga a Oscilação
        estaOscilando = false;
    }

    public void LigarTimer(int tempo){      //Liga o Timer
        timer = tempo;
    }

    /*public int getTemp() {      
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public boolean isEstaLigado() {
        return estaLigado;
    }
    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }
    public boolean isEstaOscilando() {
        return estaOscilando;
    }
    public void setEstaOscilando(boolean estaOscilando) {
        this.estaOscilando = estaOscilando;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getTimer() {
        return timer;
    }
    public void setTimer(int timer) {
        this.timer = timer;
    }*/ // Metodos get e set

}
