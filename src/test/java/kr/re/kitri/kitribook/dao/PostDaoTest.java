package kr.re.kitri.kitribook.dao;

import kr.re.kitri.kitribook.dao.PostDao;
import kr.re.kitri.kitribook.model.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PostDaoTest {

    @Autowired
    private PostDao postDao;

    @Test
    public void testInsertPost() {
        Post result = postDao.insertPost(new Post(4, "lim", "lol", "home,,", 2));
        assertNotNull(result);
    }

    @Test
    public void testSelectiPostByKey() {
        Post result = postDao.selectPostByKey(3);
        assertEquals(3, result.getPostId());
    }
}
