/*
 * SortingTest.java
 *
 * created at 11.05.2017 by Robert Illner
 */
package de.illner.sorting;


import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class SortingTest
{
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void insertionSortReverseSuccess()
    {
        Comparator< ? super Integer> usedComparator = (s1, s2) -> s1.compareTo(s2);
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        List<Integer> output = Sorting.insertionSort(input, usedComparator);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    public void insertionSortFewUniqueReverseSuccess()
    {
        Comparator< ? super Integer> usedComparator = (s1, s2) -> s1.compareTo(s2);
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(1), new Integer(1), new Integer(0), new Integer(-2), new Integer(-2), new Integer(-3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        List<Integer> output = Sorting.insertionSort(input, usedComparator);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    public void insertionSortSortedSuccess()
    {
        Comparator< ? super Integer> usedComparator = (s1, s2) -> s1.compareTo(s2);
        List<Integer> input = Arrays.asList(new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        List<Integer> output = Sorting.insertionSort(input, usedComparator);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    public void insertionSortSortedFewUniqueSuccess()
    {
        Comparator< ? super Integer> usedComparator = (s1, s2) -> s1.compareTo(s2);
        List<Integer> input = Arrays.asList(new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        List<Integer> output = Sorting.insertionSort(input, usedComparator);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    public void insertionSortInputNull()
    {
        Comparator< ? super Integer> usedComparator = (s1, s2) -> s1.compareTo(s2);

        exception.expect(NullPointerException.class);
        exception.expectMessage(Matchers.equalTo("input must not be null."));

        Sorting.insertionSort(null, usedComparator);
    }


    @Test
    public void insertionSortComparatorNull()
    {
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3));

        exception.expect(NullPointerException.class);
        exception.expectMessage(Matchers.equalTo("comparator must not be null."));

        Sorting.insertionSort(input, null);
    }


    @Test
    public void insertionSortInputEmpty()
    {
        Comparator< ? super Integer> usedComparator = (s1, s2) -> s1.compareTo(s2);
        List<Integer> input = Collections.emptyList();

        List<Integer> output = Sorting.insertionSort(input, usedComparator);

        assertTrue(output.isEmpty());
    }


    @Test
    public void insertionSortOneInputElement()
    {
        Comparator< ? super Integer> usedComparator = (s1, s2) -> s1.compareTo(s2);
        List<Integer> input = Arrays.asList(new Integer(3));
        Integer[] expected = new Integer[]{new Integer(3)};

        List<Integer> output = Sorting.insertionSort(input, usedComparator);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }
}
