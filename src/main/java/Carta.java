public class Carta {
    String nome;
    int tipo;
    int poder;

    public Carta(String nome, int tipo, int poder) {
        nome = nome;
        tipo = tipo;
        poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }

    public int getPoder() {
        return poder;
    }

    public String toString() {
        String nomeTipo = "";
        switch (tipo) {
            case 1:
                nomeTipo = "Soldado";
                break;
            case 2:
                nomeTipo = "Arqueiro";
                break;
            case 3:
                nomeTipo = "Pesado";
                break;
        }
        return String.format("Carta %s (%s) - Poder: %d", nome, nomeTipo, poder);
    }
}