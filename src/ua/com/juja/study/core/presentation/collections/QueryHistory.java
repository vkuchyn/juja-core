package ua.com.juja.study.core.presentation.collections;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/22/14
 * Time: 11:23 PM
 */
public interface QueryHistory {
    public static final int QUERY_BUFFER_COUNT = 20;

    public abstract String getNextQuery();

    public abstract String getPreviousQuery();

    public abstract void addQueryToTheHead(String query);
}
