package com.chenyh.chatgpt.data.domain.openai.service.channel;

import com.chenyh.chatgpt.data.domain.openai.model.aggregates.ChatProcessAggregate;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import java.io.IOException;

/**
 * @description 服务组
 */
public interface OpenAiGroupService {

    void doMessageResponse(ChatProcessAggregate chatProcess, ResponseBodyEmitter emitter) throws Exception;

}
