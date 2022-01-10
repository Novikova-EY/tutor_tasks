package ru.novikova.tutor.homework.lesson4.task2.inputMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AttachedMessagesRepository {
    private AttachedMessage[] attachedMessage;
    private ArrayList<AttachedMessage> attachedMessages;

    public AttachedMessagesRepository(AttachedMessage... attachedMessages) {
        this.attachedMessage = attachedMessages;
    }

    public ArrayList<AttachedMessage> getAttachedMessages() {
        attachedMessages = new ArrayList<>(Arrays.asList(attachedMessage));
        return attachedMessages;
    }
}
