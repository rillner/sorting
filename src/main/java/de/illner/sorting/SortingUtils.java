package de.illner.sorting;


import java.util.Comparator;
import java.util.List;


public final class SortingUtils
{

    // TODO: refactor javadoc: algorithm description, tell that sorting will be inplace
    // TODO: extra package private implementation class per algorithm, call them out of this class
    // TODO: check each method will be unit tested separately

    private SortingUtils()
    {}


    public static <T extends Comparable<T>> void insertionSort(List<T> input, SortOrder order)
    {
        if (order.equals(SortOrder.ASCENDING))
        {
            new InsertionSort().sortAscending(input);
        }
        else
        {
            new InsertionSort().sortDescending(input);
        }
    }


    public static <T extends Comparable<T>> void insertionSort(T[] input, SortOrder order)
    {
        if (order.equals(SortOrder.ASCENDING))
        {
            new InsertionSort().sortAscending(input);
        }
        else
        {
            new InsertionSort().sortDescending(input);
        }
    }


    public static <T> void insertionSort(Comparator< ? super T> comparator, List<T> input, SortOrder order)
    {
        if (order.equals(SortOrder.ASCENDING))
        {
            new InsertionSort().sortAscending(comparator, input);
        }
        else
        {
            new InsertionSort().sortDescending(comparator, input);
        }
    }


    public static <T> void insertionSort(Comparator< ? super T> comparator, T[] input, SortOrder order)
    {
        if (order.equals(SortOrder.ASCENDING))
        {
            new InsertionSort().sortAscending(comparator, input);
        }
        else
        {
            new InsertionSort().sortDescending(comparator, input);
        }
    }


    public static <T> boolean isSorted(Comparator< ? super T> comparator, List<T> input, SortOrder order) throws NullPointerException
    {
        ParamValidator.checkParameters(comparator, input);

        boolean isSorted = true;

        if (order.equals(SortOrder.ASCENDING))
        {
            for (int i = 0; i < input.size() - 1; i++)
            {
                if (comparator.compare(input.get(i), input.get(i + 1)) > 0)
                {
                    isSorted = false;
                    break;
                }
            }
        }
        else
        {
            for (int i = 0; i < input.size() - 1; i++)
            {
                if (comparator.compare(input.get(i), input.get(i + 1)) < 0)
                {
                    isSorted = false;
                    break;
                }
            }
        }

        return isSorted;
    }


    public static <T> boolean isSorted(Comparator< ? super T> comparator, T[] input, SortOrder order) throws NullPointerException
    {
        ParamValidator.checkParameters(comparator, input);

        boolean isSorted = true;

        if (order.equals(SortOrder.ASCENDING))
        {
            for (int i = 0; i < input.length - 1; i++)
            {
                if (comparator.compare(input[i], input[i + 1]) > 0)
                {
                    isSorted = false;
                    break;
                }
            }
        }
        else
        {
            for (int i = 0; i < input.length - 1; i++)
            {
                if (comparator.compare(input[i], input[i + 1]) < 0)
                {
                    isSorted = false;
                    break;
                }
            }
        }

        return isSorted;
    }


    public static <T extends Comparable<T>> boolean isSorted(List<T> input, SortOrder order) throws NullPointerException
    {
        ParamValidator.checkParameter(input);

        boolean isSorted = true;

        if (order.equals(SortOrder.ASCENDING))
        {
            for (int i = 0; i < input.size() - 1; i++)
            {
                if (input.get(i).compareTo(input.get(i + 1)) > 0)
                {
                    isSorted = false;
                    break;
                }
            }
        }
        else
        {
            for (int i = 0; i < input.size() - 1; i++)
            {
                if (input.get(i).compareTo(input.get(i + 1)) < 0)
                {
                    isSorted = false;
                    break;
                }
            }
        }

        return isSorted;
    }


    public static <T extends Comparable<T>> boolean isSorted(T[] input, SortOrder order) throws NullPointerException
    {
        ParamValidator.checkParameter(input);

        boolean isSorted = true;

        if (order.equals(SortOrder.ASCENDING))
        {
            for (int i = 0; i < input.length - 1; i++)
            {
                if (input[i].compareTo(input[i + 1]) > 0)
                {
                    isSorted = false;
                    break;
                }
            }
        }
        else
        {
            for (int i = 0; i < input.length - 1; i++)
            {
                if (input[i].compareTo(input[i + 1]) < 0)
                {
                    isSorted = false;
                    break;
                }
            }
        }

        return isSorted;
    }

    public enum SortOrder
    {
        ASCENDING, DESCENDING
    }
}
