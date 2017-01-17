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
        
        double v1, v1x, v1y, vf, dx, dy, t, a, theta;
        
      

        System.out.println("Welcome to the Cannon of Physics! Here you can easily solve projectile motion problems!");
        System.out.println("These are a list of variables you can input (Input short form):\nv1 - Initial Velocity\nv1x - Initial x Velocity\nv1y - Initial y Velocity\n"
        + "v2 - Final Velocity\ndx - Horizontal Displacement\ndy - Vertical Displacement\n"
        + "t - Time\na - Acceleration\ntheta - The initial angle of launch");
        System.out.println("Please input your givens one at a time and type 'done' when finished.");
        
                
        //For user input: Ask what they are trying to solve for (unkown)
        //How many pieces of information do you have (int)
        //Ask for the symbol for each variable they have (string)
        //Get the value for each variable (double)
        //Go through steps to determine which equation to use
        
        //The variable the user wants to find
        String unknownVar = "v2";
        
        //Set to lower case
        unknownVar.toLowerCase();
        //The number of variables the user knows
        int numVar = 4;
        //Array to store the name of the variables known
        String[] knownVal = new String[numVar];
        //For testing purposes *When taking input remember to set all values to lower case
        knownVal[0] = "a";
        knownVal[1] = "dy";
        knownVal[2] = "d1x";
        knownVal[3] = "v1y";
        
        //Mega string to hold the ordered sequence of variables the user knows
        String megaString = ""; 
        
        //For loop the size of the array
        for(int i=0;i<knownVal.length;i++ ){
            //Add each element to the megastring
            megaString += knownVal[i];
        }
        
        //Compare megastring to each possible equation
        for(int i=0;i<possibleEquations.length;i++){
            if(unknownVar == possibleEquations[i]){
                
            }
        }
        String[] possibleEquations = {"dxt","dxv","tv","adytv1","adyt","dytv1","adyv1","atv2","adyt",
            "adyv2","dytv2","atv1","atv2","tv1v2","av1v2","adyv1","adyv2","dyv1v2","av1v2","tv1v2","dyv1v2",
            "dytv1","dytv2","v1xv1y","thetav1x","thetav1y"};
        switch(megaString){
            //For the case of any equation, run corresponding method
            case "dxt": ;
            break;
            case "dxv": ;
            break;
            case "tv": ;
            break;
            case "adytv1": ;
            break;
            case "adyt": ;
            break;
            case "dytv1": ;
            break;
            case "adyv1": ;
            break;
            case "atv2": ;
            break;
            case "adyt": ;
            break;
            case "adyv2": ;
            break;
            case "dytv2": ;
            break;
            case "atv1": ;
            break;
            case "atv2": ;
            break;
            case "tv1v2": ;
            break;
            case "av1v2": ;
            break;
            case "adyv1": ;
            break;
            case "adyv2": ;
            break;
            case "dyv1v2": ;
            break;
            case "av1v2": ;
            break;
            case "tv1v2": ;
            break;
            case "dyv1v2": ;
            break;
            case "dytv1": ;
            break;
            case "dytv2": ;
            break;
            case "v1xv1y": ;
            break;
            case "thetav1x": ;
            break;
            case "thetav1y": ;
            break;
            default: System.out.println("No solution can be reached with these variables");;
            break;
        }

                  
    }
}