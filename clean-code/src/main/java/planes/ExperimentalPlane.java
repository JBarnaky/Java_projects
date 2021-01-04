package planes;

import models.ExperimentalType;
import models.ClassificationLevel;

import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalType experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalType experimentalType, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.classificationLevel = classificationLevel;
    }


    public ExperimentalType getExperimentalType() { return experimentalType; }
    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setExperimentalType(ExperimentalType experimentalType) { this.experimentalType = experimentalType; }
    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                "experimentalPlane{" +
                        "type = " + experimentalType + '\'' +
                        ", classificationLevel = " + classificationLevel +
                        '}');
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ExperimentalPlane)) return false;
        if (!super.equals(obj)) return false;
        ExperimentalPlane plane = (ExperimentalPlane) obj;
        return experimentalType == plane.experimentalType &&
                classificationLevel == plane.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalType, classificationLevel);
    }

}
