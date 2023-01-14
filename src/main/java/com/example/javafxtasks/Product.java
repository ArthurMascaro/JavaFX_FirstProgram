package com.example.javafxtasks;

import java.time.LocalDate;

public class Product {
    String Description;
    LocalDate date;
    Double value;
    Category category;

    public enum Category {
        CLOTH("Roupa"),
        COSMETIC("Cosmético"),
        FOOD("Comida");

        private String label;

        Category(String label) {
            this.label = label;
        }

        public String toString() {
            return label;
        }
    }

    public Product(String description, LocalDate date, Double value, Category category) {
        Description = description;
        this.date = date;
        this.value = value;
        this.category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Description='" + Description + '\'' +
                ", date=" + date +
                ", value=" + value +
                ", category=" + category +
                '}';
    }
}
