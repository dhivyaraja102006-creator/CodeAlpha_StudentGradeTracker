import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        GradeTracker tracker=new GradeTracker();

        System.out.print("Enter number of students:");
        int n=sc.nextInt();

        sc.nextLine();
        for(int i=1;i<=n;i++)
        {
            System.out.print("Student Name:");
            String name=sc.nextLine();
            System.out.print("Grade:");
            double grade=sc.nextDouble();
            sc.nextLine();

            tracker.addStudent(name,grade);
        }
        System.out.println("\n---Grade Summary---");
        System.out.println("Average Grade:"+tracker.getAverage());
        System.out.println("Highest Grade:"+tracker.getHighest());
        System.out.println("Lowest Grade:"+tracker.getLowest());

        sc.close();
    }
}
