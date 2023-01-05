class DecimalToBinary2 {
    public String  decimalToBinary ( int decimal ){
        char [] binaryElements = { '0', '1' };
        String  binary = "";
        while ( decimal != 0){
            int remainder = decimal % 2;
            binary = binary + binaryElements[remainder];
            decimal /= 2;
        }
        return binary;
    }
}
