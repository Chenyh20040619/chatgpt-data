package com.chenyh.chatgpt.data.domain.openai.model.aggregates;

import com.chenyh.chatgpt.data.domain.openai.model.entity.MessageEntity;
import com.chenyh.chatgpt.data.domain.openai.model.valobj.GenerativeModelVO;
import com.chenyh.chatgpt.data.types.common.Constants;
import com.chenyh.chatgpt.data.types.enums.ChatGPTModel;
import com.chenyh.chatgpt.data.types.enums.OpenAiChannel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatProcessAggregate {

    /** 用户ID */
    private String openid;
    /** 默认模型 */
    private String model = ChatGPTModel.GPT_3_5_TURBO.getCode();
    /** 问题描述 */
    private List<MessageEntity> messages;

    public boolean isWhiteList(String whiteListStr) {
        String[] whiteList = whiteListStr.split(Constants.SPLIT);
        for (String whiteOpenid : whiteList) {
            if (whiteOpenid.equals(openid)) return true;
        }
        return false;
    }

    public OpenAiChannel getChannel(){
        return OpenAiChannel.getChannel(this.model);
    }

    public GenerativeModelVO getGenerativeModelVO() {
        switch (this.model) {
            case "dall-e-2":
            case "dall-e-3":
                return GenerativeModelVO.IMAGES;
            default:
                return GenerativeModelVO.TEXT;
        }
    }

}
