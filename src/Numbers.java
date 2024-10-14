public class Numbers {
    public int[] numbers;
    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }
     public int maxNumber() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public int minNumber() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public int maxSum(){
        int sum = 0;
        int min = minNumber();
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum - min;
    }
    public int minSum(){
        int sum = 0;
        int max = maxNumber();
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum - max;
    }
}
