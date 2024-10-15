public class Main {
    public static void main(String[] args) {
        int[] studentGrades = {29, 37, 38, 41, 84, 67};
        Grades grades = new Grades(studentGrades);
        int[] failingGrades = grades.getFailingGrades();
        System.out.print("Failing grades: [");
        for (int i = 0; i < failingGrades.length; i++) {
            System.out.print(failingGrades[i]);
            if (i < failingGrades.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Average grade: " + grades.averageGrade());

        int[] roundedGrades = grades.getRoundedGrades();
        System.out.print("Rounded grades: [");
        for (int i = 0; i < roundedGrades.length; i++) {
            System.out.print(roundedGrades[i]);
            if (i < roundedGrades.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Max Grade: " + grades.getMaxGrade());



        int[] numbers = {4, 8, 3, 10, 17};
        Numbers numbersArray = new Numbers(numbers);
        System.out.println("Max number: " + numbersArray.maxNumber());
        System.out.println("Min number: " + numbersArray.minNumber());
        System.out.println("Max sum: " + numbersArray.maxSum());
        System.out.println("Min sum: " + numbersArray.minSum());


        int[] bigNums1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNums2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        BigNumber bnum1 = new BigNumber(bigNums1);
        BigNumber bnum2 = new BigNumber(bigNums2);
        BigNumber sum = BigNumber.add(bnum1, bnum2);
        System.out.println("Sum: ");
        sum.showNumbers();
        int[] bigNums3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNums4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        BigNumber bnum3 = new BigNumber(bigNums3);
        BigNumber bnum4 = new BigNumber(bigNums4);
        BigNumber diff = BigNumber.subtract(bnum3, bnum4);
        System.out.println("Difference: ");
        diff.showNumbers();
        int[] bigNums5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        BigNumber bnum5 = new BigNumber(bigNums5);
        BigNumber product = BigNumber.multiply(bnum5,2);
        System.out.println("Product: ");
        product.showNumbers();
        BigNumber division = BigNumber.divide(bnum5,2);
        System.out.println("Division: ");
        division.showNumbers();


        int[] keyboards = {15, 20, 10, 35};
        int[] usbs = {20, 15, 40, 15};
        ElectronicsShop eshop = new ElectronicsShop(keyboards, usbs);
        System.out.println("Cheapest keyboard: " + eshop.findCheapestKeyboard());
        System.out.println("Most expensive item: " + eshop.findMostExpensive());
        System.out.println("Most expensive USB with budget: " + eshop.findMostExpensiveUSBWithBudget(30));
    }

}