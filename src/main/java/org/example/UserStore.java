package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UserStore {
    // Very simple in-memory store (for demo)
    private static final Set<String> USERS = new HashSet<>();

    static {
        USERS.add("john");
        USERS.add("maria");
        USERS.add("erdogan");
    }

    public static boolean exists(String name) {
        if (name == null) return false;
        return USERS.contains(name.trim().toLowerCase());
    }

    public static void add(String name) {
        if (name == null) return;
        USERS.add(name.trim().toLowerCase());
    }

    public static Set<String> all() {
        return Collections.unmodifiableSet(USERS);
    }
}