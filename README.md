# Banking-System.
# Banking Application

This is a Java-based banking application that supports multiple account types, user authentication, transaction history, and various banking operations. The application uses JavaFX for the GUI and follows standard naming conventions and design principles.

## Features

- User Authentication
- Multiple Account Types (Savings, Current)
- Deposit and Withdrawal Operations
- Transaction History
- Interest Calculation
- Enhanced Error Handling and Validation
- GUI with JavaFX
- Integration with External Services (planned)
- Logging with Log4j

## Project Structure
banking-application/
├── src/
│ ├── bank/
│ │ ├── Bank.java
│ │ ├── Database.java
│ │ ├── UIUtils.java
│ │ └── business/
│ │ ├── AccountManagementService.java
│ │ ├── AccountOperationService.java
│ │ ├── domain/
│ │ │ ├── AccountType.java
│ │ │ ├── BankAccount.java
│ │ │ ├── Transaction.java
│ │ └── impl/
│ │ ├── AccountManagementServiceImpl.java
│ │ └── AccountOperationServiceImpl.java
│ └── bank/
│ └── ui/
│ ├── BankInterface.java
│ ├── graphic/
│ │ ├── BankApp.java
│ │ ├── ATMGUIInterface.java
│ │ └── BranchGUIInterface.java
│ └── text/
│ └── UIUtils.java
├── lib/
│ └── log4j-1.2.17.jar
├── resources/
│ └── log4j.properties
└── README.md

