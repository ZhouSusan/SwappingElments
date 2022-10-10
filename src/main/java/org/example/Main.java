package org.example;

public class Main {
    public static void main(String[] args) {
        // Given the planets array, sort them in order by swapping the elements using the different indexes manually.
        // Print out the resulting array using a for each loop or a for loop.

        String[] planets = {"Neptune", "Mercury", "Earth", "Jupiter", "Venus", "Pluto", "Uranus", "Saturn", "Mars"};

        String temp = planets[0];
        planets[0] = planets[1];
        planets[1] = planets[4];
        planets[4] = planets[3];
        planets[3] = planets[8];
        planets[8] = planets[5];
        planets[5] = planets[7];
        planets[7] = temp;

        for (int i = 0; i < planets.length; i += 1) {
            System.out.println(planets[i]);
        }

    }
}
