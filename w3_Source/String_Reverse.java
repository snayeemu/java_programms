public class String_Reverse {
    public String stringReverse( String aString ){
        int j = aString.length() - 1;
        String reverse = "";
        for ( int i = 0; i < aString.length(); i++){
            reverse = aString.charAt(i) + reverse;
        }
        aString = String.valueOf(reverse);
        return aString;
    }
}
