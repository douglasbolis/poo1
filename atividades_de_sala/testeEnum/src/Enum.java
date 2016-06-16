public enum Enum {
  A("first"), B("second"), C("third");
  private String test;

  Enum(String test) {
    this.test = test;
  }

  public String getEnum() {
    return test;
  }
}
