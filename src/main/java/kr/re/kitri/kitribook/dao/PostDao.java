package kr.re.kitri.kitribook.dao;

import kr.re.kitri.kitribook.exception.BizException;
import kr.re.kitri.kitribook.model.Post;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PostDao {

    @Autowired
    private SqlSession session;


    public Post insertPost(Post post) {
        // insert into post values(......)
        session.insert("kr.re.kitri.kitribook.dao.PostDao.insertPost", post);
        System.out.println("insert ok....");
        return post;
    }

    public Post updatePost(Post post) {
        // update post....
        System.out.println(post);
        session.update("kr.re.kitri.kitribook.dao.PostDao.updatePost", post);
        System.out.println("update ok");
        return post;
    }

    public long deletePost(long postId) {
        // delete from post where bookId = ??

        session.delete("kr.re.kitri.kitribook.dao.PostDao.deletePost", postId);
        System.out.println("delete ok..");
        return postId;
    }

    public List<Post> selectAllPosts() {
        // select * from post

        try {
            return session.selectList("kr.re.kitri.kitribook.dao.PostDao.selectAllPosts");
        }
        catch (BadSqlGrammarException se) {
            // 쿼리문법오류 : KITRI-0023
            throw new BizException("KITRI-0023", se);
        }
    }

    public Post selectPostByKey(long postId) {
        // select * from book where book_id/bookId

        return session.selectOne("kr.re.kitri.kitribook.dao.PostDao.selectPostByKey", postId);
    }
}
