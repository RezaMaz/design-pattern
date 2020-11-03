package creational.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
        // protect against instantiation via reflection
        if (instance != null) {
            throw new IllegalStateException("Singleton already initialized");
        }
    }

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    public static synchronized LazyInitializationSingleton threadSafeGetInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    public static LazyInitializationSingleton doubleLockMethodThreadSafeInstance() {
        if (instance == null) {
            synchronized (LazyInitializationSingleton.class) {
                if (instance == null) {
                    instance = new LazyInitializationSingleton();
                }
            }
        }
        return instance;
    }
}
