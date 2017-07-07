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
    int transactionCount;

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

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactions) {
        this.transactionCount = transactions;
    }

    @Override
    public String toString() {
        return "AddressRecord{" +
                "address='" + address + '\'' +
                ", balance=" + balance +
                ", transactionCount=" + transactionCount +
                '}';
    }
}
