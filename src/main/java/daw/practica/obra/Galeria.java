package daw.practica.obra;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.serial.SerialArray;

import daw.practica.AlmacenPorqueria.Fors;
import daw.practica.AlmacenPorqueria.Todo;

public class Galeria {

    /**
     * @param args
     */

    static final int VER_OBRAS = 1;
    static final int DAR_ALTA_OBRA_NUEVA = 2;
    static final int NUMERO_ELEGIR_TOTAL = 7;

    public static void main(String[] args){
    
    
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

                    case DAR_ALTA_OBRA_NUEVA:
                    Todo.AltaNuevaObra();
                }

                

                
            }
            
           

        }

        }
