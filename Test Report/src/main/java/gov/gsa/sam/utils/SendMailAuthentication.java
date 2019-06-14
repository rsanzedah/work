package gov.gsa.sam.utils;


import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMailAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String to = "shanthi.dutta@gmail.com";
		String from = "shanthi.dutta@gmail.com";
		Properties properties = new Properties();
	/*	properties.put("mail.smtp.host", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com"); //YOUR SMTP SERVER NAME GOES HERE
		properties.put("mail.smtp.port", 587);*/
		
		
		//properties.put("email.host", "159.142.1.100");
		properties.put("email.port", 25);
		properties.put("email.protocol", "smtp");

		Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("AKIAJZL4MH35IG2NCCOA", "AkXUn0vFLnn3gP1sj2La8TK+fnaWtW9qxkX7sfZlT0rm"); //YOUR SMTP SERVER USER NAME PASSWORD GOES HERE
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("This is test subject");
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText("This is message body");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			messageBodyPart = new MimeBodyPart();
			String filename = "D:/Users/rvenna/DMS/AppealAck.pdf";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);
			message.setContent(multipart);
			Transport.send(message);
			System.out.println("Email Sent Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
