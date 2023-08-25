package bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Bank {
    private String name;
    private int capacity;
    private Collection<Client> clients;

    public Bank(String name, int capacity){
        this.setCapacity(capacity);
        this.setName(name);
        this.clients = new ArrayList<>();
    }
// TODO returns correct name // Done
    public String getName() {
        return name;
    }

    // TODO throws exception when name is null // DOne
    // TODO throws exception when name is white space // DOne
    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException("Invalid name!");
        }
        this.name = name;
    }
// TODO returns capacity //Done
    public int getCapacity() {
        return capacity;
    }
    // TODO throws exception when capacity to be set is less than 0 // DOne

    private void setCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Invalid capacity!");
        }
        this.capacity = capacity;
    }
// TODO returns correct size // Done
    public int getCount() {
        return this.clients.size();
    }
    // TODO throws exception when capacity is full // Done
    //TODO adds the client to the list // Done
    public void addClient(Client client){
        if (this.clients.size() == this.capacity){
            throw new IllegalArgumentException("The bank has no capacity for more clients!");
        }
        this.clients.add(client);
    }
    // TODO throws exception when client is null // Done
    // TODO removes the client if the name matched // Done
    public void removeClient(String name) {
        Client clientToRemove = this.clients.stream()
                .filter(f -> name.equals(f.getName()))
                .findAny()
                .orElse(null);
        if (clientToRemove == null){
            throw new IllegalArgumentException(String.format("Client named %s does not exist!", name));
        }
        this.clients.remove(clientToRemove);
    }
    // TODO throws exception when client is null //Done
    //TODO returns client if matched names //Done
    public Client loanWithdrawal(String name){
        Client client = this.clients.stream()
                .filter(f -> name.equals(f.getName()))
                .findAny()
                .orElse(null);
        if (client == null){
            throw new IllegalArgumentException(String.format("Client named %s does not exist!", name));
        }
        client.setApprovedForLoan(false);

        return client;
    }
    // TODO returns the correct stats // Done
    public String statistics(){
        String names = this.clients.stream().map(Client::getName).collect(Collectors.joining(", "));
        return String.format("The client %s is at the %s bank!", names, this.name);
    }

}
