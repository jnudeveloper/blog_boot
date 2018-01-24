package com.jnudeveloper.blog.entity;

import com.jnudeveloper.blog.domain.Post;
import com.jnudeveloper.blog.thriftgen.domain.TPost;

public class PostEntity {
    private int id;
    private String title;
    private String summary;
    private String content;
    private int status;
    private int create_time;
    private int update_time;
    private int author_id;
    private int approve_num;
    private int collect_num;
    private int comment_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCreate_time() {
        return create_time;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }

    public int getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(int update_time) {
        this.update_time = update_time;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getApprove_num() {
        return approve_num;
    }

    public void setApprove_num(int approve_num) {
        this.approve_num = approve_num;
    }

    public int getCollect_num() {
        return collect_num;
    }

    public void setCollect_num(int collect_num) {
        this.collect_num = collect_num;
    }

    public int getComment_num() {
        return comment_num;
    }

    public void setComment_num(int comment_num) {
        this.comment_num = comment_num;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", author_id=" + author_id +
                ", approve_num=" + approve_num +
                ", collect_num=" + collect_num +
                ", comment_num=" + comment_num +
                '}';
    }

    public static TPost format(Post post){
        TPost tPost = new TPost();
        tPost.id = post.getId();
        tPost.title = post.getTitle();
        tPost.summary = post.getSummary();
        tPost.content = post.getContent();
        tPost.status = post.getStatus();
        tPost.create_time = post.getCreate_time();
        tPost.update_time = post.getUpdate_time();
        tPost.author_id = post.getAuthor_id();
        tPost.approve_num = post.getApprove_num();
        tPost.collect_num = post.getCollect_num();
        tPost.comment_num = post.getComment_num();

        return tPost;
    }
}
