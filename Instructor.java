public class Instructor {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String office;
    protected int yearsOfExp;

    public Instructor(String firstName, String lastName, String email, String office, int yearsOfExp){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.office = office;
        this.yearsOfExp = yearsOfExp;
    }

    public Instructor(){
        firstName = lastName = email = office = "Default";
        yearsOfExp = 0;
    }

    public void reset(){
        firstName = lastName = email = office = "Reset";
        yearsOfExp = -1;
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

    public void setOffice(String office) {
        this.office = office;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
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

    public String getOffice() {
        return office;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nEmail: " + email + "\nOffice: " + office + "\nYears of Experience: " + yearsOfExp;

    }
}
