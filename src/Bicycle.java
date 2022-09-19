public class Bicycle extends Update{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void update() {
        updateTyre();
    }
}
