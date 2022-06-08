package ru.gb.siyanov.network_chat;
public record ServerLauncher() {
    public static void main(String[] args) {
        new ChatServer().run();
    }
}