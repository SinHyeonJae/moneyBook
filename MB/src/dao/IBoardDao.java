package dao;

import java.util.HashMap;
import java.util.List;

import model.Board;

public interface IBoardDao {
	public int insertBoard(Board board);
	public int updateBoard(Board board);			
	public int updateRecommendBoard(int boardNo);
	public int deleteBoard(int boardNo);
	public Board selectBest();		
	public Board selectOneBoard(int boardNo);		
	public List<Board> selectByNick(String nick);
	public List<Board> selectByTitle(HashMap<String, Object> params);			
	public List<Board> selectByAgeType(String ageType);
	
}
