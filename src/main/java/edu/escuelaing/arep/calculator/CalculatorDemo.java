package edu.escuelaing.arep.calculator;

import edu.escuelaing.arep.datastructures.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Calculator demo to read a dataset from a file and use the calculator.
 *
 * @author Angi Paola Jimenez Pira
 * @version 1.0
 */
public class CalculatorDemo
{

    /**
     * Main executive class receives a filename to start
     * This method calculates mean and standard deviation of values of file.
     * @param args filename for test
     */
    public static void main( String[] args )
    {
        try {
            File file = new File(args[0]);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String stringValues = reader.nextLine();
                LinkedList<Double> values = generateLinkedList(stringValues);
                System.out.println("\nMean: " + Calculator.mean(values));
                System.out.println("Standard Deviation: " + Calculator.standardDeviation(values) + "\n");
            }
            reader.close();
        } catch ( FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Converts a string line that contains double numbers to a Linked list <Double>.
     * @param lineOfValues String line that contains double numbers split by ",".
     * @return a linked list with values of the string line.
     */
    private static LinkedList<Double> generateLinkedList(String lineOfValues){
        LinkedList<Double> linkedList= new LinkedList<>();
        String[] values = lineOfValues.split(",");
        for (String valueString: values){
            linkedList.add(Double.parseDouble(valueString));
        }
        return linkedList;
    }
}