public class RemoteControl {

    public static void main(String[] args) {
        Control con = new Control();
        con.status();

        Control con1 = new Control();
        con1.setLigado(true);
        con1.setVolume(50);
        con1.setMudo(true);
        con1.desligar();
        con1.mutar();
        con1.status();
    }
}
