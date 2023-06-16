package auctions.model;

import java.util.Date;

public interface AuctionsInterface {
	public boolean itemName(String itemName);//물건정보와 물건 등록.
	
	public boolean itemPrice(int itemPrice);//물건가격

	public int price(int price); // 사용자가 올리는 가격

	public Date date(Date date); // 등록한 날짜 / 구매한 날짜 

	public boolean login(String id, String pw); // 로그인여부

	public String nick(String nick); // 사용자 닉네임

	public String address(String address); // 사용자 주소
	
	
}
