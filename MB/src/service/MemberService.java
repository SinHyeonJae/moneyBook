package service;

import org.apache.ibatis.binding.BindingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IMemberDao;
import model.Member;

@Component
public class MemberService implements IMemberService {

	@Autowired
	private IMemberDao dao;

	@Override
	public int idCheck(String id) { // 1000번대
		// TODO Auto-generated method stub
		int result;
		try {
			result = dao.selectIdIndex(id);
			result = 1001;
		} catch (BindingException e) {
			result = 1002;
		}
		return result;
	}

	@Override
	public int nickCheck(String nick) {// 1100번대
		// TODO Auto-generated method stub
		int result;
		try {
			result = (int) dao.selectNick(nick);
			result = 1101;
		} catch (BindingException e) {
			result = 1102;
		}
		return result;
	}

	@Override
	public int joinSuccess(Member member) {// 2000번대
		// TODO Auto-generated method stub
		int result = dao.insertMember(member);
		if (result > 0)
			return 2001;
		else
			return 2002;
	}

	@Override
	public int IdpwdCheck(String pwd, int id_index) {
		// TODO Auto-generated method stub
		// 수정할때 현재비밀번호랑 입력한비밀번호랑 같은지
		// 1200번대, 요구사항 명세서의 password_check 커맨드랑 같다고 봄
		String old = dao.selectOneMember(id_index).getPwd();
		int result = 0;

		if (pwd.equals(old))
			result = 1201;
		else
			result = 1202;
		
		return result;
	}

	@Override
	public int updateMember(Member member) { // 4100번대
		// TODO Auto-generated method stub
		int result = dao.updateMember(member);
		
		if (result > 0)
			result = 4101;
		else
			result = 4102;
		
		return result;
	}

}
