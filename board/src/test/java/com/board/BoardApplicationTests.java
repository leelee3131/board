/*package com.board;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
 
import com.board.domain.boardVO;
import com.board.mapper.BoardMapper;
 
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BoardApplication.class)
@WebAppConfiguration
public class BoardApplicationTests {
    
    @Autowired
    private BoardMapper mapper;
    
    @Test
    public void contextLoads() {
    }
    
    @Test
    public void testMapper() throws Exception{//�ۼ�
        
        boardVO vo = new boardVO();
        
        vo.setSubject("�����Դϴ�.");
        vo.setContent("�����Դϴ�.");
        vo.setWriter("�ۼ����Դϴ�.");
        
        mapper.boardInsert(vo);
        
    }
 
}*/
