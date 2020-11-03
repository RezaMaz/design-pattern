package creational.factory;

public abstract class Computer {
    protected abstract String getRAM();

    protected abstract String getHDD();

    protected abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
