package service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import commons.Comment;
import dao.ICommentDao;

@Service
public class CommentService implements ICommentService {
	@Autowired
	private ICommentDao dao;

	@Override
	public boolean commentWrite(HashMap<String, Object> params) {
		return dao.insertComment(params);
	}

	@Override
	public boolean commentDelete(int commentNo) {
		return dao.deleteComment(commentNo);
	}

	@Override
	public boolean commentUpdate(HashMap<String, Object> params) {
		return dao.updateComment(params);
	}

	@Override
	public List<HashMap<String, Object>> selectComment(int boardNo) {
		return dao.selectBoardComment(boardNo);
	}

	@Override
	public boolean checkMyComment(int commentId_index, int id_index) {
		if (commentId_index == id_index) {
			return true;
		} else {
			return false;
		}
	}
}
