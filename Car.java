import java.lang.module.ModuleDescriptor;

public class Car {
    private final String brand;
    private final String model;
    private final String engine;
    private final String color;
    private final int seats;
    private final boolean hasSunroof;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.engine = builder.engine;
        this.color = builder.color;
        this.seats = builder.seats;
        this.hasSunroof = builder.hasSunroof;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getEngine() {
        return engine;
    }
    public String getColor() {
        return color;
    }
    public int getSeats() {
        return seats;
    }
    public boolean hasSunroof() {
        return hasSunroof;
    }

    @Override
    public String toString() {
        return String.format("%s %s [%s engine, %s, %d seats, Sunroof: %b]",
                brand, model, color, engine, seats, hasSunroof);
    }

    public static class Builder {
        private String brand;
        private String model;
        private String engine;
        private String color = "White";
        private int seats = 4;
        private boolean hasSunroof = false;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder setModel(String model) {
            this.model = model;
            return this;
        }
        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }
        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }
        public Builder setHasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Car build() {
            validate();
            return new Car(this);
        }
        private void validate() {
            if (brand == null) throw new IllegalArgumentException("brand is required");
            if (model == null) throw new IllegalArgumentException("model is required");
            if (engine == null) throw new IllegalArgumentException("engine is required");
        }
    }
}
