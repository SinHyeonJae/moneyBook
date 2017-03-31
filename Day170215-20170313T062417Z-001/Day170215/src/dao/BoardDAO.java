package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Board;
import util.DBManager;

public class BoardDAO {
	private static BoardDAO instance;

	public static BoardDAO getInstance() {
		if (instance == null)
			instance = new BoardDAO();
		return instance;
	}

	public List<Board> selectAllBoards() {
		String sql = "SELECT * FROM board";

		List<Board> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Board b = new Board();

				b.setNum(rs.getInt("num"));
				b.setName(rs.getString("name"));
				b.setEmail(rs.getString("email"));
				b.setPass(rs.getString("pass"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setReadCount(rs.getInt("readcount"));
				b.setWritedate(rs.getTimestamp("writedate"));

				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;
	}

	public void insertBoard(Board b) {
		String sql = "INSERT INTO board VALUES(0, ?, ?, ?, ?, ?, 0, now())";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, b.getPass());
			pstmt.setString(2, b.getName());
			pstmt.setString(3, b.getEmail());
			pstmt.setString(4, b.getTitle());
			pstmt.setString(5, b.getContent());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	public void updateReadCount(String num) {
		String sql = "update board set readcount = readcount+1 where num = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	public Board selectOneBoardByNum(String num) {
		String sql = "SELECT * FROM board WHERE num = ?";

		Board b = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				b = new Board();

				b.setNum(rs.getInt("num"));
				b.setName(rs.getString("name"));
				b.setPass(rs.getString("pass"));
				b.setEmail(rs.getString("email"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setWritedate(rs.getTimestamp("writedate"));
				b.setReadCount(rs.getInt("readcount"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return b;
	}

	public void updateBoard(Board b) {
		String sql = "UPDATE board SET name = ?, email = ?, pass = ?, title = ?, content = ? WHERE num = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, b.getName());
			pstmt.setString(2, b.getEmail());
			pstmt.setString(3, b.getPass());
			pstmt.setString(4, b.getTitle());
			pstmt.setString(5, b.getContent());
			pstmt.setInt(6, b.getNum());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}

	}

	public Board checkPassWord(String pass, String num) {
		String sql = "SELECT * FROM board WHERE pass = ? and num = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Board b = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, pass);
			pstmt.setString(2, num);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				b = new Board();
				
				b.setNum(rs.getInt("num"));
				b.setName(rs.getString("name"));
				b.setPass(rs.getString("pass"));
				b.setEmail(rs.getString("email"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setWritedate(rs.getTimestamp("writedate"));
				b.setReadCount(rs.getInt("readcount"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	public void deleteBoard(String num) {
		String sql = "DELETE FROM board WHERE num = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, num);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
