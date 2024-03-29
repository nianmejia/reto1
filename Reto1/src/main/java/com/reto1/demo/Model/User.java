package com.reto1.demo.Model;


import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements IUser {
    @ApiParam(value = "User id to follow",   example = "1570")
    int id;
    String name;
    List<User> followers = new ArrayList<>();
    List<User> followed = new ArrayList<>();
    List<Post> posts = new ArrayList<>();

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void followPages(User page) {
        followed.add(page);
    }

    @Override
    public void addFollower(User follower) {
        followers.add(follower);
    }

    @Override
    public void unFollowPages(IUser iuser) {
        followed.remove(iuser);
    }

    @Override
    public void removeFollower(IUser follower) {
        followers.remove(follower);
    }

    public void addPost(Post post){
        posts.add(post);
    }
}
