package service;

import java.util.HashMap;
import java.util.List;

public interface ICommentService {
	public boolean commentWrite(HashMap<String, Object> params);

	public boolean commentDelete(int commentNo);

	public boolean commentUpdate(HashMap<String, Object> params);

	public boolean checkMyComment(int commentNo, int id_index);

	public List<HashMap<String, Object>> selectComment(int boardNo);
}
