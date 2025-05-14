package Models;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Bill {

    private int id;
    private String billNumber;
    private Ticket ticket;
    private LocalDateTime exitTime  ;
    private int amount;
    private Operator operator;
    private Gate gate;
    private BillStatus billStatus;
    private List<Payment> paymentList;

    public Bill(int id, String billNumber, Ticket ticket, LocalDateTime exitTime, int amount, Operator operator, Gate gate, BillStatus billStatus, List<Payment> paymentList) {
        this.id = id;
        this.billNumber = billNumber;
        this.ticket = ticket;
        this.exitTime = exitTime;
        this.amount = amount;
        this.operator = operator;
        this.gate = gate;
        this.billStatus = billStatus;
        this.paymentList = paymentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getTime() {
        return exitTime;
    }

    public void setTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
}
