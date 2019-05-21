
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        this.draw();
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square(); //grass
        wall.changeColor("blue");
        wall.moveVertical(-50);
        wall.moveHorizontal(-60);
        wall.changeSize(300);
        wall.makeVisible();
        
      
        wall = new Square(); //grass
        wall.changeColor("green");
        wall.moveVertical(190);
        wall.moveHorizontal(-60);
        wall.changeSize(300);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(100);
        wall.moveHorizontal(-40);
        wall.changeSize(100);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(100);
        wall.moveHorizontal(40);
        wall.changeSize(100);
        wall.makeVisible();
        
        wall = new Square(); //outhouse
        wall.changeColor("red");
        wall.moveVertical(130);
        wall.moveHorizontal(160);
        wall.changeSize(60);
        wall.makeVisible();
        
        wall = new Square(); //outhouse window
        wall.changeColor("white");
        wall.moveVertical(140);
        wall.moveHorizontal(180);
        wall.changeSize(20);
        wall.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(0);
        window.moveVertical(130);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(80);
        window.moveVertical(130);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(60,190);
        roof.moveHorizontal(60);
        roof.moveVertical(75);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(50, 70);
        roof.moveHorizontal(200);
        roof.moveVertical(120);
        roof.makeVisible();
        
        roof = new Triangle(); //Treetop 1
        roof.changeColor("green");
        roof.changeSize(30,50);
        roof.moveHorizontal(-10);
        roof.moveVertical(160);
        roof.makeVisible();
        
        roof = new Triangle(); //Tree middle 1
        roof.changeColor("green");
        roof.changeSize(30,50);
        roof.moveHorizontal(-10);
        roof.moveVertical(180);
        roof.makeVisible();
        
        roof = new Triangle(); //Treebase 1
        roof.changeColor("green");
        roof.changeSize(30,50);
        roof.moveHorizontal(-10);
        roof.moveVertical(205);
        roof.makeVisible();
        
        roof = new Triangle(); //Treetop 2
        roof.changeColor("green");
        roof.changeSize(30,50);
        roof.moveHorizontal(60);
        roof.moveVertical(160);
        roof.makeVisible();
        
        roof = new Triangle(); //Tree middle 2
        roof.changeColor("green");
        roof.changeSize(30,50);
        roof.moveHorizontal(60);
        roof.moveVertical(180);
        roof.makeVisible();
        
        roof = new Triangle(); //Treebase 2
        roof.changeColor("green");
        roof.changeSize(30,50);
        roof.moveHorizontal(60);
        roof.moveVertical(205);
        roof.makeVisible();
        
        roof = new Triangle(); //Treetop 3
        roof.changeColor("green");
        roof.changeSize(30,50);
        roof.moveHorizontal(130);
        roof.moveVertical(160);
        roof.makeVisible();
        
        roof = new Triangle(); //Tree middle 3
        roof.changeColor("green");
        roof.changeSize(30,50);
        roof.moveHorizontal(130);
        roof.moveVertical(180);
        roof.makeVisible();
        
        roof = new Triangle(); //Treebase 3
        roof.changeColor("green");
        roof.changeSize(30,50);
        roof.moveHorizontal(130);
        roof.moveVertical(205);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(170);
        sun.moveVertical(-20);
        sun.changeSize(60);
        sun.makeVisible();
        
       
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
