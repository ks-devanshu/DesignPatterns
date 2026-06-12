package BehavioralDesignPatterns.TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        Task taskOne = new TransferMoneyTask();
        Task taskTwo = new GenerateReportTask(new AuditTrail());
        taskOne.execute();
        taskTwo.execute();
    }
}
