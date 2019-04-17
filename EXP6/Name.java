import java.util.Scanner;

public class Name {
    String firstName;
    String middleName;
    String lastName;
    Scanner s1 = new Scanner(System.in);

    public String getfirstName() {
        return firstName;
    }

    public String getmiddleName() {
        return middleName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setmiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public Name() {
        this.firstName="FName";
        this.middleName="MName";
        this.lastName="LName";
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public void editFirstName()
    {
        System.out.println("\nENTER FIRST NAME                 : ");
        this.firstName = s1.nextLine();
        
    }


    public void editMiddleName()
    {
        System.out.println("\nENTER MIDDLE NAME                : ");
        this.middleName = s1.nextLine();
        
    }
 
    public void editLastName()
    {
        System.out.println("\nENTER LAST NAME                  : ");
        this.lastName = s1.nextLine();

    }

  public void nameDisplay()
  {
      System.out.println(this.firstName+" "+this.middleName+" "+this.lastName);
  }
}