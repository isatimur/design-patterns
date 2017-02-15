package xyz.isatimur.knowledgebase.design.patterns.singleton;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Created by isati on 15.02.2017.
 */
public class SingletonTest {
    private Singleton2 one = null, two = null;
    private SingletonSynchronized singletonSynchronized = null;

    @Before
    public void setUp() {
        System.out.println("...gettting singleton...");
        one = Singleton2.getInstance();
        System.out.println("...got singleton...");
        System.out.println("...gettting singleton...");
        two = Singleton2.getInstance();
        System.out.println("...got singleton...");
        singletonSynchronized = null;
    }

    @Test
    public void testUnique() {
        System.out.println("...checking uniqness...");
        assertEquals(true, one == two);
    }

    @Test
    public void testUniqueForMultithreadedEnv() throws InterruptedException, ExecutionException {
        Callable callable = () -> {
            return SingletonSynchronized.getInstance();
        };
        ExecutorService service = Executors.newCachedThreadPool();
        SingletonSynchronized s1 = (SingletonSynchronized) service.submit(callable).get();
        SingletonSynchronized s2 = (SingletonSynchronized) service.submit(callable).get();
        assertSame(s1, s2);
    }
}