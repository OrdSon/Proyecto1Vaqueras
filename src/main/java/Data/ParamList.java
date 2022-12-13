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
public class ParamList {
    LinkedList<Parametro> parametros = new LinkedList<>();
    
    public ParamList append(Parametro parametro){
        parametros.add((Parametro)parametro);
        Object object = new Object();
        Parametro parametro1 = new Parametro((Tipo)object,"asd");
        return this;
    }
}
