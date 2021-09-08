// Programa para Cálculo de despesas totais.

class calculadoraDeDespesas {
    public static void main(String[] args) {

        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int valorTotal = janeiro + fevereiro + marco;
        double media = valorTotal / 3;

        System.out.println(valorTotal);
        System.out.println(media);
        
    }
}