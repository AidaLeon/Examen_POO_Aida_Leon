import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorDeLibros {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Map<String, Libro> libros=new HashMap<>();
        int opcion;
        boolean salir=false;
        while (!salir) {
            do {
                menu();
                opcion = in.nextInt();
            } while (opcion < 1 || opcion > 5);
            switch (opcion){
                case 1->{
                    System.out.println("Dime si ISBN");
                    String isbn=in.nextLine();
                    in.nextLine();
                    System.out.println("Dime su nombre");
                    String nombre=in.nextLine();
                    System.out.println("Dime su autor");
                    String autor=in.nextLine();
                    System.out.println("Dime el numero de páginas");
                    int paginas=in.nextInt();
                    System.out.println("Dime su genero");
                    in.nextLine();
                    String genero=in.nextLine();
                    System.out.println("Dime su formato, recuerda Tapa blanda (1), Tapa dura (2), bolsillo (3)");
                    int opciontipo=in.nextInt();
                    if (opciontipo<1||opciontipo>3){
                        System.out.println("Tu valor no es correcto, por defecto vamos a ponerte tapa blanda");
                        opciontipo=1;
                        in.nextLine();
                    }
                    String tipoLibro;
                    switch (opciontipo){
                        case 1->{
                            tipoLibro="TAPA BLANDA";
                        }case 2->{
                            tipoLibro="TAPA DURA";
                        }default -> {
                            tipoLibro="BOLSILLO";
                        }
                    }
                    Libro libro=new Libro(isbn,genero,nombre,paginas,autor,tipoLibro);
                    libros.put(isbn,libro);
                }case 2->{
                    /*LO QUITO PARA QUE SIGA FUNCIONANDO*/
                    /*
                    in.nextLine();
                    */
                    System.out.println("Dime su ISBN");
                    String isbn1=in.nextLine();
                    System.out.println(isbn1);
                    /*no se porque no me coge la clave principal coge la logitud*/
                    if (libros.containsKey(isbn1)){
                        Libro libro=libros.get(isbn1);
                        System.out.println(libro);
                    }else {
                        System.out.println("No tenemos registros de este libro");
                    }

                }case 3->{
                    System.out.println("Dime su ISBN");
                    String isbn=in.nextLine();
                    if (libros.containsKey(isbn)){
                        System.out.println("dime su numero genero");
                        String genero=in.nextLine();
                        Libro libro=libros.get(isbn);
                        libro.setGenero(genero);
                        System.out.println(libro);
                    }


                }case 4->{
                    System.out.println("Dime su isbn");
                    String isbn=in.nextLine();

                    if (libros.containsKey(isbn)){
                        /*no se mostrarte todos*/
                        System.out.println("el nombre del auto");
                        String nombre=in.nextLine();
                        Libro libro=libros.get(nombre);
                        System.out.println(libro);
                    }else {
                        System.out.println("No tenemos registro");
                    }

                }default -> {
                    salir=true;
                }
            }

        }
        System.out.println("Adios");

    }
    public static void menu(){
        System.out.println("Qué deseas hacer?\n" +
                "1-> Introducir libro\n" +
                "2-> Mostrar información de un libro.\n" +
                "3-> Modificar el género de un libro.\n" +
                "4-> Buscar todos los libros de un autor.\n" +
                "5-> Salir");
    }
}
