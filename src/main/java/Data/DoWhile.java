/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.LinkedList;

/**
 *
 * @author OrdSon
 */
public class DoWhile extends Expresion{
    private LinkedList<Expresion> expresiones;
    private LinkedList<Condicion> condiciones;
    
    public DoWhile(LinkedList<Expresion> expresiones, LinkedList<Condicion> condiciones, int linea, int columna) {
        this.expresiones = expresiones;
        this.condiciones = condiciones;
        this.linea = linea;
        this.columna = columna;
    }
    
}
