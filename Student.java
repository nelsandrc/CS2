public class Student {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected double[] grades;
    protected int classNum;

    public Student(String firstName, String lastName, String email, int classNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        grades = new double[classNum];
        this.classNum = classNum;
    }

    public Student(){
        firstName = lastName = email = "Default";
        grades = null;
        classNum = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   /* public void setGrades(int classNum) {
       grades = new  double[classNum]
    }*/

    public String toString() {
        return ("Name: " + firstName + " " + lastName + "\nEmail: " + email);
    }

    public void printStudentInfo(){
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
    }
    public void reset(){
        firstName = lastName = email = "";
        grades = null;
        classNum = 0;
    }

}
