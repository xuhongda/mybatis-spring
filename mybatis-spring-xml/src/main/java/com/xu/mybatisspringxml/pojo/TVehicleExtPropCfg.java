package pojo;

public class TVehicleExtPropCfg {
    private String vehicleId;

    private Integer castrolVehicleUsage;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId == null ? null : vehicleId.trim();
    }

    public Integer getCastrolVehicleUsage() {
        return castrolVehicleUsage;
    }

    public void setCastrolVehicleUsage(Integer castrolVehicleUsage) {
        this.castrolVehicleUsage = castrolVehicleUsage;
    }
}