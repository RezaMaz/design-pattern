package creational.builder;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuilderTests {
    @Test
    public void builder() {
        Computer computer = new Computer.ComputerBuilder("1000", "4").setBluetoothEnabled(true).setGraphicsCardEnabled(false).build();
        Assert.assertFalse(computer.isGraphicsCardEnabled());
    }
}
