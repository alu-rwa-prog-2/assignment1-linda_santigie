//Santigie & Linda
package com.athoswhite;

import java.util.Scanner;

public class BMI {
    //BMI Calculator in Java
    public static void main(String[] args) throws Exception {
        calculateBMI();
    }
    private static void calculateBMI() throws Exception {
        System.out.println("Please enter your name please");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name+"Please input your weight(kg) ");
        float weight = sc.nextFloat();

        //User Height in CM
        System.out.println(name+"Please input your height(cm)");
        float height = sc.nextFloat();

        //Conversion Math
        float bmi = (100*100*weight)/(height*height);
        System.out.println(name+"your BMI is: "+bmi);
        UserBMI(bmi);

    }
    //Condition for different BMI
    private static void UserBMI(float bmi) throws Exception {
        if( bmi < 16.7) {
            System.out.println("You are underweight");
        } else if ( bmi < 20) {
            System.out.println("You are normal");
        } else if ( bmi < 30) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }
    }
}

