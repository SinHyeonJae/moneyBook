package dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import model.MoneyBook;

public interface IMoneyBookDao {
	boolean insertMoneyBook(MoneyBook mb);
	boolean updateMoneyBook(HashMap<String, Object> params);
	boolean deleteMoneyBook(HashMap<String, Object> params);
	List<MoneyBook> selectByDate(HashMap<String, Object> params);
	List<MoneyBook> selectOneMonth(HashMap<String, Object> params);

}
