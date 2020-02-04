package kr.re.kitri.kitribook.controller;

import kr.re.kitri.kitribook.model.Post;
import kr.re.kitri.kitribook.service.KitriBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // json으로 변경해줌 (default : json)
@RequestMapping("/kitribook")
public class KitriBookController {

    @Autowired
    private KitriBookService kitriBookService;

    // [GET] /kitribook/books .. 전체보기
    @GetMapping("/books") // @RequestMapping : 예전방식
    public List<Post> viewAllPosts(@RequestParam int size, @RequestParam int page) {

        System.out.println("size is " + size + "\npage " + size);

        return kitriBookService.viewPosts();
    }

    // [GET] /kitribook/books/{bookId} .. 상세보기
    @GetMapping("/books/{bookId}")
    public Post viewPostById(@PathVariable long bookId) {
        return kitriBookService.viewPostById(bookId);
    }

    // [POST] /kitribook/books .. 글쓰기
    @PostMapping("/books")
    public Post writePost(@RequestBody Post post) {
        kitriBookService.writePost(post);
        return post;
    }

    // [PUT] /kitribook/books .. 글수정
    @PutMapping("/books")
    public Post updatePost(@RequestBody Post post) {
        // validation check...
        return kitriBookService.moidfyPost(post);
    }

    // [DELETE] /kitribook/books/{bookId} .. 글삭제
    @DeleteMapping("/books/{bookId}")
    public long deletePost(@PathVariable long bookId) {
        return kitriBookService.removePost(bookId);
    }

}
