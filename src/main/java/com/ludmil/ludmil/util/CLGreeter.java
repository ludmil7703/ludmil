package com.ludmil.ludmil.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLGreeter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }
    record Point(int x, int y) {
        public Point {
            System.out.println("Point constructor called");
        }
    }
}
