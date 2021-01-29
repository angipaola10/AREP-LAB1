package edu.escuelaing.arep.calculator;

import edu.escuelaing.arep.datastructures.LinkedList;

/**
 * Statistics calculator that helps to calculate the arithmetic mean and standard deviation.
 * @author Angi Paola Jimenez Pira
 * @version 1.0
 */
public class Calculator {

    /**
     * Calculates the arithmetic mean of a set of double values.
     *
     * @param values Linked List with the values to calculate the mean
     * @return Arithmetic mean of the values
     */
    public static double mean(LinkedList<Double> values){
        Double sum = 0.0;
        for (Double value: values) sum += value;
        return sum / values.size();
    }

    /**
     * Calculates the standard deviation of a set of double values.
     *
     * @param values Linked List with the values to calculate the standard deviation
     * @return Standard deviation of the values
     */
    public static double standardDeviation(LinkedList<Double> values){
        double standardDeviation = 0.0;
        double mean = mean(values);
        for(double value: values){
            standardDeviation += Math.pow( (value - mean), 2);
        }
        standardDeviation = Math.sqrt( standardDeviation / (values.size() - 1) );
        return standardDeviation;
    }

}
