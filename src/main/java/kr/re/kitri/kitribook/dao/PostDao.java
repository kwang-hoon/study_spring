package kr.re.kitri.kitribook.dao;

import kr.re.kitri.kitribook.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostDao {

    private Object ArrayList;

    public void insertPost() {

    }

    public void updatePost() {

    }

    public void deletePost() {

    }

    public List<Post> selectAllPosts() {
        // select * from post
        List<Post> books = new ArrayList<>();
        Post book1 = new Post("kim", "no1", "aaaa", 10);
        Post book2 = new Post("lee", "no3", "bbbb", 10);
        Post book3 = new Post("park", "no2", "cccc", 10);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        return books;
    }

    public String selectPostByKey() {
        return "post by key";
    }
}
