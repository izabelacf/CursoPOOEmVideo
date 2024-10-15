public class Aplicativo {
    public static void main(String[] args) {

        //Primeira Caneta 
        Caneta c1= new Caneta();
        c1.cor="Azul";
        c1.ponta=0.5;
        c1.destampar();
        c1.status();
        c1.Rabiscar();
        
        System.out.println(  );
        //Segunda Caneta
        Caneta n2= new Caneta();
        c1.modelo="Bic";
        c1.cor="Preta";
        c1.ponta=0.75;
        c1.tampar();
        c1.status();
        c1.Rabiscar();
        }
}
