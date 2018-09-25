 package com.chinni.java8;


/**
 * This sample diamond interface inheritance with <b>default methods</b>.
 * If there's not already a unique method implementation to inherit,
 * you must provide it. The inheritance diagram is similar to the following:
 * <pre>
 *                   Animal
 *                    /   \
 *                 Horse   Bird
 *                    \   /
 *                   Pegasus
 * </pre>
 *
 * Both {@link Horse} and {@link Bird} interfaces implements the <code>go</code>
 * method. The {@link Pegasus} class have to overrides the
 * <code>go</code> method.
 *
 * The new syntax of super-call is used here:
 * <pre>
 *     &lt;interface_name&gt;.super.&lt;method&gt;(...);
 *     For example:  Horse.super.go();
 * </pre> So, Pegasus moves like a horse.
 */
public class DiamondInheritance {

    /**
     * Base interface to illustrate the diamond inheritance.
     *
     * @see DiamondInheritance
     */
    public interface Animal {

        /**
         * Return string representation of the "go" action for concrete animal
         *
         * @return string representation of the "go" action for concrete animal
         */
        String go();
    }

    /**
     * Interface to illustrate the diamond inheritance.
     *
     * @see DiamondInheritance
     */
    public interface Horse extends Animal {

        /**
         * Return string representation of the "go" action for horse
         *
         * @return string representation of the "go" action for horse
         */
        @Override
        default String go() {
            return this.getClass().getSimpleName() + " walks on four legs";
        }
    }

    /**
     * Interface to illustrate the diamond inheritance.
     *
     * @see DiamondInheritance
     */
    public interface Bird extends Animal {

        /**
         * Return string representation of the "go" action for bird
         *
         * @return string representation of the "go" action for bird
         */
        @Override
        default String go() {
            return this.getClass().getSimpleName() + " walks on two legs";
        }

        /**
         * Return string representation of the "fly" action for bird
         *
         * @return string representation of the "fly" action for bird
         */
        default String fly() {
            return "I can fly";
        }
    }

    /**
     * Class to illustrate the diamond inheritance. Pegasus must mix horse and
     * bird behavior.
     *
     * @see DiamondInheritance
     */
    public static class Pegasus implements Horse, Bird {

		@Override
		public String go() { 
			return Bird.super.go();
		}

 

        /**
         * Return string representation of the "go" action for the fictitious
         * creature Pegasus
         *
         * @return string representation of the "go" action for the fictitious
         * creature Pegasus
         */
    }

    /**
     * Illustrate the behavior of the {@link Pegasus} class
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        System.out.println(new Pegasus().go());
    }
}
