import java.util.Scanner;

public class NSS implements Cocurricular
{
    int requiredHrs;
    int completedHrs;
    int graceMarks;
    boolean isGrace;
    int marksObtained;
    Scanner s = new Scanner(System.in);

    //Default constructor
    public NSS()
    {
        requiredHrs=10;
        completedHrs=0;
        graceMarks=0;
        isGrace=false;
        marksObtained=0;
    }
    public void setCompletedHrs()
    {
        System.out.print("Enter number of hours completed by student: ");
        completedHrs = s.nextInt();
    }

    public void setRequiredHrs()
    {
        System.out.print("Enter number of hours required: ");
        requiredHrs = s.nextInt();
    }

    public void setGraceMarks()
    {
        System.out.print("Enter grace marks allotted for NSS: ");
        graceMarks = s.nextInt();
    }

    public int getMarksObtained()
    {
        if(completedHrs>=requiredHrs)
        {
            System.out.println("Student has completed "+completedHrs+" hours of NSS work.");
            System.out.println("They will be awarded "+graceMarks+" grace marks.");
            marksObtained = graceMarks;
            isGrace = true;
        }
        else
        {
            System.out.println("Student hasn't met minimum hours. No grace marks awarded.");
            marksObtained = 0;
            isGrace = false;
        }

        return marksObtained;
    }

    public boolean getIsGrace()
    {
        return isGrace;
    }

}