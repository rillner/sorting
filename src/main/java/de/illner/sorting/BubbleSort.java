/*
 * BubbleSort.java
 *
 * created at 16.05.2017 by Robert Illner
 */
package de.illner.sorting;

import java.util.Comparator;
import java.util.List;


final class BubbleSort extends AbstractSortingAlgorithm implements ISorting
{

    @Override
    public <T> void sortAscending(Comparator< ? super T> comparator, List<T> input) throws NullPointerException
    {
        ParamValidator.checkParameters(comparator, input);

        for (int i = 0; i < input.size(); i++)
        {
            boolean swapped = false;

            for (int j = input.size() - 1; j <= i; j++)
            {
                if (comparator.compare(input.get(j), input.get(j - 1)) < 0)
                {
                    swap(input, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped)
            {
                break;
            }
        }
    }


    @Override
    public <T> void sortDescending(Comparator< ? super T> comparator, List<T> input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T> void sortAscending(Comparator< ? super T> comparator, T[] input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T> void sortDescending(Comparator< ? super T> comparator, T[] input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T extends Comparable<T>> void sortAscending(List<T> input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T extends Comparable<T>> void sortDescending(List<T> input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T extends Comparable<T>> void sortAscending(T[] input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T extends Comparable<T>> void sortDescending(T[] input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }
}