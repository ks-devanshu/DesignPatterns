package BehavioralDesignPatterns.TemplateMethodPattern;

public class GenerateReportTask extends Task{
    public GenerateReportTask() {}

    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generate Report Task");
    }
}
