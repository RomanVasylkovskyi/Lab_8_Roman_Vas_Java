package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DataBase {
    /**
     * Серіалізація
     */
    public static void datasave(ArrayList<quadrangle> arrayList, String File) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("./src/DataBase/" + File + ".json"),  arrayList);
    }


    /**
     * Десеріалізація
     */
    public static ArrayList dataload(String File) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(File), ArrayList.class);
    }
}