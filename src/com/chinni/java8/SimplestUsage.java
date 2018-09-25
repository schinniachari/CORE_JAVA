 package com.chinni.java8;


/**
 * The sample illustrates the simplest use case of the <b>default methods</b>.
 */
public class SimplestUsage {

    /**
     * The Animal interface provides the default implementation
     * of the {@link #eat} method.
     */
    public interface Animal {

        /**
         * Return string representation of the eat action for Animal
         *
         * @return string representation of the eat action for Animal
         */
        default String eat() {
            return this.getClass().getSimpleName()
                    + " eats like an ordinary animal";
        }
    }

    /**
     * The Dog class doesn't have its own implementation of the {@link #eat}
     * method and uses the default implementation.
     */
    public static class Dog implements Animal {
    }

    /**
     * The Mosquito class implements {@link #eat} method, its own implementation
     * overrides the default implementation.
     *
     */
    public static class Mosquito implements Animal {

        /**
         * Return string representation of the eat action for Mosquito
         *
         * @return string representation of the eat action for Mosquito
         */
        @Override
        public String eat() {
            return "Mosquito consumes blood";
        }
    }

    /**
     * Illustrate behavior of the classes: {@link Dog} and {@link Mosquito}
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // "Dog eats like an ordinary animal" is output
        System.out.println(new Dog().eat());

        // "Mosquito consumes blood" is output
        System.out.println(new Mosquito().eat());
    }
}
