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
        Turtle turtle = new Turtle(world,0, -100);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(10);
        turtle.setColor(Color.BLUE);

//        //Draws a square
//        int s = 0;
//        do{
//            turtle.turnRight(90);
//            turtle.forward(70);
//            s++;
//        }while (s < 4);


        //Draws a circle
//        int c = 0;
//        do{
//            turtle.turnRight(5);
//            turtle.forward(5);
//            c++;
//        }while(c < 71);



        //makes the 't' shape
        turtle.turnRight(90);
        turtle.forward(100);
        turtle.turnRight(90);
        turtle.backward(-100);
        turtle.forward(-200);
        turtle.backward(-100);
        turtle.turnLeft(90);
        turtle.forward(100);







//
//        turtle.penUp();
//        turtle.goTo(50, 50);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);



    }
}
