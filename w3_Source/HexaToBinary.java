public class HexaToBinary {
    public int hexaToBinary(String hexaDecimal){
        HexaDecimalToDecimal hexToDec= new HexaDecimalToDecimal();
        return w3_basic_pr19.decimalToBinary(hexToDec.hexaToDecimal( hexaDecimal ));
    }
}
