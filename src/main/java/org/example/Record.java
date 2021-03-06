package org.example;
import java.util.Map;
import java.util.Objects;

public class Record {
    private final Map<String, Double> features;

    public Record(Map<String, Double> features) {
        this.features = features;
    }

    public Map<String, Double> getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        return "Record{" +
                "features=" + features +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Record)) return false;
        Record record = (Record) o;
        return Objects.equals(features, record.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features);
    }
}
