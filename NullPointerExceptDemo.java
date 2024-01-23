/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionTitan;

/**
 *
 * @author USER
 */
public class NullPointerExceptDemo {
    
    
    public static void main(String[] args) {
            String s = "abcd";
            foo(null);	
    }

    // Using a try-catch block:
    static void foo(String x){
        try {
            System.out.println("Karakter Pertama adalah : " + x.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Terjadi Exception");
            System.out.println(e.getMessage());
        }
    }
}
