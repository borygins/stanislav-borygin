package com.ifmo.lesson17.Pizza;

public class Pizza {
    private final String dough;
    private final String cheese;
    private final int catchup;
    private final int tomato;
    private final int peperoni;

    public static class Builder{
        private final String dough;
        private final String cheese;
        private  int catchup;
        private  int tomato;
        private  int peperoni;

        public Builder(String dough, String cheese) {
            this.dough = dough;
            this.cheese = cheese;
        }

        public Builder setCatchup(int catchup) {
            this.catchup = catchup;
            return this;
        }

        public Builder setTomato(int tomato) {
            this.tomato = tomato;
            return this;
        }

        public Builder setPeperoni(int peperoni) {
            this.peperoni = peperoni;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        dough= builder.dough;
        cheese =builder.cheese;
        catchup = builder.catchup;
        tomato = builder.tomato;
        peperoni = builder.peperoni;
    }
}
