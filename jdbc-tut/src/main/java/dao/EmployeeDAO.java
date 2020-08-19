package dao;


import entity.Employee;

import java.util.List;

public interface EmployeeDAO {

        // create
        void add (Employee employee);

        //read
        List<Employee> getAll();

        Employee getById(long id);

        //update
        void update (Employee employee);

        //delete

        void delete (Employee employee);

}
