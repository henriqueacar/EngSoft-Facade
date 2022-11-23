public class Sala extends Casa{
    private static Sala Sala = new Sala();

    private Sala(){
    }

    public static Sala getInstancia(){
        return Sala;
    }
}
