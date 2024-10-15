public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("A cor da caneta é: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? "+this.tampada);
    }

    void Rabiscar(){
        if (this.tampada==true){
            System.out.println("Erro. A caneta está tampada!");
        }
        else {
            System.out.println("O rabisco foi feito");
        }

    }

    void tampar(){
        this.tampada= true;
    }

    void destampar(){
        this.tampada= false;

    }



}