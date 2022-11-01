package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Comment;

import java.util.List;
import java.util.Map;


public interface CommentService extends IService<Comment> {
    public List<Map<String ,Object>> getCommentAndStudentByMomentId(String momentId);}