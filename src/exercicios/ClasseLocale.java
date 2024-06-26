package exercicios;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Locale;

public class ClasseLocale {
    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat();
        Locale local = Locale.getDefault();
        double valor = 1370.25;
        if (local.getCountry().equals("BR")) {
            df.applyPattern("R$ #,##0.00");
        }
        JOptionPane.showMessageDialog(null, "Configurações do Sistema Operacional"
                                        + "\nSigla: " + local.getCountry()
                                        + "\nPaís: " + local.getDisplayCountry()
                                        + "\nIdioma: " + local.getDisplayLanguage()
                                        + "\nTeclado: " + local.getDisplayName()
                                        + "\nValor: " + df.format(valor));
        System.exit(0);
    }
}
