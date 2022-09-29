package com.projectName.logic;

import java.util.ArrayList;
import java.util.Scanner;

import com.projectName.model.EmpDetails;

public class EmpLogic 
{
	private ArrayList<EmpDetails>emplist=new ArrayList<>();
	private Scanner src=new Scanner(System.in);
	private String reply="";
	
	public void userInput()
	{
		do{
			EmpDetails empobj=new EmpDetails();
			
			System.out.println("Enter Employee Id ");
			int x=src.nextInt();
			empobj.setEmpid(x);
			
			System.out.println("Enter Employee First Name ");
			String name=src.next();
			empobj.setEmpName(name);
			
			System.out.println("Enter Employee Dept ");
			String dep=src.next();
			empobj.setEmpDep(dep);
			
			System.out.println("Enter Employee Salary ");
			double sal=src.nextDouble();
			empobj.setEmpsal(sal);
			
			emplist.add(empobj);
			
			System.out.println("Wait To ADD Another Employee Y/N");
			reply=src.next();
		}while(reply.equalsIgnoreCase("y"));
	}
	
	public void display()
	{
		System.out.println("Employee Details Are.");
		for(EmpDetails e: emplist)
		{
			System.out.println("Emp Id "+e.getEmpid());
			System.out.println("Emp Name "+e.getEmpName());
			System.out.println("Emp Dept "+e.getEmpDep());
			System.out.println("Emp Salary "+e.getEmpsal());
		}
	}
	
	/*public void search(){
		
		System.out.println("Enter the empName to Search");
		String a=src.next();
		emplist.contains(a);
		
	}*/

}
