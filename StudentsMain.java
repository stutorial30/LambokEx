
package sidharthsircorejava;

import java.util.List;
import java.util.Arrays;
import java.util.function.Supplier;

public class StudentsMain {

    public static void main(String[] args) {

        Supplier<List<Students>> supplier = () -> Arrays.asList(
            new Students(1, "Amit", 450),
            new Students(2, "Sneha", 380),
            new Students(3, "Rahul", 190),
            new Students(4, "Priya", 250),
            new Students(5, "Neha", 150)
        );

        List<Students> students = supplier.get();
        System.out.println("ID  Name   Marks  Percentage  Result");
        for (Students s : students) {
            double percentage = (s.getMarks() / 500.0) * 100;
            String result;
            if (s.getMarks() >= 200) {
                result = "Pass";
            } else {
                result = "Fail";
            }

            System.out.println(
                s.getId() + "   " +
                s.getName() + "   " +
                s.getMarks() + "     " +
                percentage + "%       " +
                result
            );
        }
    }
}
