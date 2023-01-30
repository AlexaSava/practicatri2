package daw.practica.obra;

public class escultura extends arte{
    
    private String material;

    public escultura(int id, String nombre, String autor, String tecnico, double precio, double altura, double peso,
            int piezas, String desc, String material) {
        super(id, nombre, autor, tecnico, precio, altura, peso, piezas, desc);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    

}
