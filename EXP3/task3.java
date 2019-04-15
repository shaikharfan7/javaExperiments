import java.util.*;

class Teacher{
	String[] subjectst = new String[5];

	public void getSubNames()
	{
		Scanner subobj = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{	
			System.out.println("\nENTER NAME FOR SUBJECT "+(i+1));
			subjectst[i] = subobj.nextLine();
		}	
	}

	public void putSubNames()
	{	
		System.out.println("\nCURRENT SUBJECTS TAUGHT :");
		for(int i=0;i<5;i++)
		{
			System.out.println("Subject "+i+ " :" +subjectst[i]);
		}
		mainMenu();	
	}

	public void editSubjectsTaught()
	{
		System.out.println("\nEDITING SUBJECTS TAUGHT");
		System.out.println("\nENTER SUBJECT NUMBER : ");
		Scanner num1 = new Scanner(System.in);
		int n = num1.nextInt();
		n--;
		//System.out.println("\n" +n);
		Scanner em = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			String tmp_subn = subjectst[i];
			if(i==n)
			{
				System.out.println("\nENTER NEW SUBJECT NAME : ");
				subjectst[i] = em.nextLine();
				System.out.println("\nSUBJECT NAME CHANGED FROM " + tmp_subn + " TO "+subjectst[i]);
				
			}	
			
		}	

		mainMenu();
	}



	public void mainMenu()
	{
		System.out.println("\nMAIN MENU ");
		System.out.println("\n1.EDIT SUBJECTS");
		
		System.out.println("\n2.DISPLAY DATA");
		
		System.out.println("\nENTER YOUR CHOICE : ");
		Scanner mnu = new Scanner(System.in);
		int op_val = mnu.nextInt();

		switch(op_val)
		{
			case 1 : editSubjectsTaught();
				     break;
			case 2 : putSubNames();
					 break;

		}

	}


}

public class task3{ 
	public static void main(String[] args) {
		
		Teacher obj1 = new Teacher();
		obj1.getSubNames();
		obj1.putSubNames();
	}
}