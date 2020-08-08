package com.company;

public class PaymentConfirmationChat {
    protected ChatType chatType;

    protected PaymentConfirmationChat(ChatType chatType) {
        this.chatType = chatType;
    }

    private String orderNum;

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getResponseText() {
        return "Udah yakin nih kak mau bayar pemesanan dengan nomer " + orderNum + "?";
    }
}
