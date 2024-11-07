package com.green.database;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        insert(dao);
    }

    private static void insert(BoardDao dao) {
        Board board = new Board();
        board.setTitle("올해 연말 가요제 내가 볼 무대는 거의 없네");
        board.setContents("유튜브든 뭐든 해서 찾아봤는데 올해는 먼가 아쉽네");
        board.setWriter("MS07B");

        int result = dao.insBoard(board);
        System.out.println("result: " + result);
    }
}
