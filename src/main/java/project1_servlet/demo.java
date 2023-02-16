package project1_servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class demo extends GenericServlet{
	

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1 = arg0.getParameter("empid");
		int empid = Integer.parseInt(s1);
		String empname = arg0.getParameter("empname");
		String date=arg0.getParameter("Date");
		String address=arg0.getParameter("Address");
		String gender=arg0.getParameter("Gender");
		String email=arg0.getParameter("Email");
		String country=arg0.getParameter("country");

		Employee employee = new Employee();
		employee.setEmpid(empid);
		employee.setEmpname(empname);
		employee.setDate(date);
		employee.setAddress(address);
		employee.setGender(gender);
		employee.setEmail(email);
		employee.setCountry(country);

		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.insert(employee);
	}
	}
