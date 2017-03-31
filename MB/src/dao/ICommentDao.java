package dao;

import java.util.HashMap;


public interface ICommentDao {
	public int insertComment(HashMap<String, Object> params);
	public int updateComment(HashMap<String, Object> params);
	public int deleteComment(HashMap<String, Object> params);
	public HashMap<String, Object> selectWriterIndex(String nick);
	public HashMap<String, Object> checkComment(int commentNo);			

}
