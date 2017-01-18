/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cannontester;

import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class CannonTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double v1, v1x, v1y, v2, v2y, dx, dy, t, a, theta1, theta2;
        
      

        System.out.println("Welcome to the Cannon of Physics! Here you can easily solve projectile motion problems!");
        System.out.println("These are a list of variables you can input (Input short form):\nv1 - Initial Velocity\nv1x - Initial x Velocity\nv1y - Initial y Velocity\n"
        + "v2 - Final Velocity\ndx - Horizontal Displacement\ndy - Vertical Displacement\n"
        + "t - Time\na - Acceleration\ntheta1 - The initial angle of launch\ntheta2 - The final angle at impact");
        System.out.println("Please input your givens one at a time and type 'done' when finished.");
        
                
        //For user input: Ask what they are trying to solve for (unkown)
        //How many pieces of information do you have (int)
        //Ask for the symbol for each variable they have (string)
        //Get the value for each variable (double)
        //Go through steps to determine which equation to use
        
        //The variable the user wants to find
        String unknownVar = "v1x";
        
        //Set to lower case
        unknownVar.toLowerCase();
        //The number of variables the user knows *Set for testing*
        int numVar = 2;
        //Array to store the name of the variables known
        String[] knownVal = new String[numVar];
        //For testing purposes *When taking input remember to set all values to lower case
        knownVal[0] = "dx";
        knownVal[1] = "t";
        
        //Mega string to hold the ordered sequence of variables the user knows
        String megaString = ""; 
        
        //For loop the size of the array
        for(int i=0;i<knownVal.length;i++ ){
            //Add each element to the megastring
            megaString += knownVal[i];
        }
        
        //Testing
        dx = 3;
        t = 1;
        v1x = 0;
        
        //IF THE USER INPUTS MORE INFO THEN NEEDED WE COULD DO .CONTAINS TO CHECK IF THE MEGASTRING CONTAINS THE VARIABLES NEEDED EVEN IF IT HAS EXTRA
        if(unknownVar == "v1"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "": ;
                break;
                //Cant you find the initial velocity knowing v1x and v1y and theta
            }
        }
        else if(unknownVar == "v1x"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "dxt":v1x = dxtOFv1x(dx,t) ;
                break;
                case "thetav1y":v1x = v1ytheta1FORv1x(v1y,theta1) ;
                break;
            }
        }
        else if(unknownVar == "v1y"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "adyt": v1y= dytaOFv1y(dy,t,a);
                break;
                case "atv2y": v1y=v2yatOFv1y(v2y,a,t);
                break;
                case "adyv2y": v1y=v2yadyOFv1y(v2y,a,dy);
                break;
                case "dytv2y": v1y=v2ydytOFv1y(v2y,dy,t);
                break;
                case "thetav1x": v1y=v1xtheta1FORv1y(v1x,theta1);
                break;
            }
        }
        else if(unknownVar == "v2"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "v1xv2y": v2=v1xv2yOFv2(v2y,v1x);
                break;
            }
        }
        else if(unknownVar == "v2y"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "adyt": v2y=dytaOFv2y(dy,t,a);
                break;
                case "atv1y": v2y=v1yatOFv2y(v1y,a,t);
                break;
                case "adyv1y": v2y=v1yadyOFv2y(v1y,a,dy);
                break;
                case "dytv1y": v2y=v1ydytOFv2y(v1y,dy,t);
                break;
            }
        }
        else if(unknownVar == "dx"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "tv1x": dx=tv1xOFdx(t,v1x);
                break;
            }
        }
        else if(unknownVar == "dy"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "atv1y": dy=v1ytaOFdy(v1y,t,a);
                break;
                case "atv2y": dy=v2ytaOFdy(v2y,t,a);
                break;
                case "av1yv2y": dy=v1yv2yaOFdy(v1y,v2y,a);
                break;
                case "tv1yv2y": dy=v1yv2ytOFdy(v1y,v2y,t);
                break;
            }
        }
        else if(unknownVar == "t"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "dxv1x": t=dxv1xOFt(dx,v1x);
                break;
                case "adyv1y": t=dyv1yaOFt(dy,a,v1y);
                break;
                case "adyv2y": t=dyv2yaOFt(dy,v2y,a);
                break;
                case "av1yv2y": t=v1yv2yaOFt(v1y,v2y,a);
                break;
                case "dyv1yv2y": t=v1yv2ydyOFt(v1y,v2y,dy);
                break;
            }
        }
        else if(unknownVar == "a"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "dytv1y": a=dyv1ytOFa(dy,t,v1y);
                break;
                case "dytv2y": a=dyv2ytOFa(dy,v2y,t);
                break;
                case "tv1yv2y": a=v1yv2ytOFa(v1y,v2y,t);
                break;
                case "dyv1yv2y": a=v1yv2ydyOFa(v1y,v2y,dy);
                break;
            }
        }
        else if(unknownVar == "theta1"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "v1xv1y": theta1=v1xv1yWiththeta1(v1x,v1y);
                break;
            }
        }
        else if(unknownVar == "theta2"){
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "": theta2=;
                break;
            }
        }
        else{
            //Implement a solution here for multistep problems ie. Cannot solve for unknown directly
        }     
    }
}