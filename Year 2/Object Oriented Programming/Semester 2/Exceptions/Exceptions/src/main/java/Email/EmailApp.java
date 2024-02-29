package Email;

public class EmailApp {
    public static void main(String[] args){
        EmailAddress e1 = new EmailAddress("sarah@gmail.com");
        EmailAddress e2;
        try{
            e2 = new EmailAddress("sarahgmail.com");
            System.out.println(e2);
        } catch (illegalEmailException e){
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println(e1);
        System.out.println(e2);
    }
}
