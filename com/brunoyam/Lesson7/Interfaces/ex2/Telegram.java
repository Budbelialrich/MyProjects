package com.brunoyam.Lesson7.Interfaces.ex2;

public class Telegram implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Отпрравляем сооьщение в Телеграм!");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение в Телеграм!");
    }
}
