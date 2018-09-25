package com.chinni.java8;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * The code sample illustrates changes in the reflection API linked
 * <b>default methods</b>. Since Java SE 8, a new method is added into the class
 * <b><code>java.lang.reflect.Method</code></b>, with which you can reflectively
 * determine whether or not a default method provided by an interface
 * (<b><code>Method.isDefault()</code></b>).
 */
public class Reflection {

    /**
     * Base interface to illustrate the new reflection API.
     *
     * @see Dog
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

        /**
         * Return string representation of the sleep action for Animal
         *
         * @return string representation of the sleep action for Animal
         */
        default String sleep() {
            return this.getClass().getSimpleName()
                    + " sleeps like an ordinary animal";
        }

        /**
         * Return string representation of the go action for Animal
         *
         * @return string representation of the go action for Animal
         */
        String go();
    }

    /**
     * Dog class to illustrate the new reflection API. You can see that:
     * <ul>
     * <li> the {@link #go} and {@link #sleep} methods are not default.
     * {@link #go} is not the default implementation and the {@link #sleep}
     * method implementation wins as subtype (according with {@link Inheritance}
     * rule. 2) </li>
     * <li> the {@link #eat} is a simple default method that is not overridden
     * in this class.
     * </li>
     * </ul>
     */
    public static class Dog implements Animal {

        /**
         * Return string representation of the go action for Dog
         *
         * @return string representation of the go action for Dog
         */
        @Override
        public String go() {
            return "Dog walks on four legs";
        }

        /**
         * Return string representation of the sleep action for Dog
         *
         * @return string representation of the sleep action for Dog
         */
        @Override
        public String sleep() {
            return "Dog sleeps";
        }
    }

    /**
     * Illustrate the usage of the method java.lang.reflect.Method.isDefault()
     *
     * @param args command-line arguments
     * @throws NoSuchMethodException internal demo error
     */
    public static void main(final String[] args) throws NoSuchMethodException {
        Dog dog = new Dog();
        Stream.of(Dog.class.getMethod("eat"), Dog.class.getMethod("go"), Dog.class.getMethod("sleep"))
                .forEach((m) -> {
                    System.out.println("Method name:   " + m.getName());
                    System.out.println("    isDefault: " + m.isDefault());
                    System.out.print("    invoke:    ");
                    try {
                        m.invoke(dog);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    }
                    System.out.println();
                });
    }
}
