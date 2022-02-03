package com.naveen.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.naveen.beans.Employee;

import static com.naveen.util.HibernateUtil.getSessionFactory;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class App {
	public static void main(String[] args) {
		Session session = getSessionFactory().openSession(); 
		Transaction transaction = session.beginTransaction(); 
		
		
		Employee employee = new Employee(); 
		employee.setEmpId(103);
		employee.setEmpName("Sumedh");
		employee.setEmpSal(4000);
		
//		saveEmployee(session, employee);
//		getEmployee(session);
//		updateEmployee(session); 
//		deleteEmployee(session);
//		getAllEmployees(session);
//		getSingleRecordQuery(session);
//		getAllEmployeesHQL(session);
		
		getEmployeesWithCondition(session);
	}

	private static void getEmployeesWithCondition(Session session) {
		String hql="from Employee where empSal between ?0 and ?1 order by empName desc"; 
		Query<Employee> query = session.createQuery(hql, Employee.class);
		query.setParameter(0, 2000.0); 
		query.setParameter(1, 3000.0); 
		query.getResultList().forEach(System.out :: println);
	}

	private static void getAllEmployeesHQL(Session session) {
		// working with hql 
		// SQL --> select * from from employee; 
		// HQL --> select e1 from com.naveen.beans.Employee e1
		// or write --> from Employee 
		
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList(); 
		list.forEach(System.out :: println);
	}

	// use criteria only 
	
	// select empname from employee
	private static void getSingleRecordQuerySingleColumn(Session session) {}
	
	// select empname, empsal from employee where empsal > 3000
	private static void getSingleRecordQueryMultipleColumnWithCondition(Session session) {}
	
	private static void getSingleRecordQuery(Session session) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		// select * from employee where empid = 102
		CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root).where(criteriaBuilder.equal(root.get("empId"), 102)); 
		
		Query<Employee> employeeQuery = session.createQuery(query);
		Employee result = employeeQuery.getSingleResult();
		System.out.println(result);
	}

	private static void getAllEmployees(Session session) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root);
		Query<Employee> employeeQuery = session.createQuery(query);
		employeeQuery.getResultList().forEach(System.out :: println);
	}

	private static void deleteEmployee(Session session) {
		Employee retEmp = session.get(Employee.class, 101); 
		session.delete(retEmp);
		session.getTransaction().commit();
	}

	private static void updateEmployee(Session session) {
		Employee retEmp = session.get(Employee.class, 101); 
		retEmp.setEmpName("Nischal Sharma");
		session.merge(retEmp); 
		session.getTransaction().commit();
	}

	private static void getEmployee(Session session) {
		// get will give you null when the object is not found 
		Employee retEmp = session.get(Employee.class, 255); 
		System.out.println(retEmp);
		
		// load will give you error when the object is not found 
		Employee retEmp1 = session.load(Employee.class, 255);
		System.out.println(retEmp1);
	}

	private static void saveEmployee(Session session, Employee employee) {
		// you are only giving emp object to hibernate
		session.save(employee); 
		// the save to db will happen here 
		session.getTransaction().commit();
		System.out.println("Record Saved..");
	}
}
