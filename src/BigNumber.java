public class BigNumber {
    public int[] bigNumbers;
    public BigNumber(int[] bigNumbers) {
        this.bigNumbers = bigNumbers;
    }

    public void showNumbers() {
        for (int i = 0; i < bigNumbers.length; i++) {
            System.out.print(bigNumbers[i] + " ");
        }
        System.out.println();
    }

    public static BigNumber add(BigNumber bnum1, BigNumber bnum2) {
        int length = bnum1.bigNumbers.length;
        int[] sum = new int[length+1];
        int carry = 0;
        for (int i = length-1; i >= 0; i--) {
            int helpingSum = bnum1.bigNumbers[i] + bnum2.bigNumbers[i] + carry;
            sum[i+1] = helpingSum % 10;
            carry = helpingSum / 10;
        }
        sum[0] = carry;
        if (sum[0] == 0){
            int[] sumWithoutFrontZero = new int[length];
            for (int i = 0; i < length; i++){
                sumWithoutFrontZero[i] = sum[i+1];
            }
            return new BigNumber(sumWithoutFrontZero);
        }
        return new BigNumber(sum);
    }

    public static BigNumber subtract(BigNumber bnum1, BigNumber bnum2) {
        int length = bnum1.bigNumbers.length;
        int[] diff = new int[length];
        int borrow = 0;
        for (int i = length-1; i >= 0; i--) {
            int helpingDiff = bnum1.bigNumbers[i] - bnum2.bigNumbers[i] - borrow;
            if (helpingDiff < 0){
                helpingDiff = helpingDiff + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            diff[i] = helpingDiff;
        }
        int i = 0;
        while (i < length-1 && diff[i] == 0){
            i++;
        }
        int[] diffWithoutFrontZero = new int[length-i];
        for(int j = 0; j < length; j++){
            diffWithoutFrontZero[j] = diff[i+j];
        }
        return new BigNumber(diff);
    }

    public static BigNumber multiply(BigNumber bnum, int digit) {
        int length = bnum.bigNumbers.length;
        int[] product = new int[length + 1];
        int carry = 0;
        for (int i = length-1; i >= 0; i--) {
            int helpingProduct = bnum.bigNumbers[i] * digit + carry;
            product[i+1] = helpingProduct % 10;
            carry = helpingProduct / 10;
        }
        product[0] = carry;
        if (product[0] == 0){
            int[] productWithoutFrontZero = new int[length];
            for (int i = 0; i < length; i++){
                productWithoutFrontZero[i] = product[i+1];
            }
            return new BigNumber(productWithoutFrontZero);
        }
        return new BigNumber(product);
    }

    public static BigNumber divide(BigNumber bnum, int digit) {
        int length = bnum.bigNumbers.length;
        int[] div = new int[length];
        int rest = 0;

        for (int i = 0; i < length; i++){
            int helpingDiv = rest * 10 + bnum.bigNumbers[i];
            div[i] = helpingDiv / digit;
            rest = helpingDiv % digit;
        }
        return new BigNumber(div);
    }
}
