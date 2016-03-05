package com.company;
import java.util.Scanner;

/* Java program that "draws" a building having a size specified by three user
*  inputs.  One input is the building's width, the second is number of stories,
*  and the third is story height.
*
*  Author: R. McCloskey and ...
*  Date: ...
*  CMPS 134 Spring 2016 Prog. Assgn. #3
*  Persons lending assistance: ...
*  Known flaws: ...
*/



for (int i = 1; i <= 4; i++){
        for(int j = 0; j<= )

        }





public class DrawVariableSizeBuilding {

    // Establish a Scanner object that can read data entered at the keyboard.
    private static Scanner keyboard = new Scanner(System.in);


    /* Prompts the user for each of the three inputs, reads them, and draws
    ** a building with the specified dimensions.
    */
    public static void main(String[] args)
    {
        // Get input data from the user.
        int width = getIntFromUser("Enter width of building:");
        int numStories = getIntFromUser("Enter number of stories:");
        int storyHeight = getIntFromUser("Enter height of each story:");

        // Draw a building of the size specified by the three inputs.
        drawBuilding(width, numStories, storyHeight);
    }


    /* Draws a building of the size specified by the three parameters.
    */
    private static void drawBuilding(int buildingWidth,
                                     int storyCount,
                                     int storyHeight)
    {
        drawRoof(buildingWidth);
    }


    /* Draws the roof of a building having the specified width.
    */
    private static void drawRoof(int width)
    {
       printChars('-', width );

        }

    /* Draws a story (with the specified height) of a building having the
    ** specified width.
    */
    private static void drawStory(int width, int height)
    {
        // STUB!!
    }


    /* Draws the foundation of a building having the specified width.
    */
    private static void drawFoundation(int width)
    {
        // STUB!!
    }


    /* Prints the specified character (ch) the specified number (k) of times.
    */
    private static void printChars(int ch, )
    {
        for (int i=1; i <= 1; i=i+1) {
            System.out.print(ch);
        }
    }

    /* Returns the integer value entered at the keyboard in response to the
    ** the specified prompt.  (If the sequence of characters entered at the
    ** keyboard is not of a form that can be recognized as describing an
    ** integer, an exception is thrown.)
    */
    private static int getIntFromUser(String prompt)
    {
        System.out.print(prompt);
        return keyboard.nextInt();
    }

}
