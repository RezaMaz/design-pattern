package creational.singleton;

/**
 * An Enum value is initialized only once at the time of class loading.
 * It is singleton by design and is also thread-safe.
 */
public enum EnumSingleton {
    WEEKDAY("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");

    private String[] days;

    EnumSingleton(String... days) {
        this.days = days;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }
}
