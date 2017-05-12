package de.illner.sorting;


import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public final class Sorting
{

    /**
     * Although it is one of the elementary sorting algorithms with <code>O(n<sup>2</sup>)</code> worst-case time, insertion sort is the
     * algorithm of choice either when the data is nearly sorted (because it is adaptive) or when the problem size is small (because it has
     * low overhead). For these reasons, and because it is also stable, insertion sort is often used as the recursive base case (when the
     * problem size is small) for higher overhead divide-and-conquer sorting algorithms, such as merge sort or quick sort.
     *
     * @param input the input {@link List} to be sorted
     * @param comparator the {@link Comparator} for comparing the elements of the <code>input</code> List
     * @return the sorted result {@link List} by using insertion sort
     */
    public static <T> List<T> insertionSort(List<T> input, Comparator< ? super T> comparator)
    {
        Objects.requireNonNull(input, "input must not be null.");
        Objects.requireNonNull(comparator, "comparator must not be null.");

        List<T> result = input.stream().collect(Collectors.toList());

        for (int i = 1; i < result.size(); i++)
        {
            for (int k = i; k > 0 && comparator.compare(result.get(k), result.get(k - 1)) < 0; k--)
            {
                T tmp = result.get(k);
                result.set(k, result.get(k - 1));
                result.set(k - 1, tmp);
            }
        }

        return result;
    }
}
