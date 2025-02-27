public class Accesorio extends Articulo{
    protected String nombreAccesorio;


    public Accesorio(String nombre, boolean gratis, String nombreAccesorio) {
        super(nombre, gratis);
        this.nombreAccesorio = nombreAccesorio;
    }

    @Override
    public double precio(){
        return 7;
    }

    @Override
    public String toString(){
        return "Tu accesorio cuesta " + precio();
    }
}
