public class Grades {
    public int[] grades;
    public Grades(int[] grades) {
        this.grades = grades;
    }


    public int[] getFailingGrades() {
        int count = 0;
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] < 40) {
                count++;
            }
        }
        int[] failingGrades = new int[count];
        int index = 0;
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] < 40) {
                failingGrades[index] = grades[i];
                index++;
            }
        }
        return failingGrades;
    }

    public int[] getRoundedGrades() {
        int[] roundedGrades = new int[grades.length];
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] >= 38 && grades[i] % 5 >= 3) {
                roundedGrades[i] = grades[i] + (5 - grades[i] % 5);
            } else {
                roundedGrades[i] = grades[i];
            }
        }
        return roundedGrades;
    }

    public double averageGrade() {
        int sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = (double) sum / grades.length;
        average = ((int) (average * 100.0)) / 100.0;
        return average;
    }

}

