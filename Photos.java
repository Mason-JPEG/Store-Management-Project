public class Photos {

private String location;
private String photographer;
private boolean flash;
private int iso;


  //No argument constructors
  public Photos(){
  this.location = "Mountains";
  this.photographer = "Mason";
  this.flash = false;
  this.iso = 650;
  }

  //Parameterized Constructor
  public Photos(String location, String photographer, boolean flash, int iso){
    this.location=location;
    this.photographer=photographer;
    this.flash=flash;
    this.iso=iso;
  }

  //Acessor Method
public String  getLocation(){
  return location;
}

public String getPhotographer() {
  return photographer;
}

 public boolean getFlash() {
   return flash;
 } 

  public int getIso() {
    return iso;
  }

  //toString Method
  public String toString() {
    return "Location : " + location + "Photographer: " + photographer + "Flash: " + flash + ", Iso: " + iso;
  }

  //set the methods
  public void setLocation(String location) {
    this.location = location;
  }

  public void setPhotographer(String photographer) {
    this.photographer = photographer;
  }

  public void setFlash(boolean flash) {
    this.flash = flash;
  }

  public void setIso(int iso) {
    this.iso = iso;
  }
  
}