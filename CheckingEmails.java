import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingEmails{
    /**
     * This method check whether an email address is valid or not, 
     * assuming that email address domains that end in .com, .edu, .org, or .gov 
     * and assuming that the remaing part except the @ and ending are letters or digits.
     * @param email a string of the email address
     * Edited by Scott Yeheng Zong
     */
    public static void checkingEmails(String email){
        Pattern pattern = Pattern.compile("[A-z0-9a-z][A-z0-9a-z]*@[A-z0-9a-z][A-z0-9a-z]*(.com|.edu|.org|.gov)");
        //before and after @, there must be at least one valid character
        Matcher m = pattern.matcher(email);
        
        if(email.length()!=16){
            System.out.println("invalid email address");
        }
        else{
            if(m.find()){
                System.out.println("valid email address");
            }
            else{
                System.out.println("invalid email address");
            }
        }
    }
}