/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @author utilisateur
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> listnombre=new ArrayList<Integer>();
        ArrayList<Integer> round1=new ArrayList<Integer>();
        ArrayList<Integer> round2=new ArrayList<Integer>();
        int[] listbracket=new int[]{4,8,16,32,64,128,256};
        int size=4;
        Scanner issou= new Scanner(System.in);
        System.out.println("Choisir le nombre de participant");
        int test=issou.nextInt();
        for (int i = 0; i < test; i++) {
            listnombre.add(i);
        }
        Collections.shuffle(listnombre);
        for (int i = 0; i < listbracket.length; i++) 
        {
            if(listbracket[i]<=listnombre.size())
            {
                size=listbracket[i];
            }
        }
        if(size == listnombre.size())
        {
            round1=listnombre;
            for (int i = 0; i < round1.size(); i+=2) {
                System.out.println("Combat"+i);
                System.out.println(round1.get(i)+"vs"+round1.get(i+1));
                System.out.println("");
            }
        }else if(listnombre.size()>size && listnombre.size()<=(size+size/2))
        {
            for (int i = 0; i < size; i++) {
                round1.add(listnombre.get(i));
            }
            int issou1=listnombre.size()-size;
            for (int i = 0; i <issou1  ; i++) {
                round2.add(listnombre.get(i+8));
            }
             for (int i = 0; i < round1.size(); i+=2) {
                System.out.println("Combat"+i);
                System.out.println(round1.get(i)+"vs"+round1.get(i+1));
                System.out.println("");
            }
             System.out.println("round 2");
             for (int i = 0; i < round2.size(); i++) {
                System.out.println("Combat"+i);
                System.out.println(round2.get(i)+" en attente");
                System.out.println("");
            }
        }else if(listnombre.size()>(size+size/2) && listnombre.size()<(size*2))
        {
            int issou2=(listnombre.size()-(size+size/2))*2;
            issou2+=size;
            for (int i = 0; i < issou2; i++) {
                round1.add(listnombre.get(i));
            }
            for (int i = issou2; i <listnombre.size(); i++) {
                round2.add(listnombre.get(i));
            }
            for (int i = 0; i < round1.size(); i+=2) {
                System.out.println("Combat"+i);
                System.out.println(round1.get(i)+"vs"+round1.get(i+1));
                System.out.println("");
            }
             System.out.println("round 2");
             for (int i = 0; i < round2.size(); i++) {
                System.out.println("Combat"+i);
                System.out.println(round2.get(i)+"en attente");
                System.out.println("");
            } 
        }
    }
    
}
