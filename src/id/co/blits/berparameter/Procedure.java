/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.berparameter;
import java.util.Scanner;

/**
 *
 * @author NurShodik
 */

public class Procedure {

    int panjang,lebar,luas;

void luas_persegi(){
    System.out.print("Masukan Panjang : ");
    panjang =new Scanner(System.in).nextInt();
    System.out.print("Masukan Lebar   : ");
    lebar=new Scanner(System.in).nextInt();
    
    luas=panjang*lebar;
    
    System.out.println("");
    System.out.println("Luas Persegi Panjang : "+luas);
    System.out.println("_______________________________________");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    
    Procedure hitung;
    hitung = new Procedure();
    hitung.luas_persegi();
    
    }
}