package com.lenjoy.forum.common;

public class LenjouForumException extends RuntimeException {
    public LenjouForumException() {
    }

    public LenjouForumException(String message) {
        super(message);
    }

    public static void fail(String message) {
        throw new LenjouForumException(message);
    }
}
