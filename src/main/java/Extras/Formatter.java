/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author OrdSon
 */
public class Formatter {

    public Formatter() {

    }

    public String Reformat(String[] lineas, int max, int left, int right, int tabs) {
        int contadorTabs = tabs;
        int limiteIzquierda = left;
        int limiteDerecha = right;
        for (int i = limiteIzquierda; i < limiteDerecha; i++) {
            if (contarTabs(lineas[i])==contadorTabs) {
                limiteIzquierda = i;
                for (int j = i+1; j < lineas.length; j++) {
                    if (contarTabs(lineas[j])==contadorTabs) {
                        limiteDerecha = j;
                    }
                }
            }
        }
        return "";
    }

    public int contarTabs(String linea) {
        char[] caracteres = linea.toCharArray();
        int contador = 0;
        for (int j = 0; j < caracteres.length; j++) {
            if (caracteres[j] == '\t') {
                contador++;
            }
        }
        return contador;
    }

}
