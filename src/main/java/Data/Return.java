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
public class Return extends Expresion{
    //PENDIENTE DE IMPLEMENTAR LLAMADAS Y NUEVOS VALORES
    private Valor valor;
    private boolean conValor;
    String label = "Return";
    
    public Return(Valor valor, int linea, int columna) {
        this.conValor = false;
        this.valor = valor;
        this.linea = linea;
        this.columna = columna;
    }
    public Return(int linea, int columna) {
        this.conValor = false;
        this.linea = linea;
        this.columna = columna;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("return");
        if (valor!=null) {
            sb.append(valor.toString());
        }
        return sb.toString();
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public boolean isConValor() {
        return conValor;
    }

    public void setConValor(boolean conValor) {
        this.conValor = conValor;
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
