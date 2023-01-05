

 class HexaDecimalToDecimal {
    public int hexaToDecimal( String hexa ){
        hexa = hexa.toUpperCase();
        int decimal = 0;
        int counter = 0;
        String elementsOfHexa = "0123456789ABCDEF";
        for ( int i = hexa.length() - 1; i >= 0; i--){
            char character = hexa.charAt(i);
            int number = elementsOfHexa.indexOf(character);
            decimal += number * (int) Math.pow( 16, counter++);
        }
        return decimal;
    }
}