/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

import java.text.DecimalFormat;

/**
 * Created the Car object
 * @author rodec8600
 */
public class Car {

    //declaring variables for use
    private String make, model;
    private int year, carSound;
    private double price;
    private boolean isDeLorean, isOwnedByRichardHammond;

    /**
     * Default constructor for cars (randomly generates)
     * POST: the properties of the car are generated semi-randomly
     */
    public Car() {

        //randomly generate a make and model
        int randMake = (int) (Math.random() * 3 + 1);
        int randModel = (int) (Math.random() * 2 + 1);

        if (randMake == 1) {
            make = "DeLorean";
            isDeLorean = true;
            if (randModel == 1) {
                model = "DMC-12";
                year = 1982;
                price = 33115.50;
            } else {
                model = "DMC-12 w/ Flux Capacitor";
                year = 1985;
                price = 331162.50;
            }
        } else if (randMake == 2) {
            make = "Porsche";
            isDeLorean = false;
            isOwnedByRichardHammond = true;
            if (randModel == 1) {
                model = "911 GT3 RS";
                year = 2015;
                price = 477726.20;
            } else {
                model = "928";
                year = 1994;
                price = 132496.50;
            }
        } else {
            make = "Buggati";
            isDeLorean = false;
            isOwnedByRichardHammond = false;
            if (randModel == 1) {
                model = "Veryon";
                year = 2007;
                price = 3047730.00;
            } else {
                model = "Chiron";
                year = 2016;
                price = 3312750.00;
            }
        }
    }
    
    /**
     * Constructor for specific input
     * PRE: the make, model, year and price of the car, as well as whether or not it is a DeLorean or owned
     * by Richard Hammond
     * POST: the properties of the car are assigned
     */
    public Car (String makeIn, String modelIn, int yearIn, double priceIn, boolean isDeLoreanIn, boolean isOwnedByRichardHammondIn) {
        make = makeIn;
        model = modelIn;
        year = yearIn;
        price = priceIn;
        isDeLorean = isDeLoreanIn;
        isOwnedByRichardHammond = isOwnedByRichardHammondIn;
    }
    
    /**
     * Constructor that only accepts make and model
     * PRE: the make and model of the car
     * POST: the properties of this car are generated randomly
     */
    public Car (String makeIn, String modelIn) {
        
        make = makeIn;
        model = modelIn;
        
        //randomly generates the year, price, and whether or not it is a DeLorean or owned by Richard Hammond
        year = (int) (Math.random() * 2552 + 1);
        price = (Math.random() * 1000000 + 1);
        int deLorean = (int) (Math.random() * 2 + 1);
        int owned = (int) (Math.random() * 2 + 1);
        
        
        if (deLorean == 1) {
            isDeLorean = true;
        } else {
            isDeLorean = false;
        }
        
        if (owned == 1) {
            isOwnedByRichardHammond = true;
        } else {
            isOwnedByRichardHammond = false;
        }
    }
    
    /**
     * To print the cars
     * POST: the cars are printed
     */
    public String toString() {
        
        //output the specifics of the car and randomly generate the sound the car makes when it honks
        carSound = (int)(Math.random() * 3 + 1);
        DecimalFormat x = new DecimalFormat("##.00");
        String output = "Here are the properties of your vehicle!";
        output += "\nMake:\t" + make;
        output += "\nModel:\t" + model;
        output += "\nYear:\t" + year;
        output += "\nPrice:\t" + x.format(price);
        output += "\nIs it a DeLorean?\t" + isDeLorean;
        output += "\nIs it owned by Richard Hammond?\t" + isOwnedByRichardHammond;
        
        if (carSound == 1) {
            output += "\nbeep beep beep beep screeeech ruuurrrump pa-lump";
        } else if (carSound == 2) {
            output += "\nwaaaank";
        } else {
            output += "\nskwee brrumm brrumm skoooooo skooooo";
        }
        return output;
    }
}
