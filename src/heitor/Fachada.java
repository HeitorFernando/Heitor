public class Fachada {
  private static Fachada instance= null
  private Fachada(){
    public static  getInstance(){
      if (instance== null){
        this.instance=new Fachada();
      }
    }return instance;
  }
}
