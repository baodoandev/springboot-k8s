package com.baodev.bookmarker_api.api;

import com.baodev.bookmarker_api.domain.Bookmark;
import com.baodev.bookmarker_api.domain.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bookmarks")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @GetMapping
    public List<Bookmark> getAllBookmarks() {
        return bookmarkService.getAllBookmarks();
    }

}
