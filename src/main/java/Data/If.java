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
public class If extends Expresion{
    private LinkedList<Condicion> condiciones;
    private LinkedList<Expresion> expresiones;
    private boolean valor;

    public If(LinkedList<Condicion> condiciones, LinkedList<Expresion> expresiones, boolean valor, int linea, int columna) {
        this.condiciones = condiciones;
        this.expresiones = expresiones;
        this.valor = valor;
        this.linea = linea;
        this.columna = columna;
    }

    public LinkedList<Condicion> getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(LinkedList<Condicion> condiciones) {
        this.condiciones = condiciones;
    }

    public LinkedList<Expresion> getExpresiones() {
        return expresiones;
    }

    public void setExpresiones(LinkedList<Expresion> expresiones) {
        this.expresiones = expresiones;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
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
