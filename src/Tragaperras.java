import java.util.ArrayList;

public class Tragaperras {

    public static void main(String[] args) {
         ArrayList<Billete> cartera=new ArrayList<>();
        int limit=0;

        Billete billete=new Billete(30);
        cartera.add(billete);

        /*No me ha dado tiempo*/

        Cartera cartera1=new Cartera(cartera,limit);
    }


}
