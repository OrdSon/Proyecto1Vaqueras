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
public class Expresion {
    LinkedList<Expresion> cuerpo = new LinkedList<>();
    LinkedList<Expresion> parametros = new LinkedList<>();
    String valor;
    String nombre;    
    int linea;
    int columna;
    TokenConstants tipo;

    public Expresion(String nombre, int linea, int columna, TokenConstants tipo) {
        this.nombre = nombre;
        this.linea = linea;
        this.columna = columna;
        this.tipo = tipo;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Expresion> getExpresions() {
        return cuerpo;
    }

    public void setExpresions(LinkedList<Expresion> expresions) {
        this.cuerpo = expresions;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
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
    
    
    public void append(Expresion expresion){
        cuerpo.add(expresion);
    }

    public LinkedList<Expresion> getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(LinkedList<Expresion> cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LinkedList<Expresion> getParametros() {
        return parametros;
    }

    public void setParametros(LinkedList<Expresion> parametros) {
        this.parametros = parametros;
    }
    
}
