abstract class Articulo {
    protected String nombre;
    protected boolean gratis;

    public Articulo() {
        this.nombre = "Pikachu";
        this.gratis = true;
    }


    public Articulo(String nombre, boolean gratis) {
        this.nombre = nombre;
        this.gratis = gratis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()){
            System.out.println("Nombre no valido");
            System.out.println("Por defecto vamos a darte Pikachu");
            this.nombre="Pikachu";
        }
        this.nombre = nombre;
    }

    public String tipo(){
        return "  ";
    }
    public double precio(){
        return 0;
    }
}
