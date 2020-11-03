package creational.prototype;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrototypeTests {
    @Test
    public void prototype() {
        Employees employees = new Employees();
        employees.loadData();
        Assert.assertNotEquals(employees.clone(), employees);
    }
}
