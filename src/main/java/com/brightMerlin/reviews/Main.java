package com.brightMerlin.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

/**
 * Created by cory on 9/27/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer= new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Cory", "Brighton", 6, "Here");
            printer.printRecord("Chris", "Happer", 8 , "Really good, Going to do");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
