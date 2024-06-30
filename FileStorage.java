/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dataakbar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class FileStorage implements DataStorage {
    private final String filePath;


    public FileStorage(String filePath) {
        this.filePath = filePath;
    }


    public void writeData(String data) {
    try (FileWriter writer = new FileWriter(filePath)) {
        writer.write(data);
    } catch (IOException e) {
    }
}

    public String readData() {
    StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new
        FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
        sb.append(line);
    }
    } catch (IOException e) {
    }
        return sb.toString();
    }
}