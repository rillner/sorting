package de.illner.sorting;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public final class SortingUtils
{

    private SortingUtils()
    {}


    /**
     * Although it is one of the elementary sorting algorithms with <code>O(n<sup>2</sup>)</code> worst-case time, insertion sort is the
     * algorithm of choice either when the data is nearly sorted (because it is adaptive) or when the problem size is small (because it has
     * low overhead). For these reasons, and because it is also stable, insertion sort is often used as the recursive base case (when the
     * problem size is small) for higher overhead divide-and-conquer sorting algorithms, such as merge sort or quick sort.
     *
     * @param comparator the {@link Comparator} for comparing the elements of the <code>input</code> List
     * @param input the input {@link List} to be sorted
     * @return the sorted result {@link List} by using insertion sort
     * @throws NullPointerException if <code>input</code> or <code>comparator</code> argument is null, or if an element of the list is null
     *             and the given comparator does not permit null arguments
     */
    public static <T> List<T> insertionSort(Comparator< ? super T> comparator, List<T> input) throws NullPointerException
    {
        checkParameters(comparator, input);

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


    /**
     * Although it is one of the elementary sorting algorithms with <code>O(n<sup>2</sup>)</code> worst-case time, insertion sort is the
     * algorithm of choice either when the data is nearly sorted (because it is adaptive) or when the problem size is small (because it has
     * low overhead). For these reasons, and because it is also stable, insertion sort is often used as the recursive base case (when the
     * problem size is small) for higher overhead divide-and-conquer sorting algorithms, such as merge sort or quick sort.
     *
     * @param comparator the {@link Comparator} for comparing the elements of the <code>input</code> array
     * @param input the input array to be sorted
     * @return the sorted result array by using insertion sort
     * @throws NullPointerException if <code>input</code> or <code>comparator</code> argument is null, or if an element of the array is null
     *             and the given comparator does not permit null arguments
     */
    @SafeVarargs
    public static <T> T[] insertionSort(Comparator< ? super T> comparator, T... input) throws NullPointerException
    {
        checkParameters(comparator, input);

        T[] result = Arrays.copyOf(input, input.length);

        for (int i = 1; i < result.length; i++)
        {
            for (int k = i; k > 0 && comparator.compare(result[k], result[k - 1]) < 0; k--)
            {
                T tmp = result[k];
                result[k] = result[k - 1];
                result[k - 1] = tmp;
            }
        }

        return result;
    }


    /**
     * One might conclude that selection sort should never be used. It does not adapt to the data in any way, so its runtime is always
     * quadratic. However, selection sort has the property of minimizing the number of swaps. In applications where the cost of swapping
     * items is high, selection sort very well may be the algorithm of choice.
     *
     * @param comparator the {@link Comparator} for comparing the elements of the <code>input</code> List
     * @param input the input {@link List} to be sorted
     * @return the sorted result {@link List} by using selection sort
     * @throws NullPointerException if <code>input</code> or <code>comparator</code> argument is null, or if an element of the list is null
     *             and the given comparator does not permit null arguments
     */
    public static <T> List<T> selectionSort(Comparator< ? super T> comparator, List<T> input) throws NullPointerException
    {
        checkParameters(comparator, input);

        List<T> result = input.stream().collect(Collectors.toList());

        if (result.size() > 1)
        {
            for (int i = 0; i < result.size(); i++)
            {
                int k = i;
                for (int j = i + 1; j < result.size(); j++)
                {
                    if (comparator.compare(result.get(j), result.get(k)) < 0)
                    {
                        k = j;
                    }
                }
                T tmp = result.get(i);
                result.set(i, result.get(k));
                result.set(k, tmp);
            }
        }

        return result;
    }


    /**
     * One might conclude that selection sort should never be used. It does not adapt to the data in any way, so its runtime is always
     * quadratic. However, selection sort has the property of minimizing the number of swaps. In applications where the cost of swapping
     * items is high, selection sort very well may be the algorithm of choice.
     *
     * @param comparator the {@link Comparator} for comparing the elements of the <code>input</code> List
     * @param input the input array to be sorted
     * @return the sorted result array by using selection sort
     * @throws NullPointerException if <code>input</code> or <code>comparator</code> argument is null, or if an element of the array is null
     *             and the given comparator does not permit null arguments
     */
    @SafeVarargs
    public static <T> T[] selectionSort(Comparator< ? super T> comparator, T... input) throws NullPointerException
    {
        checkParameters(comparator, input);

        T[] result = Arrays.copyOf(input, input.length);

        if (result.length > 1)
        {
            for (int i = 0; i < result.length; i++)
            {
                int k = i;
                for (int j = i + 1; j < result.length; j++)
                {
                    if (comparator.compare(result[j], result[k]) < 0)
                    {
                        k = j;
                    }
                }
                T tmp = result[i];
                result[i] = result[k];
                result[k] = tmp;
            }
        }

        return result;
    }


    private static <T> void checkParameters(Comparator< ? super T> comparator, List<T> input)
    {
        Objects.requireNonNull(comparator, "comparator must not be null.");
        Objects.requireNonNull(input, "input must not be null.");
    }


    @SafeVarargs
    private static <T> void checkParameters(Comparator< ? super T> comparator, T... input)
    {
        Objects.requireNonNull(comparator, "comparator must not be null.");
        Objects.requireNonNull(input, "input must not be null.");
    }
}
