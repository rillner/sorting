/*
 * ParamValidator.java
 *
 * created at 16.05.2017 by Robert Illner
 */
package de.illner.sorting;


import java.util.Comparator;
import java.util.List;
import java.util.Objects;


final class ParamValidator
{

    static <T> void checkParameters(Comparator< ? super T> comparator, List<T> input)
    {
        Objects.requireNonNull(comparator, "comparator must not be null.");
        checkParameter(input);
    }


    static <T> void checkParameters(Comparator< ? super T> comparator, T[] input)
    {
        Objects.requireNonNull(comparator, "comparator must not be null.");
        checkParameter(input);
    }


    static <T> void checkParameter(List<T> input)
    {
        Objects.requireNonNull(input, "input must not be null.");
    }


    static <T> void checkParameter(T[] input)
    {
        Objects.requireNonNull(input, "input must not be null.");
    }
}