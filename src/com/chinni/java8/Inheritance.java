 package com.chinni.java8;
/**
 * The sample illustrates rules to resolve conflicts between inheritance
 * candidates with <b>default methods</b>. There are two simple rules:
 * <ul>
 * <li>Class wins. If the superclass has a concrete or abstract declaration of
 * this method, then it is preferred over all defaults.</li>
 * <li>Subtype wins. If an interface extends another interface, and both provide
 * a default, then the more specific interface wins. </li>
 * </ul>
 */
public class Inheritance {

    /**
     * The behavior of an creature that can swim
     */
    public interface Swimable {

        /**
         * Return string representation of the swim action for a creature that
         * can swim
         *
         * @return string representation of the swim action for a creature
         * that can swim
         */
        default String swim() {
            return "I can swim.";
        }
    }

    /**
     * The abstract class that overrides {@link #swim} method
     */
    public abstract static class Fish implements Swimable {

        /**
         * Return string representation of the swim action for a fish
         *
         * @return string representation of the swim action for a fish
         */
        @Override
        public String swim() {
            return this.getClass().getSimpleName() + " swims under water";
        }
    }

    /**
     * This class is used for the illustration rule of 1. See the source code
     * of the {@link #main} method.
     * <pre>
     *      System.out.println(new Tuna().swim()); //"Tuna swims under water" output is suspected here
     * </pre>
     */
    public static class Tuna extends Fish implements Swimable {
    }

    /**
     * The behavior of an creature that can dive: the interface that overrides
     * {@link #swim} method (subtype of {@link Swimable})
     */
    public interface Diveable extends Swimable {

        /**
         * Return string representation of the swim action for a creature that
         * can dive
         *
         * @return string representation of the swim action for a creature
         * that can dive
         */
        @Override
        default String swim() {
            return "I can swim on the surface of the water.";
        }

        /**
         * Return string representation of the dive action for a creature that
         * can dive
         *
         * @return string representation of the dive action for a creature
         * that can dive
         */
        default String dive() {
            return "I can dive.";
        }
    }

    /**
     * This class is used for the illustration of rule 2. See the source code
     * of the {@link #main} method
     * <pre>
     *      //"I can swim on the surface of the water." output is suspected here
     *      System.out.println(new Duck().swim());
     * </pre>
     */
    public static class Duck implements Swimable, Diveable {
    }

    /**
     * Illustrate behavior of the classes: {@link Tuna} and {@link Duck}
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        // Illustrates rule 1. The Fish.swim() implementation wins
        //"Tuna swims under water" is output
        System.out.println(new Tuna().swim()); 
        // Illustrates rule 2. The Diveable.swim() implementation wins
        //"I can swim on the surface of the water." is output
        System.out.println(new Duck().swim());
    }
}
