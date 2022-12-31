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
/*PENDIENTE DE IMPLEMENTAR*/
public class ConsoleLog extends  Expresion{
    ListaValores valores;
    public  ConsoleLog(ListaValores valores, int linea, int columna){
        this.valores = valores; 
        this.linea = linea;
        this.columna = columna;
        String label = "Console.Write";
        id=getNewId();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("print(");
        for (Valor valore : valores) {
            sb.append(valore.toString());
        }
        sb.append(")");
        return sb.toString();
        
    }
    
    public String print(){
        StringBuilder sb = new StringBuilder();
        for (Valor valore : valores) {
            sb.append(valore.toString());
        }
        return sb.toString();
    }
    

}
