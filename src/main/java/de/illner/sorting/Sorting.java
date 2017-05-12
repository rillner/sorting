package de.illner.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public final class Sorting
{

    /**
     * Although it is one of the elementary sorting algorithms with <code>O(n<sup>2</sup>)</code> worst-case time, insertion sort is the algorithm of choice either when the data is nearly sorted (because it is adaptive) or when the problem size is small (because it has low overhead). For these reasons, and because it is also stable, insertion sort is often used as the recursive base case (when the problem size is small) for higher overhead divide-and-conquer sorting algorithms, such as merge sort or quick sort.
     * @param input
     * @param comparator
     * @return
     */
    public static <T, L extends List<T>> List<T> insertionSort(L input, Comparator<? super L> comparator)
    {
        Objects.requireNonNull(input, "input must not be null.");
        List<T> result = input.stream().collect(Collectors.toList());
        if (input.size() < 2)
        {
            return result;
        }
        
        for (int k = 2; k <= input.size(); k++)
        {
            for (k = i; k > 1 and a[k] < a[k-1]; k--)
        }
        
        return result;
        
    }
}



