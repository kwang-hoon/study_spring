package kr.re.kitri.kitribook.service;

import kr.re.kitri.kitribook.dao.PostDao;
import kr.re.kitri.kitribook.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 트랜잭션
@Service
public class KitriBookService {

    @Autowired
    private PostDao postDao;

    public List<Post> viewPosts() {
        return postDao.selectAllPosts();
    }

    public Post viewPostById(long bookId) {
        return postDao.selectPostByKey(bookId);
    }

    public Post writePost(Post post) {
        return postDao.insertPost(post);
    }

    public Post moidfyPost(Post post) {
        return postDao.updatePost(post);
    }

    public long removePost(long bookId) {
        return postDao.deletePost(bookId);
    }
}
