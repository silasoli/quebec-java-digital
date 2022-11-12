/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipos;

/**
 *
 * @author silas
 */
public class Tipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte b1 = 10;
        byte b2 = 20;
        
        short s1 = 20000;
        //short s1 = 40000; erro de tamanho
        
        //int i1 = -1000000; erro de tamanho
        int i2 = 28500;
        
        long l1 = 1000000000000000000L;
        long l2 = 2008506500000000000L;
        
        //float f1 = 4.5; para declarar um float deve haver um f no final;
        float f2 = 10.68F;
        
        
        double d1 = 85.69; //para declarar um double não é necessario colocar o D/d no final
        double d2 = 99.84D;
        
        char c1= 'W';
        //char c2 = 'Tw'; Apenas 1 caracter
        char c3 = '\u0057'; //unicode do char W        
        
        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = " sdadjksalkdjsadlkiasjdkljsa 3215321d56sa748 #$$#$#";
        String dt1 = "09/02/1981";
        
        boolean bo1 = true;
        boolean bo2 =  false;
        
        
        System.out.println(b1);       
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
    
}
