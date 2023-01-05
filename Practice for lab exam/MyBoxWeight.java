public class MyBoxWeight extends MyBox {
    public double weight;
    MyBoxWeight ( MyBoxWeight object ){
        super ( object );
        this.weight = object.weight;
    }
    MyBoxWeight ( double height, double width, double depth, double weight ){
        super ( height, width, depth );
        this.weight = weight;
    }
    MyBoxWeight ( double heightWidthDepth, double weight ){
        super ( heightWidthDepth );
        this.weight = weight;
    }
    MyBoxWeight (  ){
        super();
        this.weight = -1;
    }
}
/*
 * Coded by: Shaikh Nayeem Uddin
 * */