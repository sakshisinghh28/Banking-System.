package bank.ui.text;

import bank.business.domain.ATM;
import bank.business.domain.Branch;
import bank.business.AccountManagementService;
import bank.business.impl.AccountOperationServiceImpl;

public class UIUtils {

    private static UIUtils instance = new UIUtils();

    private UIUtils() {
        // Private constructor to prevent instantiation
    }

    public static UIUtils getInstance() {
        return instance;
    }

    public void createATMGUI(ATM atm, AccountOperationServiceImpl accountOperationService) {
        // Implement ATM GUI creation logic
        System.out.println("Creating GUI for ATM: " + atm.getName());
    }

    public void createBranchGUI(Branch branch, AccountManagementService accountManagementService, AccountOperationServiceImpl accountOperationService) {
        // Implement Branch GUI creation logic
        System.out.println("Creating GUI for Branch: " + branch.getName());
    }

    // Add more utility methods as needed for UI operations
}
