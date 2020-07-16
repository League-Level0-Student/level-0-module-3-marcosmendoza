//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
 
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob = new Robot();
		
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("what color would you like the robot to DRAW in??");
		color.toLowerCase();
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red")) {
			bob.setPenColor(Color.red);
		}
		
		if (color.equalsIgnoreCase("blue")) {
			bob.setPenColor(Color.blue);
		}
		
		if (color.equalsIgnoreCase("green")) {
			bob.setPenColor(Color.green);
		}
		
		if (color.equalsIgnoreCase("yellow")) {
			bob.setPenColor(Color.yellow);
		}
		
		
		String shape = JOptionPane.showInputDialog("what shape would you like to be drawn");
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
if (shape.equalsIgnoreCase("square")) {
	

bob.penDown();
bob.setSpeed(100000);
bob.setPenWidth(10);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);

	}

if (shape.equalsIgnoreCase("triangle")) {
bob.penDown();
bob.setSpeed(10000);
bob.turn(90);
bob.move(100);
bob.turn(45);
bob.move(100);
bob.turn(90);
bob.move(100);
	}
  }
}