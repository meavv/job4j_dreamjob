package ru.job4j.dream.store;

import org.junit.Test;
import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

import java.util.ArrayList;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;

public class DbStoreTest {

    @Test
    public void whenCreatePost() {
        Store store = DBStore.instOf();
        Post post = new Post(0, "Java Job");
        store.save(post);
        Post postInDb = store.findById(post.getId());
        assertThat(postInDb.getName(), is("Java Job"));
    }

    @Test
    public void whenCreateCandidate() {
        Store store = DBStore.instOf();
        Candidate candidate = new Candidate(0, "Qwe");
        store.save(candidate);
        Candidate inDb = store.findByIdCandidate(candidate.getId());
        assertThat(inDb.getName(), is("Qwe"));
    }

    @Test
    public void whenNull() {
        Store store = DBStore.instOf();
        Post post = new Post(0, "Java Job");
        assertNull(store.findById(post.getId()));
    }

    @Test
    public void whenFindAllCandidate() {
        Store store = DBStore.instOf();
        Candidate candidate1 = new Candidate(0, "1");
        Candidate candidate2 = new Candidate(0, "2");
        Candidate candidate3 = new Candidate(0, "3");
        store.save(candidate1);
        store.save(candidate2);
        store.save(candidate3);
        var rsl = store.findAllCandidates();
        Collection<Candidate> candidateCollection = new ArrayList<>();
        candidateCollection.add(candidate1);
        candidateCollection.add(candidate2);
        candidateCollection.add(candidate3);
        assertThat(rsl, is(candidateCollection));
    }
}