package com.chinni.java8;


import java.io.IOException;
import java.lang.reflect.Field;

/**
 * The example illustrates how to use the default method for mixin.
 * @see BuildType
 * @see Debuggable
 */
public class MixIn {

    /**
     * Implement this interface for a class that must be in debug print
     */
    public interface Debuggable {

        /**
         * Print the class name and all fields to a string. Uses reflection to
         * obtain and access fields of this object.
         *
         * @return the string formatted like the following: <pre>
         * State of the: &lt;Class Name&gt;
         * &lt;member name&gt; : &lt;value&gt;
         * ...
         * </pre>
         */
        default String toDebugString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State of the: ").append(
                    this.getClass().getSimpleName()).append("\n");
            for (Class cls = this.getClass();
                    cls != null;
                    cls = cls.getSuperclass()) {
                for (Field f : cls.getDeclaredFields()) {
                    try {
                        f.setAccessible(true);
                        sb.append(f.getName()).append(" : ").
                                append(f.get(this)).append("\n");
                    } catch (IllegalAccessException e) {
                    }
                }
            }
            return sb.toString();
        }
    }

    /**
     * Sample exception class to demonstrate mixin. This enum inherits the
     * behavior of the {@link Debuggable}
     */
    public static enum BuildType implements Debuggable {

        BUILD(0, "-build"),
        PLAN(0, "-plan"),
        EXCLUDE(1, "-exclude"),
        TOTAL(2, "-total");

        private final int compareOrder;
        private final String pathSuffix;

        private BuildType(int compareOrder, String pathSuffix) {
            this.compareOrder = compareOrder;
            this.pathSuffix = pathSuffix;
        }

        public int getCompareOrder() {
            return compareOrder;
        }

        public String getPathSuffix() {
            return pathSuffix;
        }
    }

    /**
     * Illustrate the behavior of the MixClass
     *
     * @param args command-line arguments
     * @throws java.io.IOException internal demo error
     */
    public static void main(final String[] args) throws IOException {
        System.out.println(BuildType.BUILD.toDebugString());
    }
}
