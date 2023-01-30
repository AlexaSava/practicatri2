package daw.practica.obra;

public class pintorica extends arte {
    
    private String tecnica;

    public pintorica(int id, String nombre, String autor, String tecnico, double precio, double altura, double peso,
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

    
}
