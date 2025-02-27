import javax.print.DocFlavor;

public class Pokebola extends Articulo{
    protected String tipoBola;


    public Pokebola(String nombre, boolean gratis, String tipoBola) {
        super(nombre, gratis);
        this.tipoBola = tipoBola;
    }

    @Override
    public double precio(){
        switch (tipoBola){
            case "POKEBALL"->{
                return 2;
            }case "GREATBALL"->{
                return 5;
            }default->{
                return 10;
            }
        }
    }
    @Override
    public String toString(){
        return "Tu  Pokeball cuesta " + precio();
    }
}
