public class INeed {
    public static void main(String[] args) {
        Hishab calculate = new Hishab();
        int iNeed = calculate.hishab(
                /*mess vara*/ 2500, /*aunty*/ 400, /*mill*/ 2000, /*jatayat, hat khoroch*/ 2000, /*ghee*/ 450,
                /*coconut oil*/ 950, /*egg*/ 1050, /*mobile*/ 250, /*sun screen*/ 580, /*ayanat*/ 200, /*shorisha*/ 150
        );
        int iExpend = calculate.hishab(

        );
        System.out.println("I need: " + iNeed );
        System.out.println("I expended: " + iExpend );
        System.out.println("Should have: " + ( iNeed - iExpend ) );
    }
}
