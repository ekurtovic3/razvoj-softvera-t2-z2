package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {


    public TextField unosBroja;
    public TextArea ispisBrojeva;

    public void sumaCifaraBrojeva(javafx.event.ActionEvent actionEvent) {

        try {
            int n = Integer.parseInt(unosBroja.getText());
            String izlazni = new String();
            for (int i = 1; i <= n; i++) {
                int suma = 0;
                suma = sumaCifara(i);
                if (i % suma == 0) {
                    izlazni = izlazni + Integer.toString(i) + " ";
                }
            }
            ispisBrojeva.setText(izlazni);
        }
        catch (NumberFormatException error){
            ispisBrojeva.setText("Pogrešan unos, pokušaj ponovo!");
        }
    }
    public int sumaCifara (int broj) {
        int suma=0;
        while(broj != 0){
            suma = suma + (broj%10);
            broj = broj / 10;
        }
        return suma;
    }

    }

