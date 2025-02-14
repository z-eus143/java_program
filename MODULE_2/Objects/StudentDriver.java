public class StudentDriver 
{
    public static void main(String[] args) 
    {

        Student s1 = new Student(1,"SAHIL KHAN","FY");
        Student.college = "ISI";
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(Student.college);

        System.out.println("======================================");

        Student s2 = new Student(2,"SIDDESH SHAIKH","SY");
        Student.college = "IIT-B";
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(Student.college);
    }
    
}