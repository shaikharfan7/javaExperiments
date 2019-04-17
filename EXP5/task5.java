import java.util.*;


class Person
{
	long id;
	Name name;
	Date1 dob;
	String department;
	long phoneno;
	String email;
	String address;
	String password;
	//Marksheet mobj1 = new Marksheet();

	Person()
	{
		
		this.name = new Name("F","M","L");
		id=000000000;
		this.dob = new Date1(01,12,1998);
		department="NODEPARTMENT";
		phoneno=0000000000;
		email="noemail@email.com";
		address="NOADDRESS";
		password="password";
	
	}


	void getData()
	{
		Scanner s = new Scanner(System.in);  //scanner for integer data
		Scanner s1 = new Scanner(System.in); //scanner for string data
		System.out.println("\nENTER REQUIRED DATA \n");


		System.out.println("\n=============ENTER NAME============");
		System.out.println("\nENTER FIRST NAME                 : ");
		String fname = s1.nextLine();
		System.out.println("\nENTER MIDDLE NAME                : ");
		String mname = s1.nextLine();
		System.out.println("\nENTER LAST NAME                  : ");
		String lname = s1.nextLine();
		this.name = new Name(fname,mname,lname);


		System.out.println("\nENTER ID/ROLL NUMBER(STUDENT)    : ");
		id = s.nextLong();
		System.out.println("\n========ENTER DATE OF BIRTH========");
		System.out.println("\nENTER DAY OF BIRTH               : ");
		int ddob = s.nextInt();
		System.out.println("\nENTER MONTH OF BIRTH             : ");
		int mob = s.nextInt();
		System.out.println("\nENTER YEAR OF BIRTH              : ");
		int yob = s.nextInt();
		this.dob = new Date1(ddob,mob,yob);
		System.out.println("\nENTER DEPARTMENT                 : ");
		department = s1.nextLine();
		System.out.println("\nENTER PHONE NUMBER               : ");
		phoneno = s.nextLong();
		System.out.println("\nENTER EMAIL         			   : ");
		email = s1.nextLine();
		System.out.println("\nENTER CITY NAME  	  			   : ");
		address = s1.nextLine();
		System.out.println("\nENTER PASSWORD      			   : ");
		password = s1.nextLine();
		//mainMenu();
	}


	public long getID()
	{
		return id;
	}

	public void editPhoneNo()
	{
		System.out.println("\nEDITING PHONE NUMBER");
		System.out.println("\nENTER NEW NUMBER : ");
		Scanner eno = new Scanner(System.in);
		phoneno = eno.nextLong();
		System.out.println("\nNUMBER CHANGED TO "+phoneno);
		mainMenu();
	}	

	public void editEmail()
	{
		System.out.println("\nEDITING EMAIL ADDRESS");
		System.out.println("\nENTER NEW EMAIL : ");
		Scanner em = new Scanner(System.in);
		email = em.nextLine();
		System.out.println("\nEMAIL CHANGED TO"+email);
		mainMenu();
	}

	public void changePwd()
	{
		System.out.println("\nCHANGING PASSWORD");
		System.out.println("\nENTER OLD PASSWORD");
		Scanner epwd = new Scanner(System.in);
		String tmp_pwd = epwd.nextLine();
		if(tmp_pwd.equals(password))
		{	
		Scanner epwd1 = new Scanner(System.in);	
		System.out.println("\nENTER NEW PASSWORD");
		password = epwd1.nextLine();
		System.out.println("\nPASSWORD CHANGED SUCCESSFULLY");
		}
		else
		{
			System.out.println("\nINCORRECT OLD PASSWORD,TRY AGAIN!");
		}
		mainMenu();
	}

	void putData()
	{
		System.out.println("\n====ENTERED DATA====");
		System.out.println("\nNAME              : " +name.getfirstName() + " " +name.getmiddleName() + " " +name.getlastName());
		System.out.println("\nID/ROLL NUMBER    : " + id + "\n");
		System.out.println("\nDATE OF BIRTH 	: " +dob.getDate()+"/" +dob.getMonth()+"/"+dob.getYear());
		System.out.println("\n\nDEPARTMENT    	: " + department + "\n");
		System.out.println("\nPHONE         	: " + phoneno + "\n");
		System.out.println("\nEMAIL 		 	: " + email + "\n");
		System.out.println("\nADDRESS       	: " + address + "\n");
		mainMenu();
	}

