package ua.com.juja.study.core.presentation.collections;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/10/14
 * Time: 12:33 PM
 */
public class DequeQueryHistory implements QueryHistory {
    private Deque<String> queryHistory = new LinkedList<>();

    @Override

    public String getNextQuery() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String getPreviousQuery() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void addQueryToTheHead(String query) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
