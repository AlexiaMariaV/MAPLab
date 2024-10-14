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
}
