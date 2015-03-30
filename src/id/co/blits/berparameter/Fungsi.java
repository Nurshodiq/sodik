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
public class Fungsi {
static int Kuadrat(int bil){
     return bil*bil;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
      int nilai_kuadrat;
      System.out.print("Masukan Kuadrat : ");
    nilai_kuadrat = new Scanner(System.in).nextInt();
   System.out.println("kuadrat "+ nilai_kuadrat +" adalah "+ Kuadrat(nilai_kuadrat));
   }
 }