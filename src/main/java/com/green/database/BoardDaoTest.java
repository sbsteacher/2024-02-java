package com.green.database;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        Board board = null;
        if(args.length > 0) {
            board = new Board();
            board.setTitle(args[0]);
            board.setContents(args[1]);
            board.setWriter(args[2]);
        }
        insert(dao, board);
        //delete(dao);
    }
    private static void delete(BoardDao dao) {
        int result = dao.delBoard(2);
        System.out.println("result: " + result);
    }
    private static void insert(BoardDao dao, Board board) {
        int result = dao.insBoard(board);
        System.out.println("result: " + result);
    }
}
