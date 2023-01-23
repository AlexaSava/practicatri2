package daw.practica.obra;

public class arte {
      private int id;
    private String nombre;
    private String autor;
    private String tecnico;
    private double precio;
    private double altura;
    private double peso;
    private int piezas;
    private String desc;


    
    public arte(int id, String nombre, String autor, String tecnico, double precio, double altura, double peso,
            int piezas, String desc) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.tecnico = tecnico;
        this.precio = precio;
        this.altura = altura;
        this.peso = peso;
        this.piezas = piezas;
        this.desc = desc;
    }

    
}
