public class HexaDecimalToOctal {
    public int hexaToOctal( String hexa ){
        HexaDecimalToDecimal htd = new HexaDecimalToDecimal();
        int decimal = htd.hexaToDecimal( hexa );
        DecimalToOctal dto = new DecimalToOctal();
        int octal =  dto.decimalToOctal(decimal);

        return octal;
    }
}
