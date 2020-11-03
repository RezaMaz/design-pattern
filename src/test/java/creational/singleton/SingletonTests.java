package creational.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

// Test Suite = Test Set
public class SingletonTests {
    @Test(groups = "main")
    public void singleton_first_case() {
        BillPughSerializableSingleton singleton1 = BillPughSerializableSingleton.getInstance();
        BillPughSerializableSingleton singleton2 = BillPughSerializableSingleton.getInstance();
        Assert.assertEquals(singleton1, singleton2);
    }

    //    ignore test case
    @Test(enabled = false)
    public void singleton_second_case() {
        EagerInitializationSingleton singleton3 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton singleton4 = EagerInitializationSingleton.getInstance();
        Assert.assertEquals(singleton3, singleton4);
    }

    @Test
    public void singleton_third_case() {
        EnumSingleton[] singleton5 = EnumSingleton.values();
        EnumSingleton[] singleton6 = EnumSingleton.values();
        Assert.assertEquals(singleton5, singleton6);
    }

    @Test
    public void singleton_forth_case() {
        LazyInitializationSingleton singleton7 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton singleton8 = LazyInitializationSingleton.getInstance();
        Assert.assertEquals(singleton7, singleton8);
    }

    @Test
    public void singleton_fifth_case() {
        StaticBlockSingleton singleton9 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton10 = StaticBlockSingleton.getInstance();
        Assert.assertEquals(singleton9, singleton10);
    }
}
