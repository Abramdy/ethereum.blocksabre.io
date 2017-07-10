package io.blocksabre.ethereum.model;

/**
 * The Network enumeration details the Ethereum
 * network
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-07-10
 */

public enum Network {
    ETHEREUM_MAINNET(1),
    MORDEN_TESTNET(2),
    ROPSTEN_TESTNET(3),
    RINKEBY_TESTNET(4),
    KOVAN_TESTNET(5);

    private int network;

    Network(int network) {
        this.network = network;
    }

    private int getNetwork() {
        return network;
    }

    @Override
    public String toString() {
        switch(this) {
            case ETHEREUM_MAINNET: return "Ethereum Mainnet";
            case MORDEN_TESTNET: return "Morden Testnet";
            case ROPSTEN_TESTNET: return "Ropsten Testnet";
            case RINKEBY_TESTNET: return "Rinkeby Testnet";
            case KOVAN_TESTNET: return "Kovan Testnet";
            default: throw new IllegalArgumentException();
        }
    }

}