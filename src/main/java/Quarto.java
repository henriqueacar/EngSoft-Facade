public class Quarto extends Casa{
    private static Quarto quarto = new Quarto();

    private Quarto(){
    }

    public static Quarto getInstancia(){
        return quarto;
    }
}
