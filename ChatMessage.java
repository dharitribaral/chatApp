package com.ChatApp.ChatApp.chat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;


}