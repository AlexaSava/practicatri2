package daw.practica.AlmacenPorqueria;

import daw.practica.obra.Galeria;

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
        if ( como.equals("Pintura")){

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

        }else if (como.equals("Esculturas")){
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

}
