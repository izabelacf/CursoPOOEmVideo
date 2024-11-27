public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco (float saldo, boolean status){
        setSaldo(0);
        setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);{
            if (getTipo().equals("CC")){
                setSaldo(50);
            }else if(getTipo().equals("CP")){
                setSaldo(150);
            }
            System.out.println("Conta aberta com sucesso!");
        }
    }

    public void fecharConta(){
        if( getSaldo()>0){
            System.out.println("Conta com dinheiro");
        }else if (getSaldo()<0) {
            System.out.println("Conta em débito");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float v){
        if(isStatus()){
            setSaldo(getSaldo()+v);
            System.out.println("Depósito realizado na conta de "+getDono());
        }else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float v){
        if(isStatus()){
            if(getSaldo()>=v){
                setSaldo(getSaldo()-v);
                System.out.println("Saque realizado na conta de "+getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
        int v=0;
        if(getTipo()=="CC"){
            v=12;
        }else if(getTipo()=="CP"){
            v=20;
        }
        if(isStatus()){
            setSaldo(getSaldo()-v);
            System.out.println("Mensalidade paga");
        }else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }
    

    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: "+getNumConta());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Dono: "+getDono());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Status: "+isStatus());
    }
}   
