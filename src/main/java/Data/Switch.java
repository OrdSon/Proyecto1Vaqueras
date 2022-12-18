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
public class Switch extends Expresion{
    LinkedList<Case> cases;
    Valor condicion;

    public Switch(Valor condicion, LinkedList<Case> cases, int linea, int columna) {
        this.cases = cases;
        this.condicion = condicion;
        this.linea = linea;
        this.columna = columna;
        
    }

    public LinkedList<Case> getCases() {
        return cases;
    }

    public void setCases(LinkedList<Case> cases) {
        this.cases = cases;
    }

    public Valor getCondicion() {
        return condicion;
    }

    public void setCondicion(Valor condicion) {
        this.condicion = condicion;
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
