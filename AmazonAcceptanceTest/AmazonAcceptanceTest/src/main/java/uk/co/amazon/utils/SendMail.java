package uk.co.amazon.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by Tunde on 13/07/2016.
 */
public class SendMail {

    //javax.mail => groupID
    //mail => artifactID

    public static  final String SMTP_HOST_NAME = "smtp.gmail.com";
    public static  final String SMTP_AUTH_USER = "your_email@gmail.com";
    public static  final String SMTP_AUTH_PWD = "your_password";

    public static  final String emailMsgTxt = "Hi \nMy name is automation guru! \nThanks";
    public static  final String emailSubjectTxt = "Testing";
    public static  final String emailFromAddress = "address@gmail.com";

    //Adding list of Email address to who email needs to be sent to
    public static final String[] emailList = {"receipient1@gmail.com", "receipient2@gmail.com"};

    public void postMail(String recipients[], String subject,
                         String message, String from) throws MessagingException
    {
        boolean debug = false;

        //Set the host smtp address
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", SMTP_HOST_NAME);
        props.put("mail.smtp.auth", "true");

        Authenticator auth = new SMTPAuthenticator();
        Session session = Session.getDefaultInstance(props, auth);

        session.setDebug(debug);

        //create a message
        Message msg = new MimeMessage(session);

        //set the from and to address
        InternetAddress addressFrom = new InternetAddress(from);
        msg.setFrom(addressFrom);

        InternetAddress[] addressTo = new InternetAddress[recipients.length];
        for(int i = 0; i < recipients.length; i++)
        {
            addressTo[i] = new InternetAddress(recipients[i]);
        }
        msg.setRecipients(Message.RecipientType.TO, addressTo);

        //setting the subject and content type
        msg.setSubject(subject);
        msg.setContent(message, "text/plain");

        Transport.send(msg);
        System.out.println("Successfully sent mail to all users");
    }

    private class SMTPAuthenticator extends javax.mail.Authenticator{

        public PasswordAuthentication getPasswordAuthentication(){
            String username = SMTP_AUTH_USER;
            String password = SMTP_AUTH_PWD;
            return new PasswordAuthentication(username, password);
        }

    }
}
