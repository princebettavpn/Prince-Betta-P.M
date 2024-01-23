/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionTitan;

/**
 *
 * @author USER
 */
public class IndexOutOfBoundExceptDemo {
    int[] numbers = {1, 2, 3, 4, 5};
    
    public static void main(String[] args) {
        IndexOutOfBoundExceptDemo arr1 = new IndexOutOfBoundExceptDemo();
        try {
            int x = arr1.numbers[5];
            System.out.println("Berhasil mendapatkan nilai x: " + x);
        } catch (Exception e) {
            System.out.println("Gagal mendapatkan nilai x");
            System.out.println(e.getMessage());
        }
        
    }
}
