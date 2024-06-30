/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dataakbar;

/**
 *
 * @author LENOVO
 */
public class MemoryStorage2 implements DataStorage{
    private final ArrayList<String> data;
    public MemoryStorage2() {
    this.data = new ArrayList<>();
    }

    @Override
    public void writeData(String data) {
    this.data.add(data);
    }

    @Override
    public String readData() {
        StringBuilder sb = new StringBuilder();
        this.data.forEach((item) -> {
            sb.append(item);
        });
        return sb.toString();
}
}