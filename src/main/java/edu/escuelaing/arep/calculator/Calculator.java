package edu.escuelaing.arep.calculator;

import edu.escuelaing.arep.datastructures.LinkedList;

public class Calculator {

    public static double mean(LinkedList<Double> values){
        Double sum = 0.0;
        for (Double value: values) sum += value;
        return sum / values.size();
    }

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
