public class StudentDriver 
{
    public static void main(String[] args) 
    {

        Student s1 = new Student();
        s1.id = 1;
        s1.name = "SAHIL KHAN";
        s1.college = "ISI";
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(Student.college);

        System.out.println("======================================");

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "SIDDESH SHAIKH";
        s2.college = "IIT-B";
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.college);


        Student s3 = new Student();
        System.out.println(s3.college);
        System.out.println(s1.college);
        
    }
    
}