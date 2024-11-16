public class Aplicativo {
    public static void main(String[] args) {
        
        ControleRemoto LG = new ControleRemoto();

        LG.ligar();
        LG.maisVolume();
        LG.play();
        LG.abrirMenu();
    }
}
