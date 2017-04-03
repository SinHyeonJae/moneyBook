import java.util.Date;
import java.util.List;

import model.MoneyBook;

public interface IMoneyBookService {
	public List<MoneyBook> getMonthContent(MoneyBook mb);
	public int totalMonthAmount(int price, int id_index);
	public int totalAmountByCategory(int price, String category, int id_index);
	public List<MoneyBook> getDayContent(Date date, int id_index);
	public int totalDayAmount(int price, int id_index);
	public HashMap<String, Object> searchDate(Date date);
	public int moneyBookRegist(MoneyBook mb);
	public int moneyBookSelectOne(int moneyBookNo, int id_index, Date date);
	public int moneyBookDelete(int moneyBookNo, int id_index);
	public int moneyBookUpdate(String category, String detail,
			int price, int moneyBookNo, int id_index);

}
