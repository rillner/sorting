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
        Comparator<Integer> usedComparator = (i1, i2) -> i1.compareTo(i2);
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        List<Integer> output = Sorting.insertionSort(usedComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    public void insertionSortFewUniqueReverseSuccess()
    {
        Comparator<Integer> usedComparator = (i1, i2) -> i1.compareTo(i2);
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(1), new Integer(1), new Integer(0), new Integer(-2), new Integer(-2), new Integer(-3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        List<Integer> output = Sorting.insertionSort(usedComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    public void insertionSortSortedSuccess()
    {
        Comparator<Integer> usedComparator = (i1, i2) -> i1.compareTo(i2);
        List<Integer> input = Arrays.asList(new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        List<Integer> output = Sorting.insertionSort(usedComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    public void insertionSortSortedFewUniqueSuccess()
    {
        Comparator<Integer> usedComparator = (i1, i2) -> i1.compareTo(i2);
        List<Integer> input = Arrays.asList(new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        List<Integer> output = Sorting.insertionSort(usedComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    public void insertionSortComparatorNull()
    {
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3));

        exception.expect(NullPointerException.class);
        exception.expectMessage(Matchers.equalTo("comparator must not be null."));

        Sorting.insertionSort(null, input);
    }


    @Test
    public void insertionSortInputEmpty()
    {
        Comparator<Integer> usedComparator = (i1, i2) -> i1.compareTo(i2);
        List<Integer> input = Collections.emptyList();

        List<Integer> output = Sorting.insertionSort(usedComparator, input);

        assertTrue(output.isEmpty());
    }


    @Test
    public void insertionSortOneInputElement()
    {
        Comparator<Integer> usedComparator = (i1, i2) -> i1.compareTo(i2);
        List<Integer> input = Arrays.asList(new Integer(3));
        Integer[] expected = new Integer[]{new Integer(3)};

        List<Integer> output = Sorting.insertionSort(usedComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    public void insertionSortWithIllegalNullElement()
    {
        Comparator<Integer> usedComparator = (i1, i2) -> i1.compareTo(i2);
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), null, new Integer(-1), new Integer(-2), new Integer(-3));

        exception.expect(NullPointerException.class);

        Sorting.insertionSort(usedComparator, input);
    }


    @Test
    public void insertionSortWithLegalNullElements()
    {
        Comparator<Integer> usedComparator = integerComparatorPermittingNull();
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), null, new Integer(-1), new Integer(-2), null);
        Integer[] expected = new Integer[]{null, null, new Integer(-2), new Integer(-1), new Integer(1), new Integer(2), new Integer(3)};

        List<Integer> output = Sorting.insertionSort(usedComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));

        Sorting.insertionSort(usedComparator, input);
    }


    private Comparator<Integer> integerComparatorPermittingNull()
    {
        return (i1, i2) ->
        {
            int result;

            if (i1 != null && i2 != null)
            {
                result = i1.compareTo(i2);
            }
            else if (i1 == null && i2 == null)
            {
                result = 0;
            }
            else if (i1 == null) // && i2 != null
            {
                result = -1;
            }
            else // i2 != null && i2 == null
            {
                result = 1;
            }

            return result;
        };
    }
}
