package io.blocksabre.ethereum.model;

/**
 * The AddressRecord class that contains details on an Ethereum
 * address.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.1
 * @since   2017-07-07
 */
public class AddressRecord {

    String address;
    Double balance;
    int transactions;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getTransactions() {
        return transactions;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "AddressRecord{" +
                "address='" + address + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
