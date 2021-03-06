package edu.ucsb.cs56.S13.drawings.gunnarweibull.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
/**
   A Japanese flag that extends the Flag class.
      
   @author Gunnar Weibull
   @version for CS56, S13, UCSB
   
*/
public class JapaneseFlag extends Flag implements Shape
{
    
    public JapaneseFlag(double x, double y, double width, double height)
    {
	// construct the basic flag shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	Circle circle = new Circle(x+width/2,y+0.125*height,0.07*height);

	

        GeneralPath wholeFlag = this.get();
        wholeFlag.append(circle, false);
       
    }

}
