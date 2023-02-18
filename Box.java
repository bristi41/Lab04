public class Box {
    int height=6;
    int width=5;
    int length=4;

    static int area (int height, int width){
        return height*width;

    }
    static int area(int height,int width,int length){
        return height*width*length;
    }
    void display(){
        System.out.println(area(height,width));
        System.out.println(area(height,width,length));

    }
    public static void main(String [] args){
        Box obj=new Box ();
        obj.display();
    }

}
