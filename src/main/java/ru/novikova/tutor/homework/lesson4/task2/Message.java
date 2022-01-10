package ru.novikova.tutor.homework.lesson4.task2;

import ru.novikova.tutor.homework.lesson4.task2.canals.Canal;
import ru.novikova.tutor.homework.lesson4.task2.canals.CanalsRepository;
import ru.novikova.tutor.homework.lesson4.task2.inputMessage.AttachedMessage;
import ru.novikova.tutor.homework.lesson4.task2.inputMessage.AttachedMessagesRepository;

import java.util.ArrayList;
import java.util.Date;

public class Message {
    private String name;
    private Date date;
    private String text;
    private ArrayList<Canal> canals;
    private ArrayList<AttachedMessage> attachedMessages;

    public Message(String name, Date date, String text, CanalsRepository canals, AttachedMessagesRepository amr) {
        this.name = name;
        this.date = date;
        this.text = text;
        this.canals = canals.getCanals();
        this.attachedMessages = amr.getAttachedMessages();
    }

    public ArrayList<Canal> getCanals() {
        return canals;
    }

    public ArrayList<AttachedMessage> getAttachedMessages() {
        return attachedMessages;
    }

    @Override
    public String toString() {
        return "от отправителя: " + name + "\n Дата отправления: " + date +
                "\n Текст сообщения: " + text;
    }
}
