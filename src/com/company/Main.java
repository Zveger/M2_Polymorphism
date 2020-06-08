/* Module 2. Task 3
 * Classname: Main
 *
 * Version 1
 *
 * Zviertsev Herman, NTU KhPI
 *
 *  Create and implement  two interfaces for your class.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
	Cube cube1 = new Cube(5);
        System.out.println(cube1);
        System.out.println(cube1.hashCode());
        Cube cube2 = new Cube(2+3);
        boolean equals = cube1.equals(cube2);
        System.out.println(equals);

    }
}
