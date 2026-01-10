package Daily_Code.interview_prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample implements Comparator<ComparatorExample>{
    int studentId;
    String studentName;

    public ComparatorExample(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public int compare(ComparatorExample student1, ComparatorExample student2){
        return student1.studentName.length() - student2.studentName.length();
    }

    public static void main(String[] args) {
        List<ComparatorExample> list = new ArrayList<>();
        list.add(new ComparatorExample(1001, "Darshan"));
        list.add(new ComparatorExample(1002, "Yuvan"));
        list.add(new ComparatorExample(1003, "Aishwarya"));

        Collections.sort(list, new ComparatorExample(0, null));

        for(ComparatorExample s : list){
            System.out.println(s.studentId+" -> "+s.studentName);
        }
    }
}




