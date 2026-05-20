package com.pluralsight.forms;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world,50, -50);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(10);
        turtle.setColor(Color.BLUE);

        //Draws a square
        int i = 0;
        do{
            turtle.turnRight(90);
            turtle.forward(70);
            i++;
        }while (i < 4);

//
//        turtle.penUp();
//        turtle.goTo(50, 50);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);



    }
}
