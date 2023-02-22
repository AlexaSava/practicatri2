package daw.practica.obra;

public abstract class Arte {
      private int id;
    private String nombre;
    private String autor;
    private String tecnico;
    private double precio;
    private double altura;
    private double peso;
    private int piezas;
    private String desc;

    
    public Arte(int id, String nombre, String autor, String tecnico, double precio, double altura, double peso,
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


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getTecnico() {
        return tecnico;
    }


    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public int getPiezas() {
        return piezas;
    }


    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }


    public String getDesc() {
        return desc;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }


}