	public void editDate()
	{
		System.out.println("\nEDIT DATE MENU ");
		System.out.println("\n1.RE-ENTER DATE");
		System.out.println("\n2.RE-ENTER MONTH");
		System.out.println("\n3.RE-ENTER YEAR");

		System.out.println("\nENTER YOUR CHOICE : ");
		Scanner dmnu = new Scanner(System.in);
		int op_val1 = dmnu.nextInt();
		switch(op_val1)
		{
			case 1 : dob.editDay();
				     break;
			case 2 : dob.editMonth();
				 	 break;
			case 3 : dob.editYear();
					 break;	 	 	     	
		}

		mainMenu();
	}


	public void editName()
	{
		System.out.println("\nEDIT NAME MENU ");
		System.out.println("\n1.RE-ENTER FIRST NAME");
		System.out.println("\n2.RE-ENTER MIDDLE NAME");
		System.out.println("\n3.RE-ENTER LAST NAME");
		System.out.println("\nENTER YOUR CHOICE : ");
		Scanner nmnu = new Scanner(System.in);
		int op_val2 = nmnu.nextInt();
		switch(op_val2)
		{
			case 1 : name.editFirstName();
				     break;
			case 2 : name.editMiddleName();
				 	 break;
			case 3 : name.editLastName();
					 break;	 	 	     	
		}

		mainMenu();
	}


	


	public void mainMenu()
	{
		System.out.println("\nMAIN MENU ");
		System.out.println("\n1.RE-ENTER DATA");
		System.out.println("\n2.EDIT PHONE NUMBER");
		System.out.println("\n3.DISPLAY DATA");
		System.out.println("\n4.EDIT EMAIL");
		System.out.println("\n5.CHANGE PASSWORD");
		System.out.println("\n6.EDIT DATE");
		System.out.println("\n7.EDIT NAME");
		System.out.println("\n8.VIEW MARKSHEET");
		System.out.println("\nENTER YOUR CHOICE : ");
		Scanner mnu = new Scanner(System.in);
		int op_val = mnu.nextInt();

		switch(op_val)
		{
			case 1 : getData();
				     break;
			case 2 : editPhoneNo();
					 break;
			case 3 : putData();
					 break;		
			case 4 : editEmail();
					 break;
			case 5 : changePwd();
					 break;
			case 6 : editDate();
				     break;		 
			case 7 : editName();
				     break;	     
			}
	}

}





class Teacher extends Person{

	Scanner s1 = new Scanner(System.in);
	Scanner s = new Scanner(System.in);
	
	void getDataT()
	{
		this.getData();
		mainMenu();
	}

	void putDataT()
	{
		this.putData();
		mainMenu();
	}

	public void modifyMarksheet()
	{

		Marksheet mobj1 = new Marksheet();
		mobj1.addMarksData();
		mobj1.displayMksheet();
	
	}
	
		//mainMenu();
}



class Student extends Person{
	int hostelno;
	int roomno;
	int sem; 

	public Student()
	{
		super();
		sem=0;
		hostelno=0;
		roomno=0;
	}

	void getDataS()
	{
		this.getData();
		//super();
		Scanner sint = new Scanner(System.in);
		System.out.println("\nENTER HOSTEL NUMBER : ");
		hostelno = sint.nextInt();
		System.out.println("\nENTER ROOM NUMBER   : ");
		roomno = sint.nextInt();
		System.out.println("\nENTER SEMESTER      : ");
		sem = sint.nextInt();
		mainMenu();
	}

	public int getSemester()
	{
		return sem;
	} 

	public int getHostelNo()
	{
		return hostelno;
	}

	public int getRoomNo()
	{
		return roomno;
	}

	void putDataS()
	{
		this.putData();
		//super();
		System.out.println("\n HOSTEL NUMBER : " + hostelno + "\n");
		System.out.println("\n ROOM NUMBER   : " + roomno + "\n");
		System.out.println("\n SEMESTER      : " + sem + "\n");
		mainMenu();
	}

}

public class task5{
	public static void main(String args[])
	{
	System.out.println("\nPRESS 1 IF YOU ARE A STUDENT OR PRESS 2 IF YOU ARE A TEACHER");
	System.out.println("\nENTER YOUR CHOICE : ");
	Scanner tmps = new Scanner(System.in);
	int tmpch = tmps.nextInt();
	if(tmpch==1)
	{	
	Student sobj1 = new Student();
	sobj1.getDataS();
	sobj1.putDataS();
	}
	else if(tmpch==2)
	{
	Teacher tobj1 = new Teacher();
	//tobj1.getDataT();
	tobj1.modifyMarksheet();	
	}
	
	}
}	
