public class GradeTracker
{
    private Student[] students;
    private int count;

    public GradeTracker()
    {
        students = new Student[100];
        count = 0;
    }
    public void addStudent(String name,double grade)
    {
        if (count < students.length)
        {
            students[count++] = new Student(name,grade);
        }
        else
        {
          System.out.println("Maximum number of students reached.");
        }
        
    }
    public double getAverage()
    {
        if(count == 0) return 0.0;

        double sum =0.0;
        for (int i =0; i < count; i++)
        {
            sum += students[i].grade;
        }
        return sum / count;
    }
    public double getHighest()
    {
        if(count == 0) return 0.0;

        double highest = students[0].grade;
        for (int i = 1; i < count; i++)
        {
            if (students[i].grade > highest)
            {
                highest = students[i].grade;
            }
        }
        return highest;
    }
    public double getLowest()
    {
        if (count == 0) return 0.0;

        double lowest = students[0].grade;
        for (int i = 1; i < count; i++)
        {
            if (students[i].grade < lowest)
            {
                lowest = students[i].grade;
            }
        }
        return lowest;
    }
}


    