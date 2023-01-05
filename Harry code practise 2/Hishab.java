public class Hishab {
    public int hishab ( int... taka ){
        int totalTaka = 0;
        for ( int element: taka )
            totalTaka += element;

        return totalTaka;
    }
}
