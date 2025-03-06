package com.baodev.bookmarker_api.api;

import com.baodev.bookmarker_api.domain.Bookmark;
import com.baodev.bookmarker_api.domain.BookmarkService;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bookmarks")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @GetMapping
    public Page<Bookmark> getAllBookmarks(@Parameter(hidden=true) @PageableDefault(size = 10,
                                                sort = "createdAt",
                                                direction = Sort.Direction.DESC)
                                             final Pageable pageable) {
        return bookmarkService.getAllBookmarks(pageable);
    }

}
