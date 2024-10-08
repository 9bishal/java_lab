class shape{
    void draw (){
        System.out.println("Drawing a shape");
    }
    void erase(){
        System.out.println("Erasing a Shape");
    }
}

class circle extends shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    void draw (){
        System.out.println("Drawing Circle with radius:"+radius);
        double area=Math.PI*radius*radius;
        System.out.println("Area of a circle is"+ area);
    }
    void erase(){
        System.out.println("Erasing a Shape");
    }
}

class triangle extends shape{
    double base, height;
    triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    void draw(){
        System.out.println("Drawing a triangle with base:" +base+ "and heoght:" + height);
        double area=0.5*base*height;
        System.out.println("Area of triangle:" + area);
    }
    void erase(){
        System.out.println("Erasing a Shape");
    }
}

class square extends shape{
   double side;
   square(double side){
    this.side=side;
   }
   
   void draw(){
    System.out.println("Drawing a square with side: "+side);
    double area=side*side;
    System.out.println("Average of Square:" +area);
   }
   void erase(){
    System.out.println("Erasing a Shape");
    }
}


public class inheritance{
    public static void main(String[] args){
        shape circle = new circle(5);
        shape triangle = new triangle(4,6);
        shape square = new square(3);


        circle.draw();
        circle.erase();

        triangle.draw();
        triangle.erase();

        
        
        square.draw();
        square.erase();

    }
}