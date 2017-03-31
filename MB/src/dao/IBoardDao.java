package dao;

import java.util.List;

import model.Board;

public interface IBoardDao {
	public int insertBoard(Board b);
	public int updateBoard(String title, String content,
				String annotation, String agetype, int boradNo, int id_index);			
	public int deleteBoard(int boardNo);
	public Board selectBest();			
	public List<Board> selectByNick(int id_index);
	public List<Board> selectByTitle(String title);			
	public List<Board> selectByAgeType(String ageType);
}
