package com.brunoyam.Lesson7.Interfaces.ex2;

public class Telegram implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("����������� ��������� � ��������!");
    }

    @Override
    public void getMessage() {
        System.out.println("������ ��������� � ��������!");
    }
}
