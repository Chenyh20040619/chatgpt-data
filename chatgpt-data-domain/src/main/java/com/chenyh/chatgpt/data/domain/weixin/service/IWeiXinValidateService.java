package com.chenyh.chatgpt.data.domain.weixin.service;

/**
 * @description 验签接口
 */
public interface IWeiXinValidateService {

    boolean checkSign(String signature, String timestamp, String nonce);

}
