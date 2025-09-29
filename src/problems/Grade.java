package problems;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    public static void main(String[] args) {
       List<Integer> grades = new ArrayList<>();
       grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        System.out.println(gradingStudents(grades));
        }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int nextMultiple=1;
        List<Integer> roundedGrades = new ArrayList<>();
        for (Integer grade : grades) {
            nextMultiple = (grade/5) + 1;
            if(grade >= 38 && (nextMultiple * 5) - grade < 3)
                roundedGrades.add(nextMultiple * 5);
            else
                roundedGrades.add(grade);
        }
        return roundedGrades;
    }
}
