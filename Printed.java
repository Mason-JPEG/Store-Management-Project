public class Printed extends Photos {

private String paperType;
private int width;
private int height;

//No Argument Constructor
  public Printed() {
    this.paperType = "Glossy";
    this.width = 6;
    this.height = 7;
  }

//Parameratized Constructors
    public Printed(String location, String photographer, boolean flash, int iso, String paperType, int width, int height){
    super(location, photographer, flash, iso); 
    this.paperType=paperType;
    this.width=width;
    this.height=height;
    }
  
  //Accessor Methods
  public String paperType() {
    return paperType;
  }

  public int width() {
    return width;
  }

  public int height() {
    return height;
  }

//toString Method
  public String toString() {
    return super.toString() + ", Paper Type: " + paperType + "Width: " + width + ", Height: " + height;
  }

}

