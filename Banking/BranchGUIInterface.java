package bank.ui.graphic;

import bank.business.AccountManagementService;
import bank.business.impl.AccountOperationServiceImpl;
import bank.business.domain.Branch;
import bank.ui.BankInterface;
import bank.ui.text.UIUtils;

public class BranchGUIInterface implements BankInterface {

    private Branch branch;
    private AccountManagementService accountManagementService;
    private AccountOperationServiceImpl accountOperationService;

    public BranchGUIInterface(Branch branch, AccountManagementService accountManagementService, AccountOperationServiceImpl accountOperationService) {
        this.branch = branch;
        this.accountManagementService = accountManagementService;
        this.accountOperationService = accountOperationService;
    }

    @Override
    public void createAndShowUI() {
        // Implement GUI creation and display logic here
        System.out.println("Creating GUI for Branch: " + branch.getName());
        // Example: UIUtils.createBranchGUI(branch, accountManagementService, accountOperationService);
    }
}
