public class DiveKit {

    enum WaterType {
        saltWater, freshWater
    }
    enum MeasurementUnit {
        imperial, metric
    }

    WaterType waterType;
    MeasurementUnit measurementUnit;

    public  DiveKit() {
        this.waterType = WaterType.saltWater;
        this.measurementUnit = MeasurementUnit.imperial;
    }

    public  DiveKit(WaterType waterType, MeasurementUnit measurementUnit) {
        this.waterType = waterType;
        this.measurementUnit = measurementUnit;
    }

    public  DiveKit(WaterType waterType) {
        this.waterType = waterType;
        this.measurementUnit = MeasurementUnit.imperial;
    }

    public  DiveKit(MeasurementUnit measurementUnit) {
        this.waterType = WaterType.saltWater;
        this.measurementUnit = measurementUnit;
    }
}
