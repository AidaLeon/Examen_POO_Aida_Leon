public class Pocion extends Articulo {
    protected int nivel;
    protected String efectos;


    public Pocion(int nivel, String efectos) {
        this.nivel = nivel;
        this.efectos = efectos;
    }

    public Pocion(String nombre, boolean gratis, int nivel, String efectos) {
        super(nombre, gratis);
        this.nivel = nivel;
        this.efectos = efectos;
    }

    @Override
    public double precio(){
        int precio=5*this.nivel;
        return precio;
    }
    @Override
    public String toString(){
        return "Tu poción cuesta " + precio();
    }


}
