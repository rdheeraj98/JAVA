
//17 Program

import java.util.Scanner;

interface Student
{
	int studentID = 3;
	String studentName = "ABC";
	String Class = "CE" ;

	void getValue();
}

class Department implements Student
{
	int attendance;

	public void getAttendance()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Attendance: ");
		attendance = sc.nextInt();
	}

	public void getValue()
	{
		System.out.println("ID :" + studentID + "\tName :" + studentName + "\tClass : " + Class);
	}
}

class Exam extends Department
{
	public void calculateAttendance()
	{
		attendance = attendance;
	}
	public boolean eligible()
	{
	if(attendance < 60)
		return false;
		else
		return true;
	}
}

public class Practical20
{
	public static void main(String[] args)
	{
		Exam e = new Exam();
		e.getValue();
		e.getAttendance();
		e.calculateAttendance();
		System.out.println("Eligibility :" + e.eligible());

		
	}
}	
