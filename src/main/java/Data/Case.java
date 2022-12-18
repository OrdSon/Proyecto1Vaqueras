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
public class Case extends Expresion{
    private Valor valor;
    private LinkedList<Expresion> expresiones;
    private boolean Default;

    public Case(Valor valor, LinkedList<Expresion> expresiones, int linea, int columna) {
        this.valor = valor;
        this.expresiones = expresiones;
        this.linea = linea;
        this.columna = columna;
    }
    public Case(boolean defecto, LinkedList<Expresion> expresiones, int linea, int columna) {
        this.expresiones = expresiones;
        this.linea = linea;
        this.columna = columna;
        this.Default = defecto;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public LinkedList<Expresion> getExpresiones() {
        return expresiones;
    }

    public void setExpresiones(LinkedList<Expresion> expresiones) {
        this.expresiones = expresiones;
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
