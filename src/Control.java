public class Control {

    private boolean ligado;
    private int volume;
    private boolean mudo;

    public void Control(){
        this.ligado = false;
        this.volume = 0;
        this.mudo = false;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setMudo(boolean mudo){
        this.mudo = mudo;
    }
    public boolean getmudo(){
        return this.mudo;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return this.volume;
    }

    public void status(){
        System.out.println("-----------------");
        if (getLigado() == false){
            System.out.println("Televisão está desligada");
        } else {
            System.out.println("Televisão está ligada");
        }

        System.out.println("Volume: " + getVolume());

        if (getmudo() == false){
            System.out.println("Não está no mudo");
        } else {
            System.out.println("Está no mudo");
        }
    }

    public void desligar(){
        if (getLigado() == true){
            setLigado(false);
        }
    }
    public void mutar(){
        if (getmudo() == false){
            setMudo(true);
        }
    }

}
