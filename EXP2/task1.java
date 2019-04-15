//package SMSP1; //package : Student Management System Package 1 (TASK1)

import java.util.*;

 class Student{

	//data members
	String name;
	long id;
	int hostelno;
	int roomno;
	String dob;
	int sem;
	String department;
	long phoneno;
	String email;
	String address;
	String password;

	//default constructor
	Student()
	{
		name="NOSTUDENT";
		id=000000000;
		hostelno=0;
		roomno=0;
		dob="01/01/1998";
		sem=0;
		department="NODEPARTMENT";
		phoneno=0000000000;
		email="noemail@email.com";
		address="NOADDRESS";
		password="password";
	}

	//parameterized constructor
	Student(String tmp_name,long tmp_rollno,int tmp_hostelno,int tmp_roomno,String tmp_dob,int tmp_sem,String tmp_branch,long tmp_phone,String tmp_email,String tmp_adr,String tmp_pwd)
	{
		name=tmp_name;
		id=tmp_rollno;
		hostelno=tmp_hostelno;
		roomno=tmp_roomno;
		dob=tmp_dob;
		sem=tmp_sem;
		department=tmp_branch;
		phoneno = tmp_phone;
		email = tmp_email;
		address = tmp_adr;
		password = tmp_pwd;
	}

	void getData()
	{
		Scanner s = new Scanner(System.in);  //scanner for integer data
		Scanner s1 = new Scanner(System.in); //scanner for string data
		System.out.println("\nENTER REQUIRED DATA \n");
		System.out.println("\nENTER NAME          : ");
		name = s1.nextLine();
		System.out.println("\nENTER ROLL NUMBER   : ");
		id = s.nextLong();
		System.out.println("\nENTER HOSTEL NUMBER : ");
		hostelno = s.nextInt();
		System.out.println("\nENTER ROOM NUMBER   : ");
		roomno = s.nextInt();
		System.out.println("\nENTER DATE OF BIRTH : ");
		dob = s1.nextLine();
		System.out.println("\nENTER SEMESTER      : ");
		sem = s.nextInt();
		System.out.println("\nENTER DEPARTMENT    : ");
		department = s1.nextLine();
		System.out.println("\nENTER PHONE NUMBER  : ");
		phoneno = s.nextLong();
		System.out.println("\nENTER EMAIL         : ");
		email = s1.nextLine();
		System.out.println("\nENTER CITY NAME 	  : ");
		address = s1.nextLine();
		System.out.println("\nENTER PASSWORD      : ");
		password = s1.nextLine();
		mainMenu();
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
		System.out.println("\n NAME          : " + name + "\n");
		System.out.println("\n ROLL NUMBER   : " + id + "\n");
		System.out.println("\n HOSTEL NUMBER : " + hostelno + "\n");
		System.out.println("\n ROOM NUMBER   : " + roomno + "\n");
		System.out.println("\n DATE OF BIRTH : " + dob + "\n");
		System.out.println("\n SEMESTER      : " + sem + "\n");
		System.out.println("\n DEPARTMENT    : " + department + "\n");
		System.out.println("\n PHONE         : " + phoneno + "\n");
		System.out.println("\n EMAIL 		 : " + email + "\n");
		System.out.println("\n ADDRESS       : " + address + "\n");
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




public class task1{
	
	public static void main(String args[])
	{
		System.out.println("\n CLASSES AND OBJECTS - MODULE TO ACCEPT AND DISPLAY BASIC STUDENT DETAILS ");
		Student obj3 = new Student();
		obj3.getData();
		obj3.putData();
		obj3.mainMenu();
	}	

} 