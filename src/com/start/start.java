package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.entity.Employee;
import com.employeeDao.employeeDao;

public class start {
	public static void main(String[] args) throws IOException {
		System.out.println("welcome to Employee Management System Application");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go)
		{
			System.out.println("press 1 to ADD new employee");
			System.out.println("press 2 to delete employee");
			System.out.println("press 3 to display employee");
			System.out.println("press 4 to update Application");
			System.out.println("press 5 to exit Application");
			
			int c=Integer.parseInt(br.readLine());
			
			switch (c) 
			{
			case 1: //add employee
				System.out.println("enter employee id :");
				int id = Integer.parseInt(br.readLine());
				
				System.out.println("Enter employee name :");
				String name= br.readLine();
				
				System.out.println("Enter employee phone no :");
				String phone= br.readLine();
				
				System.out.println("Enter employee city :");
				String city= br.readLine();
				
				//create employee object to store the data 
				Employee st = new Employee(id,name, phone,city);
				
				
				boolean ans = employeeDao.insertEmployee(st);
				
				if(ans)
				{
					System.out.println("employee is added successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(st);
				break;
			
			case 2: // delete employee
				System.out.println("enter employee id which you want to delete");
				int userId = Integer.parseInt(br.readLine());
				boolean f= employeeDao.deleteEmployee(userId);
				if(f)
				{
					System.out.println("employee data deleted successfully");
				}
				else
				{
					System.out.println("Something went wrong..!!");
				}
			
				break;
			
			case 3: // display employees 
				employeeDao.showAllEmployee();
				break;
			case 4: // update student
				System.out.println("enter employee id whose data you want to update");
				int userId2 = Integer.parseInt(br.readLine());
				
				System.out.println("enter employee id :");
				int id2 = Integer.parseInt(br.readLine());
				
				System.out.println("Enter employee name :");
				String name2= br.readLine();
				
				System.out.println("Enter employee phone no :");
				String phone2= br.readLine();
				
				System.out.println("Enter employee city :");
				String city2= br.readLine();
				
				//create employee object to store the data 
				Employee st2 = new Employee(id2,name2, phone2,city2);
				
				boolean ans2 =employeeDao.updateEmployee(st2,userId2);
				
				if(ans2)
				{
					System.out.println("employee is updated successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(st2);
				break;
		
				
			case 5: // exit
				go=false;
				break;
				
				
			default:
				System.out.println("wrong choice try again");
			}
			
			
			
			}
		System.out.println("thankyou for using my application!!");
			
	
		}

	}



