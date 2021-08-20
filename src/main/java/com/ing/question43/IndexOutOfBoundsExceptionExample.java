package com.ing.question43;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundsExceptionExample {

    List<User> allUsers = new ArrayList<>();

    /**
     *
     * @param index location index
     * @return User : founder User
     * @throws IndexOutOfBoundsException if index bigger or equal to size of the User list
     */
    public User getUser(int index) {
        if(index >= allUsers.size()){
            throw new IndexOutOfBoundsException("User doesn't exist");
        }
        return allUsers.get(index);
    }
}
