package VisitorPattern.Exercise;

public interface Filters {
    void apply(FormatSegment formatSegment);
    void apply(FactSegment factSegment);
}
