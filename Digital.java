public class Digital extends Photos {

private int resolution;
private double fileSize;

  
// No Argument Constructor
  public Digital(){
    this.resolution = 24;
    this.fileSize = 200;
  }

    //Parameterized Constructor
  public Digital(String location, String photographer, boolean flash, int iso, int resolution, double fileSize){
    super(location, photographer, flash, iso); 
    this.resolution=resolution;
    this.fileSize=fileSize;
  }

  //Accessor Methods
  public int getResolution() {
    return resolution;
  }

  public double getFileSize() {
    return fileSize;
  }

//toString Method
  public String toString() {
    return super.toString() + ", Resolution: " + resolution + ", File Size: " + fileSize;
  }

}
  
