package com.chenyh.chatgpt.data.domain.auth.repository;

/**
 * @description 认证仓储服务
 */
public interface IAuthRepository {

    String getCodeUserOpenId(String code);

    void removeCodeByOpenId(String code, String openId);

}
