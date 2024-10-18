interface resizable{
    void resizewidht(int Widht);
    void resizeheight(int height);
}
class rectangle implements resizable{
    private int width;
    private int height;
    public rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    //override
    public void resizewidht(int newWidth){
        this.width=newWidth;
        System.out.println("New Width: "+ this.width);
    }
    public void resizeheight(int newheight){
        this.height=newheight;
        System.out.println("New Width: "+ this.height);
    }
    public void displayDimensions() {
        System.out.println("Current dimensions -> Width: " + width + ", Height: " + height);
    }
}



public class resizablerectangle2 {
    public static void main(String[] args) {
        rectangle rect = new rectangle(8,9);
        rect.displayDimensions();
    }
    
}