package ITVDN.Part1_Single_Responsibility_Principle.part13_employee_architecture;

public class EmployeeReportFormatter extends ReportFormatter{

    public EmployeeReportFormatter(Object o, FormatType formatType) {
        super(o, formatType);
    }

    public String getFormattedEmployee() {
        return formattedOutput;
    }


}
