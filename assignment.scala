object assignment extends App{
  
  def temperatureconvert(a:Double)=a*1.8000 + 32.00;
  println("Temperature in Fahrenheit : " );
  println(temperatureconvert(35));
  println("\n"); 

  def volumeofsphere(r:Double)=(Math.PI*r*r*r*4)/3;
  println("Volume of Sphere : ");
  println(volumeofsphere(5));
  println("\n");


  def total(c:Int):Double=if(c>50){24.95*c+ (24.95*40*c/100)+3+(c-50)*0.75} else{24.95*c+(24.95*40*c/100)+3};
  println("Total wholesale cost");
  println(total(60));
  println("\n");







}
