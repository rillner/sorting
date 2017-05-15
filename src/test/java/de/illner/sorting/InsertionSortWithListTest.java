/*
 * InsertionSortWithListTest.java
 *
 * created at 11.05.2017 by Robert Illner
 */
package de.illner.sorting;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;


public class InsertionSortWithListTest extends AbstractSortingTest
{

    @Test
    @Override
    public void alreadySortedSuccess()
    {
        List<Integer> input = Arrays.asList(new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        List<Integer> output = SortingUtils.insertionSort(integerComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    @Override
    public void reverseSuccess()
    {
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        List<Integer> output = SortingUtils.insertionSort(integerComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    @Override
    public void fewUniqueReverseSuccess()
    {
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(1), new Integer(1), new Integer(0), new Integer(-2), new Integer(-2), new Integer(-3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        List<Integer> output = SortingUtils.insertionSort(integerComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    @Override
    public void alreadySortedFewUniqueSuccess()
    {
        List<Integer> input = Arrays.asList(new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3));
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        List<Integer> output = SortingUtils.insertionSort(integerComparator, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    @Override
    public void inputArgEmptySuccess()
    {
        List<Integer> input = Collections.emptyList();

        List<Integer> output = SortingUtils.insertionSort(integerComparator, input);

        assertTrue(output.isEmpty());
    }


    @Test
    @Override
    public void oneInputElementSuccess()
    {
        List<Integer> input = Arrays.asList(new Integer(3));

        List<Integer> output = SortingUtils.insertionSort(integerComparator, input);

        assertEquals(1, output.size());
        assertEquals(new Integer(3), output.get(0));
    }


    @Test
    @Override
    public void legalNullElementsSuccess()
    {
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), null, new Integer(-1), new Integer(-2), null);
        Integer[] expected = new Integer[]{null, null, new Integer(-2), new Integer(-1), new Integer(1), new Integer(2), new Integer(3)};

        List<Integer> output = SortingUtils.insertionSort(integerComparatorPermittingNull, input);

        assertThat(output, IsIterableContainingInOrder.contains(expected));
    }


    @Test
    @Override
    public void illegalNullElementThrowsException()
    {
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), null, new Integer(-1), new Integer(-2), new Integer(-3));

        exception.expect(NullPointerException.class);

        SortingUtils.insertionSort(integerComparator, input);
    }


    @Test
    @Override
    public void comparatorArgNullThrowsException()
    {
        List<Integer> input = Arrays.asList(new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3));

        exception.expect(NullPointerException.class);
        exception.expectMessage(Matchers.equalTo("comparator must not be null."));

        SortingUtils.insertionSort(null, input);
    }
}
