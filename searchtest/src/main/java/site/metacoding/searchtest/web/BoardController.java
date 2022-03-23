package site.metacoding.searchtest.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.searchtest.domain.board.BoardTbl;
import site.metacoding.searchtest.service.BoardService;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/")
    public String main() {
        return "/post";
    }

    @GetMapping("/search")
    public String search(String keyword, Model model) {
        System.out.println(keyword);

        if (keyword != null) {
            List<BoardTbl> result = boardService.검색하기(keyword);
            model.addAttribute("list", result);
        }
        return "/post";
    }

}
