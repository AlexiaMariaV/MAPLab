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
    }

}