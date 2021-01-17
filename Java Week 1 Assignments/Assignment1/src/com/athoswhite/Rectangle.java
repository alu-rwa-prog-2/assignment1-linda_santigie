//Author: Santigie & Linda
package com.athoswhite;

//Given code to find the Perimeter and Surface of a Rectangle
public class Rectangle {
    public static void main(String[] args)  {

        float Length = 40;
        float Width = 32;

        //Formula for perimeter of a rectangle
        float Perimeter = 2 * (Length + Width);
        //Formulae for surface of a rectangle
        float Surface = (Length * Width);
        System.out.println("The perimeter of a rectangle is: " + Perimeter + " And the surface of a rectangle is "+ Surface);


    }
}

