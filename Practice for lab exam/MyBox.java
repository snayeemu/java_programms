public class MyBox {
    private double height;
    private double width;
    private double depth;
    MyBox ( MyBox object ){
        this.height = object.height;
        this.width = object.width;
        this.depth = object.depth;
    }
    MyBox ( double height, double width, double depth ){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    MyBox ( double heightWidthDepth ){
        this.height = this.width = this.depth = heightWidthDepth;
    }
    MyBox (  ){
        this.height = -1;
        this.width = -1;
        this.depth = -1;
    }
    public double volume () {
        return  height * width * depth;
    }
}
/*
 * Coded by: Shaikh Nayeem Uddin
 * */