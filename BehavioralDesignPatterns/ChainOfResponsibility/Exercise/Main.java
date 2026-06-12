package BehavioralDesignPatterns.ChainOfResponsibility.Exercise;

public class Main {
    public static void main(String[] args) {
        var qbw = new QBWReader(null);
        var num = new NumbersReader(qbw);
        var xls = new XLSReader(num);
        var reader = new DataReader(xls);
        reader.read("abcd.xls");
        reader.read("abcd.numbers");
        reader.read("abcd.qbw");
        reader.read("abcd.abcd");
    }
}
