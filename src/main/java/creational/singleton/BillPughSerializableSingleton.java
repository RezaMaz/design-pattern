package creational.singleton;

import java.io.Serializable;

/*
When the singleton class is loaded, inner class is not loaded
and hence does not create object when loading the class.
Inner class is created only when getInstance() method is called.
So it may seem like eager initialization but it is lazy initialization.
This is the most widely used approach as it does not use synchronization.
*/
public class BillPughSerializableSingleton implements Serializable {
    private BillPughSerializableSingleton() {
    }

    public static BillPughSerializableSingleton getInstance() {
        return InnerBillPughSingleton.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    private static class InnerBillPughSingleton {
        private static final BillPughSerializableSingleton instance = new BillPughSerializableSingleton();
    }
}
