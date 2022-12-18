/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import gt.edu.usac.compiler.TokenConstants;

/**
 *
 * @author OrdSon
 */
//PENDIENTE DE IMPLEMENTAR METODO DE RESOLUCION
public class Condicion extends Expresion{
    private TokenConstants valor; //True o false
    private boolean negado;
    private boolean simple;//solo tiene un valor
    private TokenConstants signo;
    private Valor izq;
    private Valor der;

    public Condicion(boolean negado, TokenConstants signo, Valor izq, Valor der, int linea, int columna) {
        this.negado = negado;
        this.signo = signo;
        this.izq = izq;
        this.der = der;
        this.linea = linea;
        this.columna = columna;
        this.simple = false;
    }

    public Condicion(Valor izq, boolean negado, int linea, int columna) {
        this.izq = izq;
        this.negado = negado;
        this.linea = linea;
        this.columna = columna;
        this.simple = true;
    }

    public TokenConstants getValor() {
        return valor;
    }

    public void setValor(TokenConstants valor) {
        this.valor = valor;
    }

    public boolean isNegado() {
        return negado;
    }

    public void setNegado(boolean negado) {
        this.negado = negado;
    }

    public boolean isSimple() {
        return simple;
    }

    public void setSimple(boolean simple) {
        this.simple = simple;
    }

    public TokenConstants getSigno() {
        return signo;
    }

    public void setSigno(TokenConstants signo) {
        this.signo = signo;
    }

    public Valor getIzq() {
        return izq;
    }

    public void setIzq(Valor izq) {
        this.izq = izq;
    }

    public Valor getDer() {
        return der;
    }

    public void setDer(Valor der) {
        this.der = der;
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
