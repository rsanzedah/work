package gov.gsa.sam.stepdefinition;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import cucumber.api.java.en.Given;

public class EmailStepDef {
	
	@Given("^Sending hunter green test report$")
	public void sending_hunter_green_test_report(){
		String to = "shanthi.dutta@gsa.gov";//change accordingly  
	      String from = "DoNotReply@gmail.com";//change accordingly  
	      String host = "159.142.1.100";//or IP address  
	  
	     //Get the session object  
	      Properties properties = System.getProperties();  
	      properties.setProperty("mail.smtp.host", host);  
	      Session session = Session.getDefaultInstance(properties);  
	  
	     //compose the message  
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(from));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	         message.setSubject("Hunter Green Automation Test Report");  
	         //message.setText("Hello, this is example of sending email  ");  
	        // message.setText("C:\\serenity-cucumber-starter-master\\target\\site\\serenity\\index.html");
	         
	      // Create the message part
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Now set the actual message
	         messageBodyPart.setText("This is message body");

	         // Create a multipar message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);

	         // Part two is attachment
	         messageBodyPart = new MimeBodyPart();
	        // String filename = "C:\\serenity-cucumber-starter-master\\target\\site\\serenity\\index.html";
	         
	         
	         String filename = "C:\\serenity-cucumber-starter-master\\target\\site\\serenity\\results.csv";
	         
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart);
	         // Send the complete message parts
	         
	         message.setContent(multipart);
	         message.setContent(multipart,"text/plain; charset=UTF-8");
	        		

	       // Send message  
	        Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }catch (MessagingException mex) {mex.printStackTrace();}  
	   } 
		
	}


