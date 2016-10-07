package unlv.erc.emergo.model;

import com.orm.SugarRecord;

public class HealthUnit extends SugarRecord {

  private Double latitude = 0.0;
  private Double longitude = 0.0;
  private String nameHospital = "" ;
  private String unitType = "";
  private String addressNumber = "";
  private String district = "";
  private String state = "";
  private String city = "";
  private Float distance = 0f;


  public HealthUnit(){
it
  }

  /**
   * This methods set the information about the health unit.
   * @param latitude latitude coordinate of health unit
   * @param longitude longitude coordinate of health unit
   * @param nameHospital The name of health unit
   * @param unitType type of health unit
   * @param addressNumber Address of health unit
   * @param district health unit district
   * @param state health unit state
   * @param city health unit city
   */

  public HealthUnit(Double latitude, Double longitude, String nameHospital, String unitType,
                      String addressNumber, String district, String state, String city) {

    setLatitude(latitude);
    setLongitude(longitude);
    setNameHospital(nameHospital);
    setUnitType(unitType);
    setAddressNumber(addressNumber);
    setDistrict(district);
    setState(state);
    setCity(city);
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public String getNameHospital() {
    return nameHospital;
  }

  public void setNameHospital(String nameHospital) {
    this.nameHospital = nameHospital;
  }

  public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }

  public String getAddressNumber() {
    return addressNumber;
  }

  public void setAddressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }
}