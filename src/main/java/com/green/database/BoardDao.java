package com.green.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//Data Access Object (DB 작업하는 객체)
public class BoardDao {

    //insert, update, delete >> 리턴값은 영향받은 행 값
    //executeUpdate() 메소드 호출
    public int insBoard(Board board) {
        int result = 0;
        String sql = " INSERT INTO board " +
                        " SET title = ? " +
                        "   , contents = ? " +
                        "   , writer = ?  ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            //?부분에 값 채우기
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());

            result = ps.executeUpdate(); //쿼리 실행
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Board> selBoardList() {
        List<Board> list = new ArrayList<>();
        String sql = " SELECT board_id, title, writer, created_at " +
                     "   FROM board " +
                     "  ORDER BY board_id DESC ";

        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)
             ; ResultSet rs = ps.executeQuery()) {

            while(rs.next()) {
                Board board = new Board();
                list.add(board);
                board.setBoardId(rs.getInt("board_id"));
                board.setTitle(rs.getString("title"));
                board.setWriter(rs.getString("writer"));
                board.setCreatedAt(rs.getString("created_at"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Board selBoardOne(int boardId) {

        String sql = " SELECT board_id, title, contents, writer, created_at " +
                "   FROM board " +
                "   WHERE board_id = ? ";

        ResultSet rs = null;
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, boardId);
            rs = ps.executeQuery();

            if(rs.next()) {
                Board board = new Board();
                board.setBoardId(rs.getInt("board_id"));
                board.setTitle(rs.getString("title"));
                board.setContents(rs.getString("contents"));
                board.setWriter(rs.getString("writer"));
                board.setCreatedAt(rs.getString("created_at"));
                return board;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
            }
        }
        return null;
    }

    public int updBoard(Board board) {
        int result = 0;
        String sql = " UPDATE board " +
                     "    SET title = ? " +
                     "      , contents = ? " +
                     "      , writer = ? " +
                     "  WHERE board_id = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());
            ps.setInt(4, board.getBoardId());

            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int updBoardDynamic(Board board) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        if(board.getTitle() != null && !"".equals(board.getTitle())) {
            sb.append(String.format(", title = '%s' ", board.getTitle()));
        }
        if(board.getContents() != null && !"".equals(board.getContents())) {
            sb.append(String.format(", contents = '%s' ", board.getContents()));
        }
        if(board.getWriter() != null && !"".equals(board.getWriter())) {
            sb.append(String.format(", writer = '%s' ", board.getWriter()));
        }
        String sql = String.format("UPDATE board SET %s WHERE board_id = %d"
                                , sb.deleteCharAt(0), board.getBoardId());
        System.out.println(sql);
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int delBoard(int boardId) {
        int result = 0;
        String sql = " DELETE FROM board WHERE board_id = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
             ps.setInt(1, boardId);
             result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
