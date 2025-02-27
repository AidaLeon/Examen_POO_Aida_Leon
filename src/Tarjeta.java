public class Tarjeta implements IDinero{
    protected String numero;
    protected double saldo;
    protected double credito;

    public Tarjeta(String numero, double credito, double saldo) {
        setCredito(this.credito);
        setNumero(this.numero);
        setSaldo(this.saldo);

    }

    public Tarjeta() {
        this.numero = "000";
        this.credito = 5;
        this.saldo = 5;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        if (credito<1){
            System.out.println("credito no valido, por defecto vamos a dar 5");
            this.credito=5;
        }else {
            this.credito = credito;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (credito<1){
            System.out.println("Saldo no valido, por defecto vamos a dar 5");
            this.credito=5;
        }else {
        this.saldo = saldo;}
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        return "Tu numero de cuenta es " + this.numero + "\n"+
                "Tu saldo es " + this.saldo + "\n"+
                "Tu credito es de " + this.credito ;
    }
}
