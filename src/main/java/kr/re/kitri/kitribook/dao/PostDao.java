package kr.re.kitri.kitribook.dao;

import kr.re.kitri.kitribook.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostDao {

    public Post insertPost(Post post) {
        // insert into post values(......)
        System.out.println("insert ok....");
        return post;
    }

    public Post updatePost(Post post) {
        // update post....
        System.out.println("update ok");
        return post;
    }

    public long deletePost(long bookId) {
        // delete from post where bookId = ??
        System.out.println("delete ok..");
        return bookId;
    }

    public List<Post> selectAllPosts() {
        // select * from post
        List<Post> books = new ArrayList<>();
        Post book1 = new Post(2, "kim", "no1", "aaaa", 10);
        Post book2 = new Post(3, "lee", "no3", "bbbb", 10);
        Post book3 = new Post(4, "park", "no2", "cccc", 10);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        return books;
    }

    public Post selectPostByKey(long bookId) {
        // select * from book where book_id/bookId
        Post post = new Post(5, "park", "too many money", "hi", 0);

        return post;
    }
}
