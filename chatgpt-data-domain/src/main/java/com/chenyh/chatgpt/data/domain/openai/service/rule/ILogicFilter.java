package com.chenyh.chatgpt.data.domain.openai.service.rule;

import com.chenyh.chatgpt.data.domain.openai.model.aggregates.ChatProcessAggregate;
import com.chenyh.chatgpt.data.domain.openai.model.entity.RuleLogicEntity;

/**
 * @description 规则过滤接口
 */
public interface ILogicFilter<T> {

    RuleLogicEntity<ChatProcessAggregate> filter(ChatProcessAggregate chatProcess, T data) throws Exception;

}
