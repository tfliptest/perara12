import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


public class Oblig15 extends JFrame implements ActionListener{
	DefaultListModel<String> model;
	JList spm;
	JButton knapp = new JButton("Send inn spørsmål");
	
	JTextField nyttspm = new JTextField(30);
	ConfigurationBuilder cb = new ConfigurationBuilder();
	TwitterFactory tf;
	Twitter twitter;
	
	public Oblig15(){
		model = new DefaultListModel<String>();
		spm =  new JList(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 500, 500);
		this.setLayout(new FlowLayout());

		this.add(new JLabel("Eksisterende spørsmål"));
		//this.add(tweets);
		this.add(nyttspm);
		this.add(spm);
		this.add(knapp);
		knapp.addActionListener(this);
		
		
 
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey("xMHpFFhCUgiffiUTf1RlZQ");
		cb.setOAuthConsumerSecret("LnrvRmG6VuxZpB0mVq4IzAd0Zj0QBnjwOwTk5oQVUs8");
			
		cb.setOAuthAccessToken("1057306374-mukHk9K2JWnCJdxVduijZG6azHZ9qpJZi7CxIY3");
		cb.setOAuthAccessTokenSecret("dM7pot5bGf30EqDJjQtCi4pAXkRbIitpyVnFNpISQL4");
		
	
		
		tf  = new TwitterFactory(cb.build());
		twitter = tf.getInstance();
		
		Query query = new Query("#uia");
		GeoLocation geo = new GeoLocation(58.3405000, 8.5934300);
		query.setGeoCode(geo, 100.0, Query.KILOMETERS);
		int i = 1;
		   try {
				QueryResult result = twitter.search(query);
				
			    for (Status tweet : result.getTweets()) {
			        System.out.println(tweet.getText());

			        model.addElement(tweet.getUser().getName() + "("+tweet.getUser().getFollowersCount()+")" + ":" + tweet.getText() );
			        //tweets.setText(tweets.getText() + i+ " " + tweet.getUser().getName() + "("+tweet.getUser().getFollowersCount()+")" + ":" + tweet.getText() +  "\n");
			        /*Ekstraoppgave
			         User user = twitter.showUser(tweet.getUser().getId());
			       
					String url = user.getBiggerProfileImageURL();
			        leggTilTweet(url,tweet.getUser().getName(),tweet.getText());*/
			        i+= 1;
			    }
			} catch (TwitterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   this.setVisible(true);
	}
	
	public void leggTilTweet(String url,String navn, String tweet){
		/* Denne er ekstraoppgave */

		try {
			URL u = new URL(url);
			BufferedInputStream b = new BufferedInputStream(u.openStream());
			Image img = ImageIO.read(b);
			ImageIcon ii = new ImageIcon(img);
			JLabel l = new JLabel(ii);
			
			this.add(l);
			
			
			this.add(new JLabel(navn));
			this.add(new JLabel(tweet));
			
			this.invalidate();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	


	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Knapp trykket på");
		String sporsmaal = nyttspm.getText() + " #dat101";
		System.out.println(sporsmaal);

		try {
			twitter.updateStatus(sporsmaal);
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
