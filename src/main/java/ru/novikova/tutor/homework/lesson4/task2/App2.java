package ru.novikova.tutor.homework.lesson4.task2;

import ru.novikova.tutor.homework.lesson4.task2.canals.*;
import ru.novikova.tutor.homework.lesson4.task2.inputMessage.*;

import java.util.ArrayList;
import java.util.Date;

public class App2 {
    public static void main(String[] args) {

        CanalsRepository cr1 = new CanalsRepository(new Sms(), new Facebook());
        CanalsRepository cr2 = new CanalsRepository(new Sms(), new Email());
        AttachedMessagesRepository amr1 = new AttachedMessagesRepository(new AudioFile(), new Document());
        AttachedMessagesRepository amr2 = new AttachedMessagesRepository(new Picture(), new Document());

        Message message1 = new Message("Ivan", new Date(), "message 1", cr1, amr1);
        Message message2 = new Message("Pavel", new Date(), "message 2",cr1, amr2);
        Message message3 = new Message("Oleg", new Date(), "message 3",cr2, amr1);

        Converter converter = new Converter(message1, message2, message3);
        converter.sendMessage();
    }
}
