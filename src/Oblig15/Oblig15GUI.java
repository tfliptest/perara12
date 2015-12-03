import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


public class Oblig15GUI extends JFrame implements ActionListener, DocumentListener{
	 
	JButton knapp = new JButton("Send tweet");
	JTextArea skrivut = new JTextArea();
	JTextField skriv = new JTextField(25);
	Twitter twitter=null;
	
	public Oblig15GUI(){
		this.setLayout(new FlowLayout());
		this.setSize(350,350);
		this.setLocation(500,500);
		this.add(skrivut);
		this.add(skriv);
		this.add(knapp);
		knapp.addActionListener(this);
		this.setVisible(true);
		
		skriv.getDocument().addDocumentListener(this);
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setOAuthConsumerKey("5JzZFyrJNPa9DduF7nNznLKCR");
		cb.setOAuthConsumerSecret("hlxFll6YKxmZlN59uPaFowgjZgF0rnXvEwILBOrIMAKdIPzoMi");
		cb.setOAuthAccessToken("342694591-DfXrPSQRD7nk56Ooc1zSf8NOVHgPl5vb2NLIwd2a");
		cb.setOAuthAccessTokenSecret("0bKf6OHTooSDB1VKUk4AQQJzqA9EfJhJY77owUZl1fqXe");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter = tf.getInstance();
		
		Query q = new Query("#dat101");
		GeoLocation g = new GeoLocation(58.34,8.593);
		q.setGeoCode(g, 100.0, Query.KILOMETERS);
		
		try {
			QueryResult result = twitter.search(q);
			for(Status s:result.getTweets()){
				System.out.println(s.getText());
				skrivut.setText(skrivut.getText() + '\n' + s.getText());
		
			}}
		 catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	String upp = skriv.getText();
	try {
		twitter.updateStatus(upp);
	} catch (TwitterException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void spørsmål(){
		try {
			twitter.updateStatus(skriv.getText());
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
