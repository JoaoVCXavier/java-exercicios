class Main {
  public static void main(String[] args) {
   String[] a = {"x","y","y","x"};
   String[] b = {"red","black","black","red"};
   Boolean a1 = a[0].equals(a[1]); 
   Boolean a2 = a[0].equals(a[2]);
   Boolean a3 = a[0].equals(a[3]);
   Boolean a4 = a[1].equals(a[2]);
   Boolean a5 = a[1].equals(a[3]);
   Boolean a6 = a [2].equals(a[3]);

    Boolean b1 = b[0].equals(b[1]);
    Boolean b2 = b[0].equals(b[2]);
    Boolean b3 = b[0].equals(b[3]);
    Boolean b4 = b[1].equals(b[2]);
    Boolean b5 = b[1].equals(b[3]);
    Boolean b6 = b[2].equals(b[3]);

    Boolean p1 = (a1==b1);
    Boolean p2 = (a2==b2);
    Boolean p3 = (a3==b3);
    Boolean p4 = (a4==b4);
    Boolean p5 = (a5==b5);
    Boolean p6 = (a6==b6);

    if (p1 == true && p2 == true && p3 == true && p4 == true && p5 == true && p6 == true){
  System.out.println("As string pssui um padrão");
}  
    else {
  System.out.println("As strings não possui um padrão");
  
      }  
  }
}

