public class RegistrationDriver {
    public static void main(String[] args){
        Student stu = new Student("Andrew", "Nelson", "nelsona9980", 5);

       // stu.printStudentInfo();
        System.out.println(stu);
        stu.reset();
        System.out.println(stu);
    }
}
