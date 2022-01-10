package ru.novikova.tutor.homework.lesson4.task2;

import ru.novikova.tutor.homework.lesson4.task2.canals.Canal;
import ru.novikova.tutor.homework.lesson4.task2.canals.Email;
import ru.novikova.tutor.homework.lesson4.task2.canals.Facebook;
import ru.novikova.tutor.homework.lesson4.task2.canals.Sms;
import ru.novikova.tutor.homework.lesson4.task2.inputMessage.Document;
import ru.novikova.tutor.homework.lesson4.task2.inputMessage.AttachedMessage;
import ru.novikova.tutor.homework.lesson4.task2.inputMessage.Picture;

public class Converter {
    private Message[] message;

    public Converter(Message ... message) {
        this.message = message;
    }

    public void sendMessage() {

        for (Message message : this.message) {
            for (Canal canal : message.getCanals()) {
                if (canal.getClass().equals(Email.class)) {
                    System.out.println("Тип сообщения: " + canal);
                    System.out.println("Сообщение " + message);
                    for (AttachedMessage messageType : message.getAttachedMessages()) {
                        System.out.println("Вложенный(е) файл(ы): " + messageType);
                    }
                } else if (canal.getClass().equals(Facebook.class)) {
                    System.out.println("Тип сообщения: " + canal);
                    System.out.println("Сообщение " + message);
                    for (AttachedMessage messageType : message.getAttachedMessages()) {
                        if (messageType.getClass().equals(Picture.class) ||
                                messageType.getClass().equals(Document.class)) {
                            System.out.println("Вложенный(е) файл(ы): " + messageType);
                        }
                    }
                } else if (canal.getClass().equals(Sms.class)) {
                    System.out.println("Тип сообщения: " + canal);
                    System.out.println("Сообщение " + message);
                }
                System.out.println();
            }
        }
    }
}
