
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
        
        roof = new Triangle(); //Treetop 4
        roof.changeColor("green");
        roof.changeSize(20,40);
        roof.moveHorizontal(230);
        roof.moveVertical(175);
        roof.makeVisible();
        
        roof = new Triangle(); //Tree middle 4
        roof.changeColor("green");
        roof.changeSize(20,40);
        roof.moveHorizontal(230);
        roof.moveVertical(190);
        roof.makeVisible();
        
        roof = new Triangle(); //Treebase 4
        roof.changeColor("green");
        roof.changeSize(20,40);
        roof.moveHorizontal(230);
        roof.moveVertical(205);
        roof.makeVisible();


        sun = new Circle(); //Moon
        sun.changeColor("yellow");
        sun.moveHorizontal(170);
        sun.moveVertical(-20);
        sun.changeSize(60);
        sun.makeVisible();
        
        sun = new Circle(); //Stars
        sun.changeColor("yellow");
        sun.moveHorizontal(150);
        sun.moveVertical(-20);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(130);
        sun.moveVertical(-10);
        sun.changeSize(5);
        sun.makeVisible();
       
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(20);
        sun.moveVertical(10);
        sun.changeSize(5);
        sun.makeVisible();
       
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-400);
        sun.changeSize(5);
        sun.makeVisible();
       
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(40);
        sun.moveVertical(-20);
        sun.changeSize(5);
        sun.makeVisible();
       
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(90);
        sun.moveVertical(-40);
        sun.changeSize(5);
        sun.makeVisible();
       
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(75);
        sun.moveVertical(-10);
        sun.changeSize(5);
        sun.makeVisible();
       
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(105);
        sun.moveVertical(-50);
        sun.changeSize(5);
        sun.makeVisible();
       
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(50);
        sun.moveVertical(-35);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(200);
        sun.moveVertical(-40);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(240);
        sun.moveVertical(-35);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(260);
        sun.moveVertical(25);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(150);
        sun.moveVertical(30);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(120);
        sun.moveVertical(20);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(15);
        sun.moveVertical(25);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(10);
        sun.moveVertical(-50);
        sun.changeSize(5);
        sun.makeVisible();
        
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(5);
        sun.moveVertical(-10);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(175);
        sun.moveVertical(-40);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(190);
        sun.moveVertical(-55);
        sun.changeSize(5);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(50);
        sun.moveVertical(-10);
        sun.changeSize(5);
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
