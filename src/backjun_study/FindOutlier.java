package backjun_study;

public class FindOutlier{
  static int find(int[] integers){
    int odd = 0;
    int even = 0;
    int result = 0;
    
    for(int i=0; i<integers.length; i++) {
      if(integers[i]%2==0||integers[i]==0) even++;
      else odd++;
    }
     for(int i=0; i<integers.length; i++) {
       if(odd>=2&&integers[i]%2==0) {
          result=integers[i];
       }
       else if(even>=2&&integers[i]%2!=0) {
         result=integers[i];
       }
     }
  return result;
}  

}