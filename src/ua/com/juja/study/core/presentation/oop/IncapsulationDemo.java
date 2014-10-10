package ua.com.juja.study.core.presentation.oop;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/9/14
 * Time: 8:50 PM
 */
public class IncapsulationDemo {

    private static String [] jujaStudents = {"Artem Kudlaenko", "Buben Code", "Dmitry Shabotin", "Dmitry Tsapko",
            "Eugene Eug", "Ihor Hrysha", "Lesha Petrohalko", "Nn Nn", "Rain Pster", "Vasyl Kruten", "Victor Pidleteychuk",
            "Yaroslav P", "Yevgeniy Protsyuk", "Максим Клеткин", "Николай Черных"};

    public static void main(String[] args) {
        TrainingCource juja = new TrainingCource(jujaStudents);
        juja.getAllStudents()[2] = "My Cousin";
        juja.printAllStudents();
    }

}

class TrainingCource {
    private String[] students;

    public TrainingCource(String [] students){
        this.students = students;
    }

//    public String[] getAllStudents() {
//        return students;
//    }

    public String[] getAllStudents() {
        String[] studentsCopy = new String[students.length];
        for (int i = 0; i < students.length; i++)
            studentsCopy[i] = students[i];
        return studentsCopy;
    }

    public void printAllStudents(){
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ", ");
        }
    }

}
