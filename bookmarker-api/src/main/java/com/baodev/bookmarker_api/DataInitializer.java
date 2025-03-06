package com.baodev.bookmarker_api;

import com.baodev.bookmarker_api.domain.Bookmark;
import com.baodev.bookmarker_api.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "title 1", "sample url 1", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 2", "sample url 2", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 3", "sample url 3", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 4", "sample url 4", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 5", "sample url 5", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 6", "sample url 6", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 7", "sample url 7", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 8", "sample url 8", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 9", "sample url 9", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 10", "sample url 10", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 11", "sample url 11", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 12", "sample url 12", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 13", "sample url 13", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 14", "sample url 14", LocalDateTime.now()));
        bookmarkRepository.save(new Bookmark(null, "title 15", "sample url 15", LocalDateTime.now()));
    }

}
