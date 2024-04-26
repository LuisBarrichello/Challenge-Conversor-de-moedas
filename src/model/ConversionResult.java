package model;

public class ConversionResult {
    private double valueToConvert;
    private String primaryCurrencyCode;
    private String targetCurrencyCode;
    private double result;

    public ConversionResult(double valueToConvert, String primaryCurrencyCode, String targetCurrencyCode, double result) {
        this.valueToConvert = valueToConvert;
        this.primaryCurrencyCode = primaryCurrencyCode;
        this.targetCurrencyCode = targetCurrencyCode;
        this.result = result;
    }

    public double getValueToConvert() {
        return valueToConvert;
    }

    public String getPrimaryCurrencyCode() {
        return primaryCurrencyCode;
    }

    public String getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Valor a converter: " + valueToConvert +
                ", Moeda primária: " + primaryCurrencyCode +
                ", Moeda a ser convertida: " + targetCurrencyCode +
                ", Resultado: " + result;
    }
}
