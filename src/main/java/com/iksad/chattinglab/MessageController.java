package com.iksad.chattinglab;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MessageController {
    private final SimpMessageSendingOperations simpMessageSendingOperations;

    @MessageMapping("/chat/text")
    public void chatText(TextRequestDTO request) {
        String destinationBuilder = "/sub/chatrooms/%s";
        String destination = String.format(destinationBuilder, request.to());
        simpMessageSendingOperations.convertAndSend(destination, request.data());
    }

    @MessageMapping("/chat/image")
    public void chatImage(ImageRequestDTO request) {
        String destinationBuilder = "/sub/chatrooms/%s";
        String destination = String.format(destinationBuilder, request.to());
        simpMessageSendingOperations.convertAndSend(destination, request.data());
    }
}
