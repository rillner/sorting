/*
 * InsertionSortTest.java
 *
 * created at 15.05.2017 by Robert Illner
 */
package de.illner.sorting;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.hamcrest.collection.IsArrayContainingInOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import de.illner.sorting.SortingUtils.SortOrder;


public class InsertionSortTest extends AbstractSortingTest
{

    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    
    @Test
    @Override
    public void sortListAscWith10000RdmInts()
    {
        SortingUtils.insertionSort(tenThousandRdmIntList, SortOrder.ASCENDING);
        SortingUtils.isSorted(tenThousandRdmIntList, SortOrder.ASCENDING);
    }


    @Test
    @Override
    public void sortListDescWith10000RdmInts()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListAscAlreadySorted()
    {

    }


    @Test
    @Override
    public void sortListDescAlreadySorted()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListAscReverse()
    {

    }


    @Test
    @Override
    public void sortListDescReverse()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListAscFewUnique()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListDescFewUnique()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListAscFewUniqueReverse()
    {

    }


    @Test
    @Override
    public void sortListDescFewUniqueReverse()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListAscAlreadySortedFewUnique()
    {

    }


    @Test
    @Override
    public void sortListDescAlreadySortedFewUnique()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListAscWithOneElement()
    {

    }


    @Test
    @Override
    public void sortListDescWithOneElement()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListAscComparatorPermitsNullElements()
    {

    }


    @Test
    @Override
    public void sortListDescComparatorPermitsNullElements()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListAscComparatorDoesntPermitNullElementsFails()
    {

    }


    @Test
    @Override
    public void sortListDescComparatorDoesntPermitNullElementsFails()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortListAscWithNullComparatorFails()
    {

    }


    @Test
    @Override
    public void sortListDescWithNullComparatorFails()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscWith10000RdmInts()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayDescWith10000RdmInts()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscAlreadySorted()
    {
        Integer[] input = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        SortingUtils.insertionSort(integerComparator, input, SortOrder.ASCENDING);

        assertThat(input, IsArrayContainingInOrder.arrayContaining(expected));

    }


    @Test
    @Override
    public void sortArrayDescAlreadySorted()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscReverse()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3)};
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-1), new Integer(0), new Integer(1), new Integer(2), new Integer(3)};

        SortingUtils.insertionSort(integerComparator, input, SortOrder.ASCENDING);

        assertThat(input, IsArrayContainingInOrder.arrayContaining(expected));
    }


    @Test
    @Override
    public void sortArrayDescReverse()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscFewUnique()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayDescFewUnique()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscFewUniqueReverse()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(1), new Integer(1), new Integer(0), new Integer(-2), new Integer(-2), new Integer(-3)};
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        SortingUtils.insertionSort(integerComparator, input, SortOrder.ASCENDING);

        assertThat(input, IsArrayContainingInOrder.arrayContaining(expected));
    }


    @Test
    @Override
    public void sortArrayDescFewUniqueReverse()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscAlreadySortedFewUnique()
    {
        Integer[] input = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};
        Integer[] expected = new Integer[]{new Integer(-3), new Integer(-2), new Integer(-2), new Integer(0), new Integer(1), new Integer(1), new Integer(3)};

        SortingUtils.insertionSort(integerComparator, input, SortOrder.ASCENDING);

        assertThat(input, IsArrayContainingInOrder.arrayContaining(expected));

    }


    @Test
    @Override
    public void sortArrayDescAlreadySortedFewUnique()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscWithOneElement()
    {
        Integer[] input = new Integer[]{new Integer(3)};

        SortingUtils.insertionSort(integerComparator, input, SortOrder.ASCENDING);

        assertEquals(1, input.length);
        assertEquals(new Integer(3), input[0]);
    }


    @Test
    @Override
    public void sortArrayDescWithOneElement()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscComparatorPermitsNullElements()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(2), new Integer(1), null, new Integer(-1), new Integer(-2), null};
        Integer[] expected = new Integer[]{null, null, new Integer(-2), new Integer(-1), new Integer(1), new Integer(2), new Integer(3)};

        SortingUtils.insertionSort(integerComparatorPermittingNull, input, SortOrder.ASCENDING);

        assertThat(input, IsArrayContainingInOrder.arrayContaining(expected));
    }


    @Test
    @Override
    public void sortArrayDescComparatorPermitsNullElements()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscComparatorDoesntPermitNullElementsFails()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(2), new Integer(1), null, new Integer(-1), new Integer(-2), new Integer(-3)};

        exception.expect(NullPointerException.class);

        SortingUtils.insertionSort(integerComparator, input, SortOrder.ASCENDING);
    }


    @Test
    @Override
    public void sortArrayDescComparatorDoesntPermitNullElementsFails()
    {
        // TODO Auto-generated method stub

    }


    @Test
    @Override
    public void sortArrayAscWithNullComparatorFails()
    {
        Integer[] input = new Integer[]{new Integer(3), new Integer(2), new Integer(1), new Integer(0), new Integer(-1), new Integer(-2), new Integer(-3)};

        exception.expect(NullPointerException.class);
        exception.expectMessage(Matchers.equalTo("comparator must not be null."));

        SortingUtils.insertionSort(null, input, SortOrder.ASCENDING);
    }


    @Test
    @Override
    public void sortArrayDescWithNullComparatorFails()
    {
        // TODO Auto-generated method stub

    }
}
