package dao;

import java.util.List;

import model.Member;

public interface IMemberDao {
   	public int insertMember(Member member);
   	public int updateMember(Member member);			
   	public int deleteMember(int id_index);		
   	public List<Member> selectAllMember();			
   	public Member selectOneMember(int id_index);
   	public int selectIdIndex(String id);
   	public int selectNick(String nick);

}
