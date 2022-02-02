package com.naveen.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.naveen.beans.Employee;
import com.naveen.connection.GetConnection;

public class EmployeeDAO  implements IEmployeeDAO{

	PreparedStatement ps = null; 
	 
	public EmployeeDAO() {

	}
	
	@Override
	public boolean insertEmployee(Employee employee) {
		String sql ="insert into employee values(?,?,?,?)";
		try {
			ps = GetConnection.getMysql().prepareStatement(sql); 
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getEmpName());
			ps.setDouble(3, employee.getEmpSal());
			ps.setString(4, employee.getEmpEmail()); 
			
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false; 
	}

	@Override
	public Employee getEmployee(int empId) {
		String sql ="select empname, empsal, empemail from employee where empid =?";
		try {
			ps = GetConnection.getMysql().prepareStatement(sql); 
			ps.setInt(1, empId);
			ResultSet resultSet = ps.executeQuery(); 
			if(resultSet.next()) {
				Employee employee = new Employee(); 
				employee.setEmpId(empId);
				employee.setEmpName(resultSet.getString(1));
				employee.setEmpSal(resultSet.getDouble(2));
				employee.setEmpEmail(resultSet.getString(3));
				return employee; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null; 
	}

	@Override
	public boolean updateEmployee(int empId, double empSal) {
		String sql ="update employee set empsal = ? where empid = ?"; 
		try {
			ps = GetConnection.getMysql().prepareStatement(sql); 
			ps.setDouble(1, empSal); 
			ps.setInt(2, empId);
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void deleteEmployee(int empId) {
		String sql ="delete from employee where empid = ?"; 
		try {
			ps = GetConnection.getMysql().prepareStatement(sql);
			ps.setInt(1, empId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public List<Employee> getEmployees() {
		String sql ="select empid, empname, empsal, empemail from employee";
		List<Employee> employees = null;
		try {
			ps = GetConnection.getMysql().prepareStatement(sql); 
			ResultSet resultSet = ps.executeQuery();
			employees = new ArrayList<Employee>(); 
			while(resultSet.next()) {
				Employee employee = new Employee(); 
				employee.setEmpId(resultSet.getInt(1));
				employee.setEmpName(resultSet.getString(2));
				employee.setEmpSal(resultSet.getDouble(3));
				employee.setEmpEmail(resultSet.getString(4));
				employees.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees; 
	}

}








