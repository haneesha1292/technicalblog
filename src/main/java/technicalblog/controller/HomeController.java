package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPosts(Model model) {
        ArrayList<Post> posts = new ArrayList<>();

        Post post = new Post();
        post.setTitle("Recipe 1");
        post.setBody("Recipe Details 1");
        post.setBlogDate(new Date());

        Post post1 = new Post();
        post1.setTitle("Recipe 2");
        post1.setBody("Recipe Details 2");
        post1.setBlogDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Recipe 3");
        post2.setBody("Recipe Details 3");
        post2.setBlogDate(new Date());

        posts.add(post);
        posts.add(post1);
        posts.add(post2);

        model.addAttribute("posts", posts);
        return "index";
    }
}
