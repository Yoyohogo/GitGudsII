/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author rodec8600
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create some car objects with the given parameters
        Car car1 = new Car();
        Car car2 = new Car("Porsche", "928", 1994, 132496.50, false, true);
        Car car3 = new Car("Catch-a-Riiiiiide!!!", "Light Runner");
        
        //print those cars
        System.out.println(car1.toString());
        System.out.println("********************");
        System.out.println(car2.toString());
        System.out.println("********************");
        System.out.println(car3.toString());
        System.out.println("********************");
    }

}
