package daw.practica.obra;

public class Pintorica extends Arte {

    private String tecnica;

    public Pintorica(int id, String nombre, String autor, String tecnico, double precio, double altura, double peso,
            int piezas, String desc, String tecnica) {
        super(id, nombre, autor, tecnico, precio, altura, peso, piezas, desc);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public double descuentoPintura(){
        double descuento = getPrecio() - (getPrecio() * 0.10);
        return descuento;

    }
}
