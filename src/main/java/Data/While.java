/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import gt.edu.usac.compiler.TokenConstants;
import java.util.LinkedList;

/**
 *
 * @author OrdSon
 */
public class While extends Expresion{
    private LinkedList<Expresion> expresiones;
    private LinkedList<Condicion> condiciones;

    public While(LinkedList<Expresion> expresiones, LinkedList<Condicion> condiciones, int linea, int columna) {
        this.expresiones = expresiones;
        this.condiciones = condiciones;
        this.linea = linea;
        this.columna = columna;
    }

    public LinkedList<Expresion> getExpresiones() {
        return expresiones;
    }

    public void setExpresiones(LinkedList<Expresion> expresiones) {
        this.expresiones = expresiones;
    }

    public LinkedList<Condicion> getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(LinkedList<Condicion> condiciones) {
        this.condiciones = condiciones;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public TokenConstants getTipo() {
        return tipo;
    }

    public void setTipo(TokenConstants tipo) {
        this.tipo = tipo;
    }
    
    
}
