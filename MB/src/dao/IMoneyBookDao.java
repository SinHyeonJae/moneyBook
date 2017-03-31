package dao;

import java.util.Date;
import java.util.List;

import model.MoneyBook;

public interface IMoneyBookDao {
	public int insertMoneyBook(MoneyBook mb);
	public int updateMoneyBook(String category, String detail,
								int price, int moneyBookNo, int id_index);			
	public int deleteMoneyBook(int moneyBookNo, int id_index);
	public List<MoneyBook> selectByDate(Date date, int id_index);
	public List<MoneyBook> selectOneMonth(Date date, int id_index);			




}
