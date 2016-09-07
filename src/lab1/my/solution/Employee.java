package lab1.my.solution;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
//    private Date birthDate;
//    private boolean metWithHr;
//    private boolean metDeptStaff;
//    private boolean reviewedDeptPolicies;
//    private boolean movedIn;
//    private String cubeId;
    private Date currentDate;
    Employee_Tasks newHire;
    

    public Employee() {
        currentDate = new Date();
    }

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        newHire = new Employee_Tasks();
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    void performNewHireDuties() {
        
        newHire.meetDepartmentStaff();
        newHire.meetWithHrForBenefitAndSalryInfo();
        newHire.reviewDeptPolicies();

        System.out.println("The employee's status is: " + newHire.getStatus());
    }

}
