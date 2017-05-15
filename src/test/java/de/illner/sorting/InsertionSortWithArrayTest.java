/*
 * InsertionSortWithArrayTest.java
 *
 * created at 15.05.2017 by Robert Illner
 */
package de.illner.sorting;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.hamcrest.collection.IsArrayContainingInOrder;
import org.junit.Test;

public class InsertionSortWithArrayTest extends AbstractSortingTest
{

    @Test
    @Override
    public void alreadySortedSuccess()
    {
        Integer[] input = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        Integer[] output = SortingUtils.insertionSort(integerComparator, input);

        assertThat(output, IsArrayContainingInOrder.arrayContaining(expected));
    }


    @Test
    @Override
    public void reverseSuccess()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3)};
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        Integer[] output = SortingUtils.insertionSort(integerComparator, input);

        assertThat(output, IsArrayContainingInOrder.arrayContaining(expected));
    }


    @Test
    @Override
    public void fewUniqueReverseSuccess()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(1), new Integer(1), new Integer(0), new Integer(-2), new Integer(-2), new Integer(-3)};
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        Integer[] output = SortingUtils.insertionSort(integerComparator, input);

        assertThat(output, IsArrayContainingInOrder.arrayContaining(expected));
    }


    @Test
    @Override
    public void alreadySortedFewUniqueSuccess()
    {
        Integer[] input = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        Integer[] output = SortingUtils.insertionSort(integerComparator, input);

        assertThat(output, IsArrayContainingInOrder.arrayContaining(expected));
    }


    @Test
    @Override
    public void inputArgEmptySuccess()
    {
        Integer[] input = new Integer[0];

        Integer[] output = SortingUtils.insertionSort(integerComparator, input);

        assertEquals(0, output.length);
    }


    @Test
    @Override
    public void oneInputElementSuccess()
    {
        Integer[] input = new Integer[]{new Integer(3)};

        Integer[] output = SortingUtils.insertionSort(integerComparator, input);

        assertEquals(1, output.length);
        assertEquals(new Integer(3), output[0]);
    }


    @Test
    @Override
    public void legalNullElementsSuccess()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(2), new Integer(1), null, new Integer(-1), new Integer(-2), null};
        Integer[] expected = new Integer[]{null, null, new Integer(-2), new Integer(-1), new Integer(1), new Integer(2), new Integer(3)};

        Integer[] output = SortingUtils.insertionSort(integerComparatorPermittingNull, input);

        assertThat(output, IsArrayContainingInOrder.arrayContaining(expected));
    }


    @Test
    @Override
    public void illegalNullElementThrowsException()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(2), new Integer(1), null, new Integer(-1), new Integer(-2), new Integer(-3)};

        exception.expect(NullPointerException.class);

        SortingUtils.insertionSort(integerComparator, input);
    }


    @Test
    @Override
    public void comparatorArgNullThrowsException()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3)};

        exception.expect(NullPointerException.class);
        exception.expectMessage(Matchers.equalTo("comparator must not be null."));

        SortingUtils.insertionSort(null, input);
    }
}