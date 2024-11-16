public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodos especiais

    public ControleRemoto(){
        setVolume(50);
        setLigado(true);
        setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metodos abstratos

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------MENU-------");
        System.out.println("Está ligado? "+isLigado());
        System.out.println("Está tocando? "+isTocando());
        System.out.print("Volume: "+getVolume());
        for(int i=0; i<=getVolume(); i+=10){
            System.out.print("[]");
        }
    }   

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(isLigado()){
            setVolume(getVolume()+5);
        }else{
            System.out.println("Impossivel aumentar volume.");
        }
        
    }

    @Override
    public void menosVolume() {
        if (isLigado()){
            setVolume(getVolume()-5);
        }else{
            System.out.println("Impossivel diminuir volume.");
        }
        
    }

    @Override
    public void ligarMudo() {
        if(isLigado() && getVolume() >0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() ==0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigado() && !(isTocando())){
            setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()){
            setTocando(false);
        }else {
            System.out.println("Não consegui pausar.");
        }
    }
}
