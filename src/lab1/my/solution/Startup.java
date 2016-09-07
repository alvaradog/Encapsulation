package lab1.my.solution;

public class Startup {
    public static void main(String[] args) {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
        */
        Employee employee = new Employee("Peter", "Piper", "333-1234");
        
        employee.performNewHireDuties();
    }
    
    
}
