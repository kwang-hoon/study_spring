package kr.re.kitri.kitribook.service;

import kr.re.kitri.kitribook.dao.PostDao;
import kr.re.kitri.kitribook.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitriBookService {

    @Autowired
    private PostDao postDao;

    public List<Post> viewPosts() {
        return postDao.selectAllPosts();
    }

    public String viewPostById() {
        return postDao.selectPostByKey();
    }

    public void writePost() {

    }

    public void moidfyPost() {

    }

    public void removePost() {

    }
}
