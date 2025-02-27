import java.util.ArrayList;

public class Cartera {
    protected ArrayList<Billete> cartera=new ArrayList<>();
    /*contador para no pasar las carteras*/
    protected int limit;

    public Cartera(ArrayList<Billete> cartera, int limit) {
        this.cartera = cartera;
        this.limit = limit;
    }

    public ArrayList<Billete> getCartera() {
        return cartera;
    }

    public void setCartera(ArrayList<Billete> cartera) {
        this.cartera = cartera;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    /* AÑADIR
    public void anyadir(Billete billete, int limit){
        for (Billete billete1: cartera){
            if (billete1==null){
                cartera.add(billete);
                limit++;
            }
        }
    }

     */
}
