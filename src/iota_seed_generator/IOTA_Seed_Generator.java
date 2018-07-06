/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iota_seed_generator;
import java.security.SecureRandom;
import java.util.*;
/**
 *
 * @author Angelo 2018
 */
public class IOTA_Seed_Generator {
    
    private static int Seed_length=81;
    
    private static String Char_List="ABCDEFGHIJKLMNOPQRSTUVWXYZ9";
    
   
    /**
     * @param args the command line arguments
     */
    public static String Seed_generator() {
        // TODO code application logic here
        char Seed[] = new char[Seed_length];
        SecureRandom sr=new SecureRandom();
    StringBuilder sb = new StringBuilder(Seed_length);
    for (int i=0 ; i<Seed_length ; i++) {
        int n= sr.nextInt(27);
        char c = Char_List.charAt(n);
        Seed[i] = c;
    }
    String Seed_result = new String(Seed);
    return Seed_result;
    }
    public static void main(String args[]) {
        System.out.println(Seed_generator());
    }
    
}
