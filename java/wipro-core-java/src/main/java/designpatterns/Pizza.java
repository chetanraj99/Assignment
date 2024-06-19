package designpatterns;

public class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    public Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    // Getters
    public String getSize() {
        return size;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasPepperoni() {
        return pepperoni;
    }

    public boolean hasMushrooms() {
        return mushrooms;
    }

    static class Builder {
        String size;
        boolean cheese = false;
        boolean pepperoni = false;
        boolean mushrooms = false;

        // Constructor with required parameters
        public Builder(String size) {
            this.size = size;
        }

        // Methods to set optional parameters and return the builder instance
        public Builder addCheese() {
            this.cheese = true;
            return this;
        }

        public Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        // Method to build the Pizza object
        public Pizza build() {
            return new Pizza(this);
        }
    }

}
