/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author OrdSon
 */
public class Raiz {
    ListaExpresiones expresiones;
    public Raiz(ListaExpresiones expresiones){
        this.expresiones = expresiones;
    }
    
    public String getGraph() {
        String text = "digraph G\n"
                + "{\n"
                + "node[shape = circle] \n"
                + "node[style = filled] \n"
                + "node[fillcolor = \"#d4e4ff\"]\n"
                + "node[color=\"#d4e4ff\"] \n"
                + "edge[color=\"#4763ff\"] \n";
        for (Expresion expresion : expresiones) {
            text+="<RAIZ> -> "+expresion.getId()+"\n"+expresion.getGraph()+"\n";
        }
        text += " }\n";
        return text;
    }
}
