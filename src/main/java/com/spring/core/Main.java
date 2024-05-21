package com.spring.core;

public class Main {
    public static void main(String[] args) {
        Backend backend = new Backend();
        Display display = new Display(backend);
        display.showMenu();
    }
}
