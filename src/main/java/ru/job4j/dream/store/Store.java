package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

import java.util.Collection;

public interface Store {
    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    void save(Post post);
    void save(Candidate post);

    Post findById(int id);
    Candidate findByIdCandidate(int id);

    User findUser(int id);
    void reg(User user);
}