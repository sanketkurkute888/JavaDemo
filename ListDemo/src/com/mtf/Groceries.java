package com.mtf;

public record Groceries(String name, String type, int quantity) {
    Groceries(String name){
        this(name, "Dairy", 1);
    }
}
