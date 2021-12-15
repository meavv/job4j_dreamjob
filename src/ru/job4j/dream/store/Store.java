package ru.job4j.dream.store;

import ru.job4j.dream.model.Post;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Store {

    private static final Store INST = new Store();

    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private Store() {
        posts.put(1, new Post(1, "Junior Java Job", "Jun", new Date(2021, Calendar.DECEMBER, 26)));
        posts.put(2, new Post(2, "Middle Java Job", "Mis", new Date(2021, Calendar.SEPTEMBER, 13)));
        posts.put(3, new Post(3, "Senior Java Job", "Sen", new Date(2021, Calendar.OCTOBER, 10)));
    }

    public static Store instOf() {
        return INST;
    }

    public Collection<Post> findAll() {
        return posts.values();
    }
}