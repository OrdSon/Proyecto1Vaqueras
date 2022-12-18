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
public class For extends Expresion{
    private Declaracion declaracion;
    private String identificador;
    private Asignacion asignacion;
    
    private Condicion condicion;
    
    private TokenConstants cambio;
    
    private LinkedList<Expresion> expresiones;

    public For(Declaracion declaracion, Condicion condicion, TokenConstants cambio, LinkedList<Expresion> expresiones, int linea, int columna) {
        this.declaracion = declaracion;
        this.condicion = condicion;
        this.cambio = cambio;
        this.expresiones = expresiones;
        this.linea = linea;
        this.columna = columna;
    }

    public Declaracion getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(Declaracion declaracion) {
        this.declaracion = declaracion;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public TokenConstants getCambio() {
        return cambio;
    }

    public void setCambio(TokenConstants cambio) {
        this.cambio = cambio;
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
