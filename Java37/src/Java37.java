public class Java37 {
    public static void main(String[] args)
    {
        DateBirth dateB1 = new DateBirth(10,5,2000);
        DateBirth dateB2 = new DateBirth(15,3,2001);
        DateBirth dateB3 = new DateBirth(10,5,2000);

        Class c1 = new Class("Class01","Math");
        Class c2 = new Class("Class02","Literature");
        Class c3 = new Class("Class03","Physics");

        Student st1 = new Student("ST01","Nam",dateB1,3.5,c1);
        Student st2 = new Student("ST02","Lan",dateB2,7.0,c2);
        Student st3 = new Student("ST03","Anh",dateB3,5.0,c3);

        System.out.println("Student 1 of faculty: "+st1.printNameFaculty());
        System.out.println("Student 2 of faculty: "+st2.printNameFaculty());
        System.out.println("Student 3 of faculty: "+st3.printNameFaculty());

        System.out.println("Student 1 pass the course: "+st1.checkPassCourse());
        System.out.println("Student 2 pass the course: "+st2.checkPassCourse());
        System.out.println("Student 3 pass the course: "+st3.checkPassCourse());

        System.out.println("Student 1 have same birthday student 2: "+st1.checkDateBrith(st2));
        System.out.println("Student 1 have same birthday student 3: "+st1.checkDateBrith(st3));
    }
}
