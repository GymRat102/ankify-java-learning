package learnenum;

public class UseEnum {
  public static void main(String[] args) {
    System.out.println(Level.HIGH);
//    WEATHER weather = WEATHER.WARM;

//    switch(weather) {
//      case HOT:
//        System.out.println("The weather is hot");
//        break;
//      case COLD:
//        System.out.println("The weather is cold");
//        break;
//      case WARM:
//        System.out.println("The weather is warm");
//      default:
//        System.out.println("test break");
//    }
    for (WEATHER weather : WEATHER.values()) {
      System.out.println(weather);
    }
  }

  enum WEATHER {
    HOT,
    WARM,
    COLD
  }

}
