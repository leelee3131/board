package com.board.mapper;
 
 
import java.util.List;
 
import com.board.domain.boardVO;
 
public interface BoardMapper {
 
    //글작성
    public void boardInsert(boardVO vo)throws Exception;
    
    //글목록
    public List<boardVO>boardList()throws Exception;
    
    //글보기
    public boardVO boardView(int bno)throws Exception;
    
    //조회수 증가
    public void hitPlus(int bno)throws Exception;
    
    //글수정
    public void boardUpdate(boardVO vo)throws Exception;
    
    //글삭제
    public void boardDelete(int bno)throws Exception;


    
}
 