public class Bicycle implements Update{
    public Bicycle(String modelName,int wheelsCount) {
        super(modelName,wheelsCount);
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
