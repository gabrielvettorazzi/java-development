package estruturaControle;

public class SwitchSemBrake {
    public static void main(String[] args) {
        //switch sem break
        String faixa = "Preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Ele é muito bom");
            case "verde":
                System.out.println("ele é mediano");
            case "Azul":
                System.out.println("mais ou menos..");
            default:
        }
    }
}
