package com.buguagaoshu.homework.evaluation.service;

/**
 * @author puzhiwei
 * 发送验证消息
 * */
public interface SendMessageService {

    void send(String key, String message);
}
