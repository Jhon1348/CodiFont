/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Arrays;

/**
 *
 * @author alumne
 */
public class Practica1 {

    public static void main(String[] args) {

        int[] v = new int[]{1, 2, 3, 4};
//linia novarama
        //linia repositori remote
//linia agrgada para Github
        //primer cas (modifica el vector!!)
//        System.out.println(Arrays.toString(operaVector(v, 2, true)));
//        System.out.println(Arrays.toString(v));
        //segon cas
        System.out.println(Arrays.toString(operaVector(v, 2, false)));
        System.out.println(Arrays.toString(v));
        //casos especials
        System.out.println(Arrays.toString(operaVector(null, 2, true)));
        System.out.println(Arrays.toString(v));
        //casos especials
        System.out.println(Arrays.toString(operaVector(null, 2, false)));
        System.out.println(Arrays.toString(v));
    }

    public static int[] operaVector(int[] vector, int valor, boolean boolea) {
        //si el vector és diferent de null
        if (vector != null) {
            //si és true, els canvis es realitzaran sobre el vector passat com a paràmetre
            if (boolea == true) {
                for (int i = 0; i < vector.length; i++) {
                    vector[i] = vector[i] += valor;
                }
                return null;
                
            } else {
               // si és false, no modificarem el vector rebut per paràmetre sinó que farem un altre d'igual longitud
                if (boolea == false) {
                    int[] copia;
                    //creo un vector de la mateixa largada que el del parametre
                    copia = new int[vector.length];
                    for (int i = 0; i < copia.length; i++) {
                        copia[i] = vector[i] + valor;
                    }
                    return copia;
                }
            }

        }
        //si el vector és null retornarà null
        return null;

    }
}
