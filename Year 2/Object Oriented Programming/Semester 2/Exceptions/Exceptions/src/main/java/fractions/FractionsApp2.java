package fractions;
public class FractionsApp2 {
    public static void main(String[] args) {
        try {
            fractions f = new fractions(2, 5);
        }
        catch(NullDenException e){
            System.out.println(e.getMessage());
        }
    }
}
