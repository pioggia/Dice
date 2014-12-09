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

public class Dice extends PApplet {

int x, y, dotNum, xmove, ymove, sum;
public void setup()
{
	noLoop();
	size(500, 500);
	background(39, 40, 34);
}
public void draw()
{
	Die uno = new Die(190, 225);
	Die due = new Die(290, 225);
	uno.roll();
	uno.show();
	due.roll();
	due.show();
	sum=uno.dotNum+due.dotNum;
	textSize(15);
	text(sum, 150, 450);
}
public void mousePressed()
{
	background(39, 40, 34);
	redraw();
}
class Die 
{
	int x;
	int y;
	int dotNum;
	int xmove;
	int ymove;
	int sum;
	Die(int myX, int myY) 
	{
		x=myX;
		y=myY;
	}
	public void roll()
	{	
		dotNum=(int)(Math.random()*6)+1;
	}
	public void show()
	{
		stroke(149, 253, 224);
		noFill();
		rect(x, y, 50, 50);
		fill(149, 253, 224);
		noStroke();
		if (dotNum==1)
		{
			ellipse(x+25, y+25, 5, 5);
		}
		else if (dotNum==2)
		{
			ymove=18;
			while(ymove<50)
			{
				ellipse(x+25, y+ymove, 5, 5);
				ymove=ymove+18;
			}
		}
		else if (dotNum==3)
		{
			ymove=13;
			while(ymove<50)
			{
				ellipse(x+25, y+ymove, 5, 5);
				ymove=ymove+13;
			}
			
		}
		else if (dotNum==4)
		{
			ymove=17;
			for(xmove=17; xmove<50; xmove=xmove+17)
			{
				ellipse(x+xmove, y+ymove, 5, 5);
			}
			ymove=36;
			for(xmove=17; xmove<50; xmove=xmove+17)
			{
				ellipse(x+xmove, y+ymove, 5, 5);
			}
		}
		else if (dotNum==5)
		{
			ymove=17;
			for(xmove=17; xmove<50; xmove=xmove+17)
			{
				ellipse(x+xmove, y+ymove, 5, 5);
			}
			ymove=36;
			for(xmove=17; xmove<50; xmove=xmove+17)
			{
				ellipse(x+xmove, y+ymove, 5, 5);
			}
			xmove=25;
			ymove=25;
			ellipse(x+xmove, y+ymove, 5, 5);
		}
		else
		{
			ymove=13;
			for(xmove=17; xmove<50; xmove=xmove+17)
			{
				ellipse(x+xmove, y+ymove, 5, 5);
			}
			ymove=25;
			for(xmove=17; xmove<50; xmove=xmove+17)
			{
				ellipse(x+xmove, y+ymove, 5, 5);
			}
			ymove=37;
			for(xmove=17; xmove<50; xmove=xmove+17)
			{
				ellipse(x+xmove, y+ymove, 5, 5);
			}
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
