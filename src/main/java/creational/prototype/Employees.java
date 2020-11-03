package creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype patterns is required, when object creation is time consuming
 * and costly operation, so we create object with existing object itself.
 * default clone implementation is shallow copy
 */
public class Employees implements Cloneable {
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>(this.getEmpList());
        return new Employees(temp);
    }
}
