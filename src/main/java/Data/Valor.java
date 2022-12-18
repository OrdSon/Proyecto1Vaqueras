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
//Posible herencia a Expresion
public class Valor {
    private String cadena;
    private int entero;
    private double decimal;
    private TokenConstants tipoValor;
    int linea;
    int columna;


    public Valor(String cadena, TokenConstants tipoValor, int linea, int columna) {
        this.cadena = cadena;
        this.tipoValor = tipoValor;
        this.linea = linea;
        this.columna = columna;
    }

    public Valor(int entero, int linea, int columna) {
        this.entero = entero;
        this.tipoValor = TokenConstants.intValue;
        this.linea = linea;
        this.columna = columna;
        
    }

    public Valor(double decimal, int linea, int columnal) {
        this.decimal = decimal;
        this.tipoValor = TokenConstants.doubleValue;
        this.linea = linea;
        this.columna = columna;
        
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.tipoValor = TokenConstants.stringValue;
        this.cadena = cadena;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.tipoValor = TokenConstants.intValue;
        this.entero = entero;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.tipoValor = TokenConstants.doubleValue;
        this.decimal = decimal;
    }

    public TokenConstants getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(TokenConstants tipoValor) {
        this.tipoValor = tipoValor;
    }
    


    @Override
    public String toString() {
        switch (tipoValor) {//PENDIENTE METODO PARA BUSCAR VALOR DE VARIABLE
            case stringValue -> {
                if (cadena != null) {
                    return cadena;
                }
            }
            case doubleValue -> {
                return decimal + "";
            }

            case intValue -> {
                return entero + "";
            }
            default -> throw new AssertionError();
        }
        //PENDIENTE METODO PARA BUSCAR VALOR DE VARIABLE
        return "Tipo invalido: " + tipoValor;
    }


}
