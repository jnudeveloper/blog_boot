package com.jnudeveloper.blog.entity;

import com.jnudeveloper.blog.domain.Post;

import java.util.ArrayList;
import java.util.List;

public class PostEntity {
    private int id;
    private String title;
    private String summary;
    private String content;
    private int status;
    private int createTime;
    private int updateTime;
    private int authorId;
    private int approveNum;
    private int collectNum;
    private int commentNum;

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

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getApproveNum() {
        return approveNum;
    }

    public void setApproveNum(int approveNum) {
        this.approveNum = approveNum;
    }

    public int getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(int collectNum) {
        this.collectNum = collectNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", create_time=" + createTime +
                ", update_time=" + updateTime +
                ", author_id=" + authorId +
                ", approve_num=" + approveNum +
                ", collect_num=" + collectNum +
                ", comment_num=" + commentNum +
                '}';
    }
}
