import java.util.ArrayList;
import java.util.Iterator;
public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student(1, "ABC", 22);
        Student s2 = new Student(2, "DEF", 20);
        Student s3 = new Student(3, "GHI", 24);
        Student s4 = new Student(4, "JKL", 27);
        Student s5 = new Student(5, "MNO", 21);

        ArrayList<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println(list);

        System.out.println("==================================");
        
        int id = 3;
        Iterator<Student> i = list.iterator();
        
        while (i.hasNext()) {
            Student s = i.next();
            if (s.getId() == id) {
                // list.remove(s); //! ConcurrentModificationException
                System.out.println(s + "  Removing this element");
                i.remove(); //# calling the java.util.Iterator.remove()
            }
        }

        System.out.println("==================================");

        System.out.println(list);
    }
}
