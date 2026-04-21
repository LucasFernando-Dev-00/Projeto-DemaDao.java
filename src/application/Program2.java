package application;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[]args) {
       Scanner sc = new Scanner(System.in);

       List<Department> list = new ArrayList<>();

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1: findById ====");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n ==== TEST 2: findAll ====");
        list = departmentDao.findAll();

        for (Department depart: list) {
            System.out.println(depart);
        }
        
        System.out.println("\n ==== TEST 3: seller insert ====");
        Department newdepartment = new Department(null, "Marketing");
        departmentDao.insert(newdepartment);
        System.out.println("Inserted! New id = " + newdepartment.getId());

        System.out.println("\n ==== TEST 4: seller update ====");
        dep = departmentDao.findById(3);
        dep.setName("Developer");
        departmentDao.update(dep);
        System.out.println("Update completed!");

        System.out.println("\n ==== TEST 5: department delete ====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed! ");



    }
}
