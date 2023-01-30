package daw.practica.AlmacenPorqueria;



public class Fors {

    public static void LeerPinturas() {

        for (int i = 0; i < Todo.getTotalDePinturas().length; i++) {
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

    public static void LeerEsculturas() {
        for (int i = 0; i < Todo.getTotalDeEscultura().length; i++) {
            System.out.print(Todo.getTotalDeEscultura()[i].getId() + " ");
            System.out.print(Todo.getTotalDeEscultura()[i].getNombre() + " ");
            System.out.print(Todo.getTotalDeEscultura()[i].getAutor() + " ");
            System.out.print(Todo.getTotalDeEscultura()[i].getTecnico() + " ");
            System.out.print(Todo.getTotalDeEscultura()[i].getPrecio() + " ");
            System.out.print(Todo.getTotalDeEscultura()[i].getAltura() + " ");
            System.out.print(Todo.getTotalDeEscultura()[i].getPeso() + " ");
            System.out.print(Todo.getTotalDeEscultura()[i].getPiezas() + " ");
            System.out.print(Todo.getTotalDeEscultura()[i].getDesc() + " ");

            System.out.println(" ");
        }
        System.out.println(" ");
    }

}
