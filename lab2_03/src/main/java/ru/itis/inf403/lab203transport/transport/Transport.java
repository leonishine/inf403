package ru.itis.inf403.lab203transport.transport;

public abstract class Transport {
    protected String number;
    protected String routeNumber;
    protected String workTimeBegin;
    protected String workTimeEnd;

    public Transport() {
    }

    public Transport(String number, String routeNumber, String workTimeBegin,  String workTimeEnd) {
        this.number = number;
        this.workTimeBegin = workTimeBegin;
        this.routeNumber = routeNumber;
        this.workTimeEnd = workTimeEnd;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getWorkTimeEnd() {
        return workTimeEnd;
    }

    public void setWorkTimeEnd(String workTimeEnd) {
        this.workTimeEnd = workTimeEnd;
    }

    public String getWorkTimeBegin() {
        return workTimeBegin;
    }

    public void setWorkTimeBegin(String workTimeBegin) {
        this.workTimeBegin = workTimeBegin;
    }
}
