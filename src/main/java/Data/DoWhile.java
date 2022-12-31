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
    private ListaExpresiones expresiones;
    private ListaCondiciones condiciones;
    
    public DoWhile(ListaExpresiones expresiones, ListaCondiciones condiciones, int linea, int columna) {
        this.expresiones = expresiones;
        this.condiciones = condiciones;
        this.linea = linea;
        this.columna = columna;
        salida = "while True: \n"+expresiones.toString()+"if ( "+condiciones.toString()+" ):"+" \n break";
    }

    public ListaExpresiones getExpresiones() {
        return expresiones;
    }

    public void setExpresiones(ListaExpresiones expresiones) {
        this.expresiones = expresiones;
    }

    public ListaCondiciones getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(ListaCondiciones condiciones) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
