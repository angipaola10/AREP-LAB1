# Laboratory 1 - Introduction To Complex Systems, Java, Maven, and Git.

## Getting started
### Prerequisites
* Git
* Maven
* Java SE Development Kit 8
* Java SE Runtime Environment 8

### Installing
1. To use this project, you must clone it in your computer. Use the folliwing command:

       git clone https://github.com/angipaola10/AREP-LAB1.git

2. You must build the project, for that you enter to the directory 'AREP-LAB 1' in the command terminal and run the following command:

       mvn package

3.  Once the project is built, you can execute it with Maven in the following way:

        mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.calculator.CalculatorDemo" -Dexec.args="DataSet.txt"
    To run the program only text files located in the root directory of the program are supported. In the file you must write numbers separated by "," without whitespaces. For each line will be calculated both arithmetic mean and standard deviation. You must enter the file name as argument in the command line.

### Running the tests
1. You must enter to the directory 'AREP-LAB 1' in the command terminal and run the following command:

       mvn test

## Build With
* [Maven](https://maven.apache.org/) - Dependency Management
* CircleCI for CI - [![CircleCI](https://circleci.com/gh/angipaola10/AREP-LAB1.svg?style=svg)](https://circleci.com/gh/angipaola10/AREP-LAB1)

## Documentation
This repository contains a [paper]() that describes the proccess performed to make the program, but if you need aditional iformation in the directory [docs]() you find the documentation of site. 

#### Instructions 
If you want generate the documentation of this program, you must follow the next steps:
1. Run the next command to create the documenation:

       mvn javadoc:javadoc
       
2. Now, if you want, you can generate a site to see the documentation. Use the next command: 

       mvn site
       
3. To see the site created, you must run the next command:

       mvn site:run
       
    Enter http://localhost:8080 in your browser to see the site with the documentation.

## Author
* Angi Paola Jiménez Pira 
    