package daw.practica.obra;

import java.util.Scanner;

import daw.practica.AlmacenPorqueria.Fors;
import daw.practica.AlmacenPorqueria.Todo;

public class Galeria {

    /**
     * @param args
     */

    public static final int VER_OBRAS = 1;
    public static final int DAR_ALTA_OBRA_NUEVA = 2;
    public static final int MODIFICAR_OBRA = 3;
    public static final int VISUALIZAR_OBRA_ARTE = 4;
    public static final int PRECIO_VENTAS = 5;
    public static final int IMPRIMIR_ETIQUETA = 6;
    public static final int NUMERO_ELEGIR_TOTAL = 7;
    public static final int PORCENTAJE = 25;
    public static final int PORCENTAJE_PESO_MAX = 100;
    public static final int PORCENTAJE_PESO_MIN = 20;
    public static final int PORCENTAJE_ALTURA_MAX = 100;
    public static final int PORCENTAJE_ALTURA_MIN = 20;
    public static final int ADICIONALES = 10;

    public static void main(String[] args) {

        Scanner pepe = new Scanner(System.in);
        System.out.println("Eliga una opción");

        Todo.Cosas();
        int elegir = 0;
        while (elegir != NUMERO_ELEGIR_TOTAL) {
            
            elegir = pepe.nextInt();

            switch (elegir) {
                case VER_OBRAS:
                    Fors.LeerPinturas();
                    Fors.LeerEsculturas();
                    continue;

                case DAR_ALTA_OBRA_NUEVA:
                    Todo.AltaNuevaObra();
                    continue;

                case MODIFICAR_OBRA:
                    Todo.ModificarObra();
                    continue;

                case VISUALIZAR_OBRA_ARTE:
                    Todo.VisualizarObras();
                    continue;

                case PRECIO_VENTAS:
                Todo.VentasPrecio();

                case IMPRIMIR_ETIQUETA:
                Todo.ImprimirEtiqueta();
            }

        }

    }

}
