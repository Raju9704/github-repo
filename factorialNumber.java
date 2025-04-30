class Fact{
public static void main(){
int a=5;
int num=fact(a);
System.out.println(num);
}
private static int fact(int a){
 if(a == 1){
  return 1;
 } else{
  return (a*fact(a-1));
 }
	 

}
}
