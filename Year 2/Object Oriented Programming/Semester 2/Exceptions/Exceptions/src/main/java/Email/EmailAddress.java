package Email;

public class EmailAddress {
    private String eMail;
    public EmailAddress(String eMail){
        if(eMail.contains("@")){
            this.eMail = eMail;
        }
        else {
            throw new illegalEmailException("Email does not contain an @");
        }
    }
}
