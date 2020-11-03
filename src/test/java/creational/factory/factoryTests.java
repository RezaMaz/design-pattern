package creational.factory;

import org.mockito.Mockito;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class factoryTests {
    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][]{{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
    }

    @DataProvider(name = "test2")
    public static Object[][] beanDataProvider() {
        return new Object[][]{{new Bean("hi I am the bean", 111)}};
    }

    @Test(dataProvider = "dp")
    public void test_mock_object(int i, int j) {
        System.out.println("**--- Test testCalc executed ---**");

        AddService addService;
        CalcService calcService;

        addService = Mockito.mock(AddService.class);
        calcService = new CalcService(addService);

        //method stubbing
        int expected = i + j;
        Mockito.when(addService.add(i, j)).thenReturn(expected);

        int actual = calcService.calc(i, j);

        assertEquals(expected, actual);
    }

    @DataProvider
    public Object[][] dp() {
        return new Object[][]{new Object[]{1, 1}, new Object[]{2, 2},};
    }

    @Test(groups = "main")
    @Parameters({"type", "ram", "hdd", "cpu"})
    public void factory(String type, String ram, String hdd, String cpu) {
        Computer computer = ComputerFactory.getComputer(type, ram, hdd, cpu);
        assertEquals(computer.getHDD(), "1000");
    }

    @Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = "Pass Message test")
    public void exceptionTestOne() throws Exception {
        throw new IOException("Pass Message test");
    }

    @Test(dataProvider = "test1")
    public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
        System.out.println(inputNumber + " " + expectedResult);
        assertEquals(expectedResult, ComputerFactory.validate(inputNumber));
    }

    @Test(dataProvider = "test2")
    public void testMethod(Bean myBean) {
        System.out.println(myBean.getVal() + " " + myBean.getI());
    }
}
