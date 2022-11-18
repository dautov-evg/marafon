package Day11;

public class Picker implements Worker {
    private int selary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSelary() {
        return selary;
    }

    @Override
    public void doWork() {
        selary+=80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder()>1500) {
            selary*=3;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "ЗП=" + selary +
                '}';
    }
}
