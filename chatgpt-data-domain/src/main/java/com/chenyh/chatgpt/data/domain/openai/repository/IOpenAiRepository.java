package com.chenyh.chatgpt.data.domain.openai.repository;

import com.chenyh.chatgpt.data.domain.openai.model.entity.UserAccountQuotaEntity;

/**
 * @description OpenAi 仓储接口
 */
public interface IOpenAiRepository {

    int subAccountQuota(String openai);

    UserAccountQuotaEntity queryUserAccount(String openid);

}
