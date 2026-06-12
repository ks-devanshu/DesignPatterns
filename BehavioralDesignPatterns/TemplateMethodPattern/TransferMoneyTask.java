package BehavioralDesignPatterns.TemplateMethodPattern;

public class TransferMoneyTask extends Task{
    public TransferMoneyTask() {}

    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Money Transfer Task");
    }
}
