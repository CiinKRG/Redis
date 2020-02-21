package com.richit;

import jdk.internal.util.xml.impl.Input;
import java.io.*;
import java.util.concurrent.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

public class CatalogosV1 {
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();

        String path = "/home/cynthia/Documentos/ProductoKS/Primarios/";
        String file = "emisores.csv";
        String pathToCsv = path + file;
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));

        String line, cvsSplitBy = ",";
        int columnCount = 0;
        String header = csvReader.readLine();
        String [] lineItems = header.split(",");

        //Numero de columnas
        for (String lineItem : lineItems){
            columnCount ++;
        }

        //Nombre del archivo
        String fileName = file.substring(0,file.lastIndexOf("."));

        //Encoding

        while ((line = csvReader.readLine()) != null) {
            String[] data = line.split(cvsSplitBy);
            //System.out.println("Datos [key= " + data[0] + " , value=" + data[1] + "]");
        }

        csvReader.close();
        System.out.println(System.nanoTime()-startTime); //Tiempo ejecución en nanosegundos
        System.out.println(NANOSECONDS.toMillis(System.nanoTime()-startTime)); //Tiempo ejecución en Milisegundos
    }
}
