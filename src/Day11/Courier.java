package Day11;

public class Courier implements Worker{
    private int selary;
    public Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSelary() {
        return selary;
    }

    @Override
    public void doWork() {
        selary+=100;
        warehouse.setBalance(warehouse.getBalance()+1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance()>1000000) {
            selary*=2;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "ЗП=" + selary +
                '}';
    }
}
