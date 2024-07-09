package bank.ui.graphic;

import bank.business.impl.AccountOperationServiceImpl;
import bank.business.domain.ATM;
import bank.ui.BankInterface;
import bank.ui.text.UIUtils;

public class ATMGUIInterface implements BankInterface {

    private ATM atm;
    private AccountOperationServiceImpl accountOperationService;

    public ATMGUIInterface(ATM atm, AccountOperationServiceImpl accountOperationService) {
        this.atm = atm;
        this.accountOperationService = accountOperationService;
    }

    @Override
    public void createAndShowUI() {
        // Implement GUI creation and display logic here
        System.out.println("Creating GUI for ATM: " + atm.getName());
        // Example: UIUtils.createATMGUI(atm, accountOperationService);
    }
}
