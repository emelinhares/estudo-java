import javax.lang.model.util.ElementScanner6;

// Condições Booleanas

class testeBooleano {
    public static void main(String[] args) {
        int idade = 17;
        boolean amigoDoDono = true;
        if(idade < 18 && !amigoDoDono) {
            System.out.println("Proibido para menores de 18 anos.");
        } else {
            System.out.println("Seja Bem vindo!");
        }
    }
}