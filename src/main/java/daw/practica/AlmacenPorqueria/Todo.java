package daw.practica.AlmacenPorqueria;

import daw.practica.obra.Galeria;

import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import daw.practica.obra.Escultura;
import daw.practica.obra.Pintorica;

public class Todo {

    public static void Cosas() {
        System.out.println("1.Visualizar las obras de arte existentes en la galería.");
        System.out.println("2.Dar de alta una nueva obra de arte");
        System.out.println("3.Modificar los datos de una de las obras de arte expuestas");
        System.out.println("4. Visualizar los datos de una de las obras de arte expuestas");
        System.out.println("5. Obtener el precio de venta de una de las obras de arte expuestas");
        System.out.println("6. Imprimir una etiqueta para clasificar una de las obras expuestas");
        System.out.print("¿Qué opción deseas?: ");
    }

    static Pintorica guernica = new Pintorica(001, "Guernica", "P.Picasso", "Óleo", 1000, 5, 2, 5,
            "caudro guerra civil",
            "Óleo");
    static Pintorica lavie = new Pintorica(002, "lavie", "P.Picasso", "Óleo", 200, 1, 1, 1, "Óleo", "Óleo");
    static Pintorica elsueño = new Pintorica(003, "elsueño", "P.Picasso", "Óleo", 300, 1.3, 1, 1, "Óleo", "Óleo");
    static Pintorica retratoDeDoraMaar = new Pintorica(004, "retratoDeDoraMaar", "P.Picasso", "Óleo", 400, 1, 0.8, 1,
            "Óleo", "Óleo");
    static Escultura elPielRoja = new Escultura(005, "elPielRoja", "U.Checa", "Escultura", 350, 1, 0.8, 1, "escultura",
            "escultura");

    static Escultura[] totalDeEscultura = { elPielRoja };
    static Pintorica[] totalDePinturas = { guernica, lavie, elsueño, retratoDeDoraMaar };

    public static Escultura[] getTotalDeEscultura() {
        return totalDeEscultura;
    }

    public static void setTotalDeEscultura(Escultura[] totalDeEscultura) {
        Todo.totalDeEscultura = totalDeEscultura;
    }

    public static Pintorica[] getTotalDePinturas() {
        return totalDePinturas;
    }

    public static void setTotalDePinturas(Pintorica[] totalDePinturas) {
        Todo.totalDePinturas = totalDePinturas;
    }

    public static void AltaNuevaObra() {

        Scanner pepe = new Scanner(System.in);
        System.out.println("¿Qué quiere registar una Pintura o Escultura?");

        String como = pepe.nextLine();

        System.out.println();
        if (como.equals("Pintura")) {

            System.out.println("Ponga el ID");
            int id = pepe.nextInt();
            System.out.println("Ponga el Autor");
            String autor = pepe.nextLine();
            System.out.println("Defina la Tecnica");
            String tecnico = pepe.nextLine();
            System.out.println("Ponga el Precio");
            Double precio = pepe.nextDouble();
            System.out.println("Ponga la Altura");
            Double altura = pepe.nextDouble();
            System.out.println("Ponga el Peso");
            Double peso = pepe.nextDouble();
            System.out.println("Ponga el número de piezas");
            int piezas = pepe.nextInt();
            System.out.println("Describa la pintura");
            String desc = pepe.nextLine();
            System.out.println("Defina la Tecnica");
            String tecnica = pepe.nextLine();

            Pintorica registro = new Pintorica(id, como, autor, tecnico, piezas, piezas, id, piezas, desc, tecnica);

        } else if (como.equals("Esculturas")) {
            System.out.println("Ponga el ID");
            int id = pepe.nextInt();
            System.out.println("Ponga el Autor");
            String autor = pepe.nextLine();
            System.out.println("Defina la Tecnica");
            String tecnico = pepe.nextLine();
            System.out.println("Ponga el Precio");
            Double precio = pepe.nextDouble();
            System.out.println("Ponga la Altura");
            Double altura = pepe.nextDouble();
            System.out.println("Ponga el Peso");
            Double peso = pepe.nextDouble();
            System.out.println("Ponga el número de piezas");
            int piezas = pepe.nextInt();
            System.out.println("Describa la Escultura");
            String desc = pepe.nextLine();
            System.out.println("Ponga el Material");
            String material = pepe.nextLine();

            Escultura registro = new Escultura(id, como, autor, tecnico, piezas, piezas, id, piezas, desc, material);
        }
    }

    public static void ModificarObra() {
        Scanner pepe = new Scanner(System.in);
        System.out.println("¿Qué quiere modificar una Pintura o Escultura?");

        String como = pepe.nextLine();
        System.out.println();
        if (como.equals("Pintura")) {
            System.out.println("Ponga el ID");
            int id = pepe.nextInt();
            for (int i = 0; i < Todo.getTotalDePinturas().length; i++) {
                if (Todo.getTotalDePinturas()[i].getId() == id) {

                    System.out.println("Ponga un nuevo ID");
                    id = pepe.nextInt();
                    Todo.getTotalDePinturas()[i].setId(id);
                    System.out.println("Ponga un Nombre");
                    pepe.nextLine();
                    String nombre = pepe.nextLine();
                    Todo.getTotalDePinturas()[i].setNombre(nombre);
                    System.out.println("Ponga un Autor");
                    String autor = pepe.nextLine();
                    Todo.getTotalDePinturas()[i].setAutor(autor);
                    System.out.println("Ponga un Tecnico");
                    String tecnico = pepe.nextLine();
                    Todo.getTotalDePinturas()[i].setTecnico(tecnico);
                    System.out.println("Ponga el Precio");
                    Double precio = pepe.nextDouble();
                    Todo.getTotalDePinturas()[i].setPrecio(precio);
                    System.out.println("Ponga una Altura");
                    Double altura = pepe.nextDouble();
                    Todo.getTotalDePinturas()[i].setAltura(altura);
                    System.out.println("Ponga un Peso");
                    Double peso = pepe.nextDouble();
                    Todo.getTotalDePinturas()[i].setPeso(peso);
                    System.out.println("Ponga las Piezas");
                    int piezas = pepe.nextInt();
                    Todo.getTotalDePinturas()[i].setPiezas(piezas);
                    System.out.println("Ponga la Descripción");
                    String desc = pepe.nextLine();
                    Todo.getTotalDePinturas()[i].setDesc(desc);
                    System.out.println("Ponga la Tecnica");
                    String tecnica = pepe.nextLine();
                    Todo.getTotalDePinturas()[i].setTecnica(tecnica);
                }
            }
        } else if (como.equals("Escultura")) {
            System.out.println("Ponga el ID");
            int id = pepe.nextInt();
            for (int i = 0; i < Todo.getTotalDeEscultura().length; i++) {
                if (Todo.getTotalDeEscultura()[i].getId() == id) {
                    System.out.println("Ponga un nuevo ID");
                    id = pepe.nextInt();
                    Todo.getTotalDeEscultura()[i].setId(id);
                    System.out.println("Ponga un Nombre");
                    pepe.nextLine();
                    String nombre = pepe.nextLine();
                    Todo.getTotalDeEscultura()[i].setNombre(nombre);
                    System.out.println("Ponga un Autor");
                    String autor = pepe.nextLine();
                    Todo.getTotalDeEscultura()[i].setAutor(autor);
                    System.out.println("Ponga un Tecnico");
                    String tecnico = pepe.nextLine();
                    Todo.getTotalDeEscultura()[i].setTecnico(tecnico);
                    System.out.println("Ponga el Precio");
                    Double precio = pepe.nextDouble();
                    Todo.getTotalDeEscultura()[i].setPrecio(precio);
                    System.out.println("Ponga una Altura");
                    Double altura = pepe.nextDouble();
                    Todo.getTotalDeEscultura()[i].setAltura(altura);
                    System.out.println("Ponga un Peso");
                    Double peso = pepe.nextDouble();
                    Todo.getTotalDeEscultura()[i].setPeso(peso);
                    System.out.println("Ponga las Piezas");
                    int piezas = pepe.nextInt();
                    Todo.getTotalDeEscultura()[i].setPiezas(piezas);
                    System.out.println("Ponga la Descripción");
                    String desc = pepe.nextLine();
                    Todo.getTotalDeEscultura()[i].setDesc(desc);
                    System.out.println("Ponga la Material");
                    String material = pepe.nextLine();
                    Todo.getTotalDeEscultura()[i].setMaterial(material);

                }

            }

        }

    }

    public static void VisualizarObras() {
        Scanner pepe = new Scanner(System.in);

        System.out.println("¿Que quieres visualizar Pintura o Escultura?");

        String como = pepe.nextLine();
        System.out.println();
        if (como.equals("Pintura")) {
            System.out.println("Ponga el ID");
            int id = pepe.nextInt();

            for (int i = 0; i < Todo.getTotalDePinturas().length; i++) {
                if (Todo.getTotalDePinturas()[i].getId() == id) {

                    System.out.print(Todo.getTotalDePinturas()[i].getId() + " ");
                    System.out.print(Todo.getTotalDePinturas()[i].getNombre() + " ");
                    System.out.print(Todo.getTotalDePinturas()[i].getAutor() + " ");
                    System.out.print(Todo.getTotalDePinturas()[i].getTecnico() + " ");
                    System.out.print(Todo.getTotalDePinturas()[i].getPrecio() + " ");
                    System.out.print(Todo.getTotalDePinturas()[i].getAltura() + " ");
                    System.out.print(Todo.getTotalDePinturas()[i].getPeso() + " ");
                    System.out.print(Todo.getTotalDePinturas()[i].getPiezas() + " ");
                    System.out.print(Todo.getTotalDePinturas()[i].getDesc() + " ");

                    System.out.println(" ");
                }
                System.out.println(" ");
            }

        }

    }

}