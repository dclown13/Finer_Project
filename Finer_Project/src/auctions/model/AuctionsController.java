package auctions.model;

import java.util.Date;

import com.kh.finer_project.model.Auctions;

public class AuctionsController implements AuctionsInterface {

	@Override
	public boolean itemName(String itemName) {
		// 경매할 물품의 정보를 입력받고 사이트에 등록
		return false;
	}

	@Override
	public boolean login(String id, String pw) {
		// 로그인이 여부
		return false;
	}

	@Override
	public String nick(String nick) {
		// 사용자 닉네임
		return null;
	}

	@Override
	public String address(String address) {
		// 사용자 주소
		return null;
	}

	@Override
	public int price(int price) {
		// 사용자들의 가격을 입력 받는
		return 0;
	}

	@Override
	public boolean itemPrice(int itemPrice) {
		// 경매 시작 가격
		return false;
	}

	@Override
	public Date date(Date date) {
		// 경매 시작 날짜(yyyy/MM/dd) / 사용자의 구입날짜
		return null;
	}

}
