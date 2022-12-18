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
public class Funcion extends Expresion{
        String nombre;
        TokenConstants tipoFuncion;
        LinkedList<Parametro> parametros;
        LinkedList<Expresion> expresiones;

    public Funcion(TokenConstants tipoFuncion, String nombre,  LinkedList<Parametro> parametros, LinkedList<Expresion> expresiones, int linea, int columna) {
        this.nombre = nombre;
        this.tipoFuncion = tipoFuncion;
        this.parametros = parametros;
        this.expresiones = expresiones;
        this.linea = linea;
        this.columna = columna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TokenConstants getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(TokenConstants tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }

    public LinkedList<Parametro> getParametros() {
        return parametros;
    }

    public void setParametros(LinkedList<Parametro> parametros) {
        this.parametros = parametros;
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
