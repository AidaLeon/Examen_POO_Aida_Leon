import java.util.ArrayList;
import java.util.Scanner;

public class TiendaPokemonTPV {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean salir=false;
        ArrayList<Articulo> cesta=new ArrayList<>();
        int opcion;
        while (!salir) {
            do {
                menu();
                opcion = in.nextInt();
            } while (opcion < 0 || opcion > 7);
            switch (opcion) {
                case 1 -> {

                    String tipo = "POCION";
                    int opciongratis;
                    boolean gratis = true;
                    do {
                        System.out.println("Es gratis?" +
                                "1-Si" +
                                "2-No");
                        opciongratis = in.nextInt();
                    } while (opciongratis < 1 || opciongratis > 2);
                    switch (opciongratis) {
                        case 1 -> {
                            gratis = true;
                        }
                        default -> {
                            gratis = false;
                        }
                    }

                    System.out.println("Dime el nivel");
                    int nivel = in.nextInt();
                    /*pongo solo un efecto por tiempo*/
                    System.out.println("Dime sus efectos");
                    String efectos = in.nextLine();

                    Pocion pocion = new Pocion(tipo, gratis, nivel, efectos);

                    cesta.add(pocion);

                }
                case 2 -> {
                    String tipo = "POKEBALL";
                    int opciongratis;
                    boolean gratis = true;
                    do {
                        System.out.println("Es gratis?" +
                                "1-Si" +
                                "2-No");
                        opciongratis = in.nextInt();
                    } while (opciongratis < 1 || opciongratis > 2);
                    switch (opciongratis) {
                        case 1 -> {
                            gratis = true;
                        }
                        default -> {
                            gratis = false;
                        }
                    }
                    int opcionball;
                    do {
                        System.out.println("Tipo de pokeball\n" +
                                "1-> POKEBALL\n" +
                                "2-> GREATBALL\n" +
                                "3-> ULTRABALL");
                        opcionball = in.nextInt();
                    } while (opcionball < 0 || opcionball > 3);
                    String ballnombre;
                    switch (opcionball) {
                        case 1 -> {
                            ballnombre = "POKEBALL";
                        }
                        case 2 -> {
                            ballnombre = "GREATBALL";
                        }
                        default -> {
                            ballnombre = "ULTRABALL";
                        }
                    }
                    Pokebola pokebola = new Pokebola(tipo, gratis, ballnombre);
                    cesta.add(pokebola);
                }
                case 3 -> {
                    String tipo = "ACCESORIO";
                    int opciongratis;
                    boolean gratis = true;
                    do {
                        System.out.println("Es gratis?" +
                                "1-Si" +
                                "2-No");
                        opciongratis = in.nextInt();
                    } while (opciongratis < 1 || opciongratis > 2);
                    switch (opciongratis) {
                        case 1 -> {
                            gratis = true;
                        }
                        default -> {
                            gratis = false;
                        }
                    }
                    System.out.println("Dime el nombre del accesorio");
                    String accesorio = in.nextLine();

                    Accesorio accesorio1 = new Accesorio(tipo, gratis, accesorio);
                    cesta.add(accesorio1);

                }

                /*no me ha dado tiempo*/

                case 7 -> {
                    salir=true;

                }
            }
        }
        System.out.println("Adios");




    }

    public static void menu(){
        System.out.println("Qué deseas hacer?\n" +
                "1-> Añadir pocion al ticket\n" +
                "2-> Añadir pokeball al ticket.\n" +
                "3-> Añadir accesorio al ticket.\n" +
                "4-> borrar el articulo del ticketr.\n" +
                "5-> Mostrar todos los articulos del ticket\n"+
                "6-> Mostrar total\n"+
                "7-> Salir.");
    }

}
