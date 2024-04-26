package services;
import model.ConversionResult;
import java.util.ArrayList;
import java.util.List;

public class ConversionHistoryManager {
    private List<ConversionResult> conversionHistory;

    public ConversionHistoryManager() {
        conversionHistory = new ArrayList<>();
    }

    public void addConversion(ConversionResult conversion) {
        conversionHistory.add(conversion);
    }

    public List<ConversionResult> getConversionHistory() {
        return conversionHistory;
    }

    public void displayConversionHistory() {
        if(conversionHistory.size() == 0) {
            System.out.println("------------------------------------");
            System.out.println("Não há conversões para consultar, por favor, faça uma conversão para consultar o histórico!");
            System.out.println("------------------------------------");
            return;
        }
        System.out.println("Histórico de Conversões:");
        System.out.println("-------------------------------------");
        for (int i = 0; i < conversionHistory.size(); i++) {
            ConversionResult conversion = conversionHistory.get(i);
            System.out.println("Conversão " + (i + 1) + ":");
            System.out.println("Valor a converter: " + conversion.getValueToConvert());
            System.out.println("Moeda de origem: " + conversion.getPrimaryCurrencyCode());
            System.out.println("Moeda de destino: " + conversion.getTargetCurrencyCode());
            System.out.println("Resultado: " + conversion.getResult());
            // implementar que ConversionResult tenha um método getConversionDate()
            // System.out.println("Data da conversão: " + conversion.getConversionDate());
            System.out.println("-------------------------------------");
        }
    }
}
