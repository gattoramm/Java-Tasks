package ITVDN.Part2_Open_Closed_Principle.part21_loan_ocp_handler;

public class LoanApprovalHandler {
    public void approvePersonalLoan(PersonalLoanValidator validator) {
        if(validator.isValid()) {
            //Process the load
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator) {
        if(validator.isValid()) {
            //Process to load
        }
    }
}

class PersonalLoanValidator {
    public boolean isValid() {
        // Validation logic
        return true;
    }
}

class VehicleLoanValidator {
    public boolean isValid() {
        // Validation logic
        return true;
    }
}