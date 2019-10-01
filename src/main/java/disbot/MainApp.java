package disbot;

import listener.LunchListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

public class MainApp {

	public static void main(String[] args) {
		JDABuilder bulider = new JDABuilder(AccountType.BOT);
		String token = ""; // 이곳에 토큰 스트링을 넣어야 동작합니다.

		bulider.setToken(token);

		try {
			bulider.addEventListeners(new LunchListener());
			bulider.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}