package diadiush.com.greencity_chat.dao.message;

import diadiush.com.greencity_chat.entity.Message;

import java.util.List;

public interface MessageDAO {
    List<Message> getAllMessagesByChatId(int chatId);

    Message findMessageById(int id);

    Message changeMessage(Message message);

    Message addMessage(Message message);

    void deleteMessage(int msgId);
}
