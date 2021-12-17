package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Store {

    private static final Store INST = new Store();

    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();
    private Map<Integer, Candidate> candidates = new ConcurrentHashMap<>();


    private Store() {
        posts.put(1, new Post(1, "Junior Java Job", "Jun", LocalDate.of(2021, Calendar.DECEMBER, 26)));
        posts.put(2, new Post(2, "Middle Java Job", "Mis", LocalDate.of(2021, Calendar.SEPTEMBER, 13)));
        posts.put(3, new Post(3, "Senior Java Job", "Sen", LocalDate.of(2021, Calendar.OCTOBER, 10)));
        candidates.put(1, new Candidate(1, "Junior Java"));
        candidates.put(2, new Candidate(2, "Middle Java"));
        candidates.put(3, new Candidate(3, "Senior Java"));

    }

    public static Store instOf() {
        return INST;
    }

    public Collection<Post> findAllPosts() {
        return posts.values();
    }

    public Collection<Candidate> findAllCandidates() {
        return candidates.values();
    }
}