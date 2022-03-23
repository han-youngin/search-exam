package site.metacoding.searchtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.searchtest.domain.board.BoardRepository;
import site.metacoding.searchtest.domain.board.BoardTbl;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public List<BoardTbl> 검색하기(String keyword) {
        System.out.println(keyword);
        List<BoardTbl> result = boardRepository.mSearch(keyword);
        System.out.println(result);
        return result;
    }

}
