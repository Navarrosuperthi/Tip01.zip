public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
    
        // Valores antes do imposto e gorjeta
        double[] valores = {10, 12, 9, 8, 7, 15, 11, 30};
        
        // Calcula o total para cada convidado
        double[] totais = calcularTotais(valores);
        
        // Imprime os totais de cada convidado
        for (int i = 0; i < totais.length; i++) {
            System.out.printf("Pessoa %d: $%.2f\n", i+1, totais[i]);
        }
    }
    
    public static double[] calcularTotais(double[] valores) {
        double[] totais = new double[valores.length];
        
        // Calcula o total para cada convidado
        for (int i = 0; i < valores.length; i++) {
            double total = valores[i] * 1.05 * 1.15; // Calcula total com imposto (5%) e gorjeta (15%)
            totais[i] = total;
        }
        
        return totais;
    }
}
        
       

