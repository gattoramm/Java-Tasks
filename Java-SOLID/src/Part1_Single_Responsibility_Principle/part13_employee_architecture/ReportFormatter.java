package Part1_Single_Responsibility_Principle.part13_employee_architecture;

public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object o, FormatType formatType) {
        switch (formatType) {
            case XML -> formattedOutput = convertObjectToXML(o);
            case CSV -> formattedOutput = convertObjectToCSV(o);
        }
    }

    private String convertObjectToXML(Object o) {
        return "converted to XML " + o.toString();
    }

    private String convertObjectToCSV(Object o) {
        return "converted to CSV " + o.toString();
    }
}
