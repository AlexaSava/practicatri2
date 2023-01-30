package daw.practica.obra;

import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

import daw.practica.AlmacenPorqueria.Fors;
import daw.practica.AlmacenPorqueria.Todo;

public class Galeria {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final int VER_OBRAS = 1;
        
        final int NUMERO_ELEGIR_TOTAL = 7;


        Scanner pepe = new Scanner(System.in);
        System.out.println("Eliga una opción");

        Todo.Cosas();
        int elegir = 0;
        while (elegir != NUMERO_ELEGIR_TOTAL) {
            elegir = pepe.nextInt();
            
        
                switch (elegir){
                    case VER_OBRAS:
                    Fors.LeerPinturas();
                    Fors.LeerEsculturas();
                    continue;
                }
            }

           

            

        }
    }

