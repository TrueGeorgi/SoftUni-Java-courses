package bank.core;

import bank.common.Command;
import bank.entities.client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EngineImpl implements Engine {
    private Controller controller;
    private BufferedReader reader;

    public EngineImpl() {
        this.controller = new ControllerImpl(); //TODO implement first
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        while (true) {
            String result = null;
            try {
                result = processInput();

                if (result.equals("End")) {
                    break;
                }
            } catch (NullPointerException | IllegalArgumentException | IllegalStateException | IOException e) {
                result = e.getMessage();
            }

            System.out.println(result);
        }
    }

    private String processInput() throws IOException {
        String input = this.reader.readLine();
        String[] tokens = input.split("\\s+");

        Command command = Command.valueOf(tokens[0]);
        String result = null;
        String[] data = Arrays.stream(tokens).skip(1).toArray(String[]::new);

        switch (command) {
            case AddBank:
                result = addBank(data);
                break;
            case AddLoan:
                result = addLoan(data);
                break;
            case ReturnedLoan:
                result = returnedLoan(data);
                break;
            case AddClient:
                result = addClient(data);
                break;
            case FinalCalculation:
                result = finalCalculation(data);
                break;
            case Statistics:
                result = getStatistics();
                break;
            case End:
                result = Command.End.name();
                break;
        }
        return result;
    }

    private String addBank(String[] data) {
        String bankType = data[0];
        String bankName = data[1];
        return controller.addBank(bankType, bankName);
    }
    private String addLoan(String[] data) {
        String loanType = data[0];
        return controller.addLoan(loanType);
    }

    private String returnedLoan(String[] data) {
        String bankName = data[0];
        String loanType = data[1];
        return controller.returnedLoan(bankName, loanType);
    }

    private String addClient(String[] data) {
       String bankName = data[0];
       String clientType = data[1];
       String clientName = data[2];
       String clientId = data[3];
       double clientIncome = Double.parseDouble(data[4]);
       return controller.addClient(bankName,clientType, clientName, clientId, clientIncome);
    }

    private String finalCalculation(String[] data) {
       String bankName = data[0];
       return controller.finalCalculation(bankName);
    }

    private String getStatistics() {
        return this.controller.getStatistics();
    }
}

