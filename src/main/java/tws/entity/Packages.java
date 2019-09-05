package tws.entity;

import java.io.Serializable;

public class Packages {
    private String packageId;
    private String name;
    private String telephone;
    private String weight;
    private int status;
    private String dateTime;

    public Packages() {
    }

    public Packages(String packageId, String name, String telephone, String weight, int status, String dateTime) {
        this.packageId = packageId;
        this.name = name;
        this.telephone = telephone;
        this.weight = weight;
        this.status = status;
        this.dateTime = dateTime;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Packages{" +
                "packageId='" + packageId + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", weight='" + weight + '\'' +
                ", status=" + status +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
