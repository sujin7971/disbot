package listener;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import domain.LunchVO;

public class Parser {
	public LunchVO getMenu(String date) {
		String url = "http://www.y-y.hs.kr/lunch.view?date=" + date;
		LunchVO lunch = new LunchVO();
		lunch.setDate(date);

		// 여기에 점심을 가져오는 코드를 작성합시다.

		try {
			Document doc = Jsoup.connect(url).get();

			Element span = doc.selectFirst("#morning .menuName span");

			lunch.setMenuString(span.html());

		} catch (Exception e) {
			lunch.setMenuString("메뉴 없음");
		}

		return lunch;
	}
}
