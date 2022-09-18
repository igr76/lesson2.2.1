public class Car implements Update {

    public Car(String modelName,int wheelsCount) {
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

    @Override
    public void update() {
        updateTyre();
        checkEngine();
    }
}
