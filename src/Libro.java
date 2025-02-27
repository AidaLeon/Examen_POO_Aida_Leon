public class Libro {
    private  String isbn;
    private String nombre;
    private String autor;
    private int numPaginas;
    private String genero;
    public String tipo;

    public Libro() {
        this.isbn = "0001";
        this.genero = "Romance";
        this.nombre = "Teo va al parque";
        this.numPaginas = 200;
        this.autor="Pepe";
        this.tipo="Tapa Blanda";
    }

    public Libro(String isbn, String genero, String nombre, int numPaginas, String autor, String tipo) {
        this.isbn = isbn;
        this.genero = genero;
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        this.autor= autor;
        this.tipo=tipo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn.isEmpty()){
            System.out.println("Valor no valido");
        }else {
            this.isbn = isbn;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()){
            System.out.println("Valor no valido");
        }else {
            this.nombre = nombre;
        }
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if(numPaginas<1){
            System.out.println("Número de páginas incorrecto");
        }else {
            this.numPaginas = numPaginas;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero.isEmpty()){
            System.out.println("Género no valido");
        }else {
            this.genero = genero;
        }

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (nombre.isEmpty()){
            System.out.println("Nombre no valido");
        }else {
            this.autor = autor;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int gramos(){
        switch (this.tipo){
            case "TAPA DURA"->{
                return 50;
            }case "TAPA BLANDA"->{
                return 20;
            }default -> {
                return 10;
            }
        }
    }

    @Override
    public String toString(){
        return "Nombre del libre " + this.nombre +"\n" +
                "Nombre del autor " + this.autor +"\n" +
                "Tu libro pesa " + this.nombre +"\n"+
                "Tu libro pesa " + gramos() +" gramos";
    }

}
