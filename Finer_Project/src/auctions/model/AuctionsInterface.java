package auctions.model;

import java.util.Date;

public interface AuctionsInterface {
	public String itemName(String itemName);
	public int price(int price);
	public Date date(Date date);
	public boolean login(String id,String pw);
	public String nick(String nick);
	public String address(String address);
	
}
