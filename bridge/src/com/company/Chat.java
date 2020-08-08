package com.company;

public abstract class Chat {

    protected ChatType chatType;

    protected Chat(ChatType chatType) {
        this.chatType = chatType;
    }

    public String getResponseText() {
        return "Halo selamat pagi kak, ada yang bisa aku bantu?";
    }
}
