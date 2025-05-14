package Models;

import java.util.List;

public class Payment {

    private int id;
    private String transactionId;
    private PaymentStatus paymentStatus;
    private List<PaymentMode> paymentModes;

    public Payment(int id, String transactionId, PaymentStatus paymentStatus, List<PaymentMode> paymentModes) {
        this.id = id;
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus;
        this.paymentModes = paymentModes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public List<PaymentMode> getPaymentModes() {
        return paymentModes;
    }

    public void setPaymentModes(List<PaymentMode> paymentModes) {
        this.paymentModes = paymentModes;
    }
}
