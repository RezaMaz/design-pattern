package creational.factory;

public class CalcService {
    private AddService addService;

    public CalcService(AddService addService) {
        this.addService = addService;
    }

    public int calc(int i, int j) {
        return addService.add(i, j);
    }
}
