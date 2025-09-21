package service;

public interface Payments {
    void pay(long amount);
    void refund (long amount);
}
