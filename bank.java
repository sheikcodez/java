import java.util.*;
class Customer
{
    float bal,salary;
    String loan;
    int acc_no;
    double amount,emi;

    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    void check(String ch)
    {
        if("yes".equals(ch))
        {
            System.out.print("Enter your account number : ");
            acc_no = sc.nextInt();

            if(acc_no >=1000 && acc_no <= 1999 )
                getCustomerdata();
            else
                System.out.println("Sorry , Invalid Account Number !");
        }
        else
        {
            int lastThreeDigits = r.nextInt(1000);
            int acc = 1000+lastThreeDigits;
            System.out.println("Your Account Number : "+acc);
            getCustomerdata();
            return;
            
        }
        
    }

    void balance(float bal)
    {
        this.bal = bal;
        if(bal < 1000)
        {
            System.out.println("Balance is Insufficient.");
            System.out.println("Minimum Balance is $1000");
        }  
    }

    void loanType(String loan)
    {
        this.loan = loan;
        if(loan.equalsIgnoreCase("Car") || loan.equalsIgnoreCase("House") || loan.equalsIgnoreCase("Business"))
            System.out.println(loan +" Loan is Available.");
        else
            System.out.println(loan +" Loan is Not Available.");
    }

    void getCustomerdata()
    {
        System.out.print("Enter your account balance :");
        float bal = sc.nextInt();
        balance(bal);

        System.out.print("Enter your salary :");
        salary = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter you loan (Car/House/Business):");
        String loan = sc.nextLine();
        loanType(loan);

        System.out.print("Enter your Expected Loan amount :");
        double amount = sc.nextDouble();

       System.out.print("Enter your Expected number of EMIs :");
       double emi = sc.nextDouble();

        switch (loan.toLowerCase()) 
        {
            case "Car":
                   
                System.out.println("For car Loan expected loan amount <= 500000 and EMI <=36");
                if(amount <= 500000 && emi <=36)
                    System.out.print("pay" + amount/emi + "per month.");
                break;

            case "House":
                
                System.out.println("For house Loan expected loan amount <= 6000000 and EMI <=60");
                if(amount <= 6000000 && emi <= 60) 
                    System.out.print("pay" + amount/emi + "per month.");
                break;

            case "Business":
                
                System.out.println("For car Loan expected loan amount <= 7500000 and EMI <=84");
                if(amount <= 7500000 && emi <= 84)
                    System.out.print("pay" + amount/emi + "per month.");
                break;

            default:
                System.out.println("Thanks for visiting our bank !");
                break;
        }
    }

    void display()
    {
        System.out.println("Account Number : "+acc_no);
        System.out.println("eligible for "+ loan + " Loan ");
        System.out.println("Reqested Loan Amount : " + amount);
        System.out.println("Requested EMIs :" + emi);

    }
}

class bank
{
    public static void main(String [] a)
    {
       Scanner sc = new Scanner(System.in);
        Customer c = new Customer();

        System.out.print("Do you already have an account? (yes/no):");
        String find = sc.nextLine();
        c.check(find);
        c.display();

        sc.close();
    }
}