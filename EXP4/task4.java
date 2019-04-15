import java.util.*;
class Person
{
	long id;
	String name;
	String dob;
	String department;
	long phoneno;
	String email;
	String address;
	String password;

	Person()
	{
		name="NOSTUDENT";
		id=000000000;
		dob="01/01/1998";
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
		System.out.println("\nENTER NAME                      : ");
		name = s1.nextLine();
		System.out.println("\nENTER ID/ROLL NUMBER(STUDENT)   : ");
		id = s.nextLong();
		System.out.println("\nENTER DATE OF BIRTH             : ");
		dob = s1.nextLine();
		System.out.println("\nENTER DEPARTMENT                : ");
		department = s1.nextLine();
		System.out.println("\nENTER PHONE NUMBER              : ");
		phoneno = s.nextLong();
		System.out.println("\nENTER EMAIL         			  : ");
		email = s1.nextLine();
		System.out.println("\nENTER CITY NAME 	  			  : ");
		address = s1.nextLine();
		System.out.println("\nENTER PASSWORD      			  : ");
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
		System.out.println("\n ===ENTERED DATA=== ");
		System.out.println("\n NAME             : " + name + "\n");
		System.out.println("\n ID/ROLL NUMBER   : " + id + "\n");
		System.out.println("\n DATE OF BIRTH 	: " + dob + "\n");
		System.out.println("\n DEPARTMENT    	: " + department + "\n");
		System.out.println("\n PHONE         	: " + phoneno + "\n");
		System.out.println("\n EMAIL 		 	: " + email + "\n");
		System.out.println("\n ADDRESS       	: " + address + "\n");
		//mainMenu();
	}



	public void mainMenu()
	{
		System.out.println("\nMAIN MENU ");
		System.out.println("\n1.RE-ENTER DATA");
		System.out.println("\n2.EDIT PHONE NUMBER");
		System.out.println("\n3.DISPLAY DATA");
		System.out.println("\n4.EDIT EMAIL");
		System.out.println("\n5.CHANGE PASSWORD");
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
		}
	}
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

public class task4{
	public static void main(String args[])
	{
	//Person obj1 = new Person();
	//obj1.getData();
	Student sobj1 = new Student();
	sobj1.getDataS();
	sobj1.putDataS();
	}
}
