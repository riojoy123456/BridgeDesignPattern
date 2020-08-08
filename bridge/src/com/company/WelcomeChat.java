package com.company;

public class WelcomeChat {
    protected ChatType chatType;

    protected WelcomeChat(ChatType chatType) {
        this.chatType = chatType;
    }

    public String getResponseText() {
        return "Halo selamat pagi kak, ada yang bisa aku bantu?";
    }
}
