class tiposPrimitivos {
    public static void main(String[] args) {

        int i = 5; // i recebe uma cópia do valor de 5;
        int j = i; // j recebe uma cópia do valor de i;
        i = i + 1; // i vira 6, j continua 5;

        System.out.println(i);
        
    }
}