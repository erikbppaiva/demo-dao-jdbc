package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("\n==== Test 1: findById  ====");
		Department dep = DepartmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n==== Test 2: findAll ====");
		List<Department> list = DepartmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
	}
}
//
//System.out.println("=== TEST 1: findById =======");
//Department dep = departmentDao.findById(1);
//System.out.println(dep);
//
//System.out.println("\n=== TEST 2: findAll =======");
//List<Department> list = departmentDao.findAll();
//for (Department d : list) {
//	System.out.println(d);
//}
