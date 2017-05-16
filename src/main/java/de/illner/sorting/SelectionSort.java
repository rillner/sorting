/*
 * SelectionSort.java
 *
 * created at 16.05.2017 by Robert Illner
 */
package de.illner.sorting;


import java.util.Comparator;
import java.util.List;


final class SelectionSort extends AbstractSortingAlgorithm implements ISorting
{

    @Override
    public <T> void sortAscending(Comparator< ? super T> comparator, List<T> input) throws NullPointerException
    {
        ParamValidator.checkParameters(comparator, input);

        if (input.size() > 1)
        {
            for (int i = 0; i < input.size(); i++)
            {
                int k = i;
                for (int j = i + 1; j < input.size(); j++)
                {
                    if (comparator.compare(input.get(j), input.get(k)) < 0)
                    {
                        k = j;
                    }
                }
                swap(input, i, k);
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