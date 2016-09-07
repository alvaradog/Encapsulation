package lab1.my.solution;


public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    Employee_Tasks newHire;
    

    public Employee() {
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
        
        
        newHire.meetWithHrForBenefitAndSalryInfo();
        newHire.meetDepartmentStaff();
//        newHire.reviewDeptPolicies();
//
//        System.out.println("The employee's status is: " + newHire.getStatus());
    }

}
