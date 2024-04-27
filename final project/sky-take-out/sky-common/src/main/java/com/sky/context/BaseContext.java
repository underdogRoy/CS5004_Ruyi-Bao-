package com.sky.context;

/**
 * Base context class providing thread-local storage for managing IDs.
 */
public class BaseContext {

    /**
     * Thread-local variable to store IDs.
     */
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * Set the current ID in the thread-local storage.
     *
     * @param id The ID to set
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * Get the current ID from the thread-local storage.
     *
     * @return The current ID
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }

    /**
     * Remove the current ID from the thread-local storage.
     */
    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
