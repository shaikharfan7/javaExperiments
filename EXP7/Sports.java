import java.util.Scanner;

public class Sports implements Cocurricular
{
    int level;
    int graceMarks;
    boolean isGrace;
    int marksObtained;
    Scanner s = new Scanner(System.in);

    //Default Constructor
    public Sports()
    {
        level = 0;
        graceMarks = 0;
        isGrace = false;
        marksObtained = 0;
    }
    public void setLevel()
    {
        System.out.println("[=================LEVELS=================");
        System.out.println(" 1 => National level  2 => State Level");
        System.out.println(" 3 => District level  4 => College Level");
        System.out.print("Enter sporting level reached by the student: ");
        level = s.nextInt();
    }

    public void setGraceMarks()
    {
        System.out.print("Enter maximum grace marks allotted for Sports: ");
        graceMarks = s.nextInt();
    }

    public int getMarksObtained()
    {
        if(level==0)
        {
            System.out.println("Student hasn't played sports at any level");
            marksObtained = 0;
            isGrace = false;
        }
        else
        {
            System.out.println("Student has played at Level "+level+".");
            marksObtained = graceMarks/level;
            System.out.println("They will be awarded "+marksObtained+" grace marks.");
            isGrace = true;
        }
        return marksObtained;
    }
    public boolean getIsGrace()
    {
        return isGrace;
    }

}