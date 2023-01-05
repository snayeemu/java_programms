class DecimalToOctal {
    static int decimalToOctal(int decimal) {
        // 123 = 1111011
        int reverseOctal = 0;
        int octal = 0;
        int remainder;
        while (decimal != 0) {
            remainder = decimal % 8;
            decimal /= 8;
            reverseOctal = reverseOctal * 10 + remainder;
        }
        while (reverseOctal != 0) {
            remainder = reverseOctal % 10;
            reverseOctal /= 10;
            octal = octal * 10 + remainder;
        }
        return octal;
    }
}