package cn.juechuang.model;


public class Commodity {

  private String sid;
  private Integer twoid;
  private String sname;
  private float sprice;
  private String sadress;

  public Commodity() {
  }
  public Commodity(String sid, Integer twoid, String sname, float sprice, String sadress) {
    this.sid = sid;
    this.twoid = twoid;
    this.sname = sname;
    this.sprice = sprice;
    this.sadress = sadress;
  }

  public String getSid() {
    return sid;
  }
  public void setSid(String sid) {
    this.sid = sid;
  }
  public Integer getTwoid() {
    return twoid;
  }
  public void setTwoid(Integer twoid) {
    this.twoid = twoid;
  }
  public String getSname() {
    return sname;
  }
  public void setSname(String sname) {
    this.sname = sname;
  }
  public float getSprice() {
    return sprice;
  }
  public void setSprice(float sprice) {
    this.sprice = sprice;
  }
  public String getSadress() {
    return sadress;
  }
  public void setSadress(String sadress) {
    this.sadress = sadress;
  }

  @Override
  public String toString() {
    return "Commodity{" +
            "sid='" + sid + '\'' +
            ", twoid=" + twoid +
            ", sname='" + sname + '\'' +
            ", sprice=" + sprice +
            ", sadress='" + sadress + '\'' +
            '}';
  }
}
