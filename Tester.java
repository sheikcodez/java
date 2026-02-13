
import java.util.Scanner;

interface DataProvider{
    void calcPercentage();
}

class Intern implements DataProvider{
    int marksSecured,graceMarks,totalMaximumMark;
    Intern(int marksSecured,int graceMarks){
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }
    @Override
    public void calcPercentage() {
        if(marksSecured>7201)
        {
            System.out.println("Intern Maximum Secured Mark is 7200");
            return;
        }
        else if(graceMarks>801)
        {
            System.out.println("Intern Maximum Grace Mark is 800");
            return;
        }
        totalMaximumMark = marksSecured+graceMarks;
        double percentage = (totalMaximumMark*100)/8000;
        System.out.println("Intern Percentage : "+percentage);
    }
}

class Trainee implements DataProvider{
    int marksSecured;
    Trainee(int marksSecured){
        this.marksSecured = marksSecured;
    }
    public void calcPercentage(){
        if(marksSecured>8001){
            System.out.println("Tainee Maximum Secured Mark is 8000");
            return;
        }
        double percentage = (marksSecured*100)/8000;
        System.out.println("Trainee Percentage : "+percentage);
    }
}

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Intern Secured Mark : ");
        int internSecured = sc.nextInt();
        System.out.print("Enter Grace Mark of the Intern : ");
        int grace = sc.nextInt();
        Intern intern = new Intern(internSecured, grace);
        intern.calcPercentage();

        System.err.println();
        System.out.print("Enter the Trainee Secured Mark : ");
        int traineeSecured = sc.nextInt();
        Trainee trainee = new Trainee(traineeSecured);
        trainee.calcPercentage();

        sc.close();
    }
}
