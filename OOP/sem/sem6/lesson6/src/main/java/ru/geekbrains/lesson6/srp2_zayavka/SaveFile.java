package ru.geekbrains.lesson6.srp2_zayavka;

import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    private final Order order;

    public SaveFile(Order order) {
        this.order = order;
    }

    /**
     * Метод сохранения введённой инф-ции в файл - order.json
     */
    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
