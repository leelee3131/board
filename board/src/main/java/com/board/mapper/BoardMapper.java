package com.board.mapper;
 
 
import java.util.List;
 
import com.board.domain.boardVO;
 
public interface BoardMapper {
 
    //���ۼ�
    public void boardInsert(boardVO vo)throws Exception;
    
    //�۸��
    public List<boardVO>boardList()throws Exception;
    
    //�ۺ���
    public boardVO boardView(int bno)throws Exception;
    
    //��ȸ�� ����
    public void hitPlus(int bno)throws Exception;
    
    //�ۼ���
    public void boardUpdate(boardVO vo)throws Exception;
    
    //�ۻ���
    public void boardDelete(int bno)throws Exception;


    
}
 