/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionTitan;

/**
 *
 * @author USER
 */
public class IllegalArgumentExceptDemo {
    
    public int age;
    
    public void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException("Umur harus lebih dari 1");
        } else {
            this.age = age;
        }  
    }
    
    public static void main(String[] args) {
        IllegalArgumentExceptDemo person1 = new IllegalArgumentExceptDemo();
        
        try {
            person1.setAge(-5);
            System.out.println("Umur dari person adalah: " + person1.age);
        } catch (Exception e) {
            System.out.println("Terjadi Exception");
            System.out.println(e.getMessage());
        }
        
    }
}
