import java.util.*;

class Employee
{
    String empName;
    int empId;

    Employee(String empName , int empId )
    {
        this.empName = empName;
        this.empId  = empId;
    }
    
    void setter(String empName,int empId)
    {
        this.empName = empName;
        this.empId = empId ;
    }
}

class ConEmp extends Employee
{
    double wages,hours;

    ConEmp(String empName , int empId , double wages , double hours)
    {
        super(empName, empId);
        this.wages = wages;
        this.hours  = hours;        
    }
    void setter(double wages , double hours)
    {
        this.wages = wages;
        this.hours = hours;

        double salary = wages*hours;
        System.out.println("Contract Employee Salary : "+salary);
    }
}

class PerEmp extends Employee
{
    double b_salary,hra,exp;

    PerEmp(String empName,int empId,double b_salary,double hra, double exp)
    {
        super(empName, empId);
        this.b_salary = b_salary;
        this.hra = hra;
        this.exp = exp;
    }
    void setter(double b_salary,double hra, double exp)
    {
        super.setter(empName, empId);
        this.b_salary = b_salary;
        this.hra = hra;
        this.exp = exp;

        double TotalSalary = b_salary+hra;
        System.out.println("Permanent Employee Salary : "+TotalSalary);
        System.out.println("Permanent Employee Experience : " + exp);
    }

}
public class newfile 
{
    public static void main (String [] a)
    {
        Scanner sc = new Scanner(System.in);
        
        ConEmp c = new ConEmp("jhon" , 1001 , 15000 , 2.5);
        c.setter( 15000 , 2.5);

        PerEmp p = new PerEmp("alice", 101, 5000, 5000, 2);
        p.setter( 45000, 5000, 2.5);
       
        sc.close();   
    }
}
