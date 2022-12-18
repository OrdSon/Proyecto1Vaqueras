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
public class Declaracion extends Expresion {

    TokenConstants tipoValor;
    String nombre;
    LinkedList<String> identificadores;
    Valor valor;

    /**
     *
     * @param tipoValor
     * @param nombre
     * @param valor
     *
     * Crea declaraciones del tipo: Tipo nombre = Valor;
     * @param linea
     * @param columna
     */
    public Declaracion(TokenConstants tipoValor, String nombre, Valor valor, int linea, int columna) {
        this.tipoValor = tipoValor;
        this.nombre = nombre;
        this.valor = valor;
        this.linea = linea;
        this.columna = columna;
    }

    /**
     * Crea declaraciones del tipo: Tipo id1, id2, id3 ...idN = Valor;
     *
     * @param tipoValor
     * @param identificadores
     * @param valor
     * @param linea
     * @param columna
     */
    public Declaracion(TokenConstants tipoValor, LinkedList<String> identificadores, Valor valor, int linea, int columna) {
        this.tipoValor = tipoValor;
        this.valor = valor;
        this.identificadores = identificadores;
        this.linea = linea;
        this.columna = columna;
    }

    /**
     *
     * @param tipo
     * @param identificadores
     *
     * Crea declaracion del tipo: Tipo id1, id2, id3 ... idN;
     * @param linea
     * @param columna
     */
    public Declaracion(TokenConstants tipo, LinkedList<String> identificadores, int linea, int columna) {
        this.tipo = tipo;
        this.identificadores = identificadores;
        this.linea = linea;
        this.columna = columna;
    }

    /**
     * Crea declaraciones del tipo: Tipo id1;
     *
     * @param tipoValor
     * @param nombre
     * @param linea
     * @param columna
     */
    public Declaracion(TokenConstants tipoValor, String nombre, int linea, int columna) {
        this.tipoValor = tipoValor;
        this.nombre = nombre;
        this.linea = linea;
        this.columna = columna;
    }

    public TokenConstants getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(TokenConstants tipoValor) {
        this.tipoValor = tipoValor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> getIdentificadores() {
        return identificadores;
    }

    public void setIdentificadores(LinkedList<String> identificadores) {
        this.identificadores = identificadores;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
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
