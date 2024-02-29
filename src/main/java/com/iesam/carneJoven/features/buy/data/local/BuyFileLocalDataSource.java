package com.iesam.carneJoven.features.buy.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.carneJoven.features.buy.domain.Buy;


import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase la proporciona el profesor
 */
public class BuyFileLocalDataSource {

    private String nameFile = "buy.txt";

    private Gson gson = new Gson();

    private final Type type = new TypeToken<Buy>() {
    }.getType();

    public void saveBuy(Buy buy) {
        try {
            if (!Files.exists(Paths.get(nameFile))) {
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter myWriter = new FileWriter(nameFile, true);
            myWriter.write(gson.toJson(buy) + System.lineSeparator());
            myWriter.close();
            System.out.println("Promoción guardada correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la promoción.");
        }
    }

    public Buy obtainBuy(String id) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (String line : lines) {
                Buy buy = gson.fromJson(line, Buy.class);
                if (buy.getId().equals(id)) {
                    return buy;
                }
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al obtener la promocion");
        }
        return null;
    }

    public ArrayList<Buy> obtainCompanies() {
        ArrayList<Buy> companies = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (String line : lines) {
                Buy buy = gson.fromJson(line, Buy.class);
                companies.add(buy);
            }
        } catch (IOException e) {
            System.out.println("Error al obtener compras");
        }

        return companies;
    }

    public void clear() {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write("");
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
        }
    }
}
