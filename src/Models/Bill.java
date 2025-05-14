package Models;

import java.sql.Time;
import java.util.List;

public class Bill {

    private int id;
    private String billNumber;
    private Ticket ticket;
    private Time time;
    private int amount;
    private Operator operator;
    private Gate gate;
    private BillStatus billStatus;
    private List<Payment> paymentList;

    public Bill(int id, String billNumber, Ticket ticket, Time time, int amount, Operator operator, Gate gate, BillStatus billStatus, List<Payment> paymentList) {
        this.id = id;
        this.billNumber = billNumber;
        this.ticket = ticket;
        this.time = time;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
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
