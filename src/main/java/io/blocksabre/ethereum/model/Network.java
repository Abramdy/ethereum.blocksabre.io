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

    private Network(int network) {
        this.network = network;
    }

    private int getNetwork() {
        return network;
    }
}