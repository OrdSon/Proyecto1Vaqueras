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
public class Llamada extends Expresion{
    String nombre = "";
    String label = "Llamada";
    ListaValores parametros = new ListaValores();
    Valor valor;//PENDIENTE DE IMPLEMENTAR

    public Llamada() {
    }
    /**
     * Construye llamada del tipo:
     * Identificador(id1, val1, id2 ... idN, valN);
     * @param nombre
     * @param parametros
     * @param linea
     * @param columna 
     */
    public Llamada(String nombre, ListaValores parametros, int linea, int columna){
        this.nombre = nombre;
        this.parametros = parametros;
        this.linea = linea;
        this.columna = columna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaValores getParametros() {
        return parametros;
    }

    public void setParametros(ListaValores parametros) {
        this.parametros = parametros;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
