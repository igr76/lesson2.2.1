public class Truck implements Update{
    public Truck(String modelName,int wheelsCount) {
        super(modelName,wheelsCount);
    }

    public void updateTyre() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void update() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
