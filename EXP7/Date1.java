import java.util.Scanner;



public class Date1 {
    int Date;
    int Month;
    int Year;

    Scanner s = new Scanner(System.in);

    public int getDate() {
        return Date;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void editDay()
    {

        System.out.println("\nENTER NEW DAY OF BIRTH               : ");
        this.Date = s.nextInt();
        //return ddob;
    }

    public void editMonth()
    {
        System.out.println("\nENTER NEW MONTH OF BIRTH             : ");
        this.Month = s.nextInt();
    
    }

    public void editYear()
    {
        System.out.println("\nENTER NEW YEAR OF BIRTH             : ");
        this.Year = s.nextInt();
    
    }    

    public Date1() {
        this.Date=1;
        this.Month=1;
        this.Year=1995;
    }

    public Date1(int Date, int Month, int Year) {
        this.Date = Date;
        this.Month = Month;
        this.Year = Year;
        this.validate();

    }
    
   public void validate()
    {
        if(this.Date>31||this.Month>12||this.Year>2099)
            System.out.println("\n INVALID DATE");
        else if((this.Month==2||this.Month==4||this.Month==6||this.Month==9||this.Month==11)&&(this.Date>30))
            System.out.println("\n INVALID DATE");
        else if(((this.Month==2)&&(this.Date>28))&&((this.Year%4!=0)&&(this.Year%100!=0)&&(this.Year%400!=0)))
            System.out.println("\n INVALID DATE");
    

    }

    public void dobDisplay()
    {
        System.out.print(" " + this.Date+"/"+this.Month+"/"+this.Year);
    }
    
}