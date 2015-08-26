import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
  size (400,400);
}
public void draw()
{
  bill ();
  numbers();
  language();
  president();
  writing();
}

public void bill ()
{
	fill (30,200,30);
	rect(50,50,300,150);
}

public void numbers ()
{
	fill (255);
	textSize (22);
	text ("1", 70,80);
	text ("1", 330,80);
	textSize (18);
	text ("1",70,180);
	text ("1",330,180);
}
public void language ()
{
	fill (255);
	textSize (12);
	text ("FEDERAL RESERVE NOTE",128,65);
	text ("ONE DOLLAR",165,185);
	textSize (14);
	fill(0,0,0);
	text ("THE UNITED STATES OF AMERICA", 90,80);
}
public void president ()
{
	fill (0,153,0);
	ellipse (200,125,40,70);
	fill (255,255,204);
	ellipse (200,125,28,28);
	fill (0);
	ellipse(195,125,2,2);
	ellipse (205,125,2,2);
	line (195,132,205,132);
}
public void writing ()
{
	fill(0);
	textSize (6);
	text ("THIS NOTE IS LEGAL TENDER",79,92);
	text ("FOR ALL DEBTS, PUBLIC AND PRIVATE",79,99);
	text ("WASHINGTON",183,168);
	textSize (14);
	fill (102,255,102);
	text ("F19479269K",240,100);
	text ("F19479269K",80,155);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
