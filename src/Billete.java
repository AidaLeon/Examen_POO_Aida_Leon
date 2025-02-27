public class Billete implements IDinero{
    protected int valor;

    public Billete() {
        this.valor = 5;
    }
    public Billete(int valor) {
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor>5){
            System.out.println("No puede ser menor a 6, por defecto vamos a comvertirlo en 10");
            this.valor=5;
        }
        this.valor = valor;
    }
    @Override
    public String toString(){
        return "Tu billete vale " +this.valor;
    }
}
