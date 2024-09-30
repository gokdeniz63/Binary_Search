import java.util.*;
import java.lang.*;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Arrays.sort;


 class  Sınıf {
	 private static Scanner tara;
	 static int A[]= {2,3,4,6,7,12,34,67,89};
	 static int ikiliara(int A[], int N, int ara) {
		 int orta, alt=0, ust=N-1;
		 while(alt<=ust) {
			 orta=(alt+ust)/2;
			 if(ara>A[orta])
				 alt=orta+1;
			 else if(ara<A[orta])
				 ust=orta-1;
			 else
				 return 1;
		 }
		 return 0;
	 }
	 
    public static void main(String[] args) {
    	int aranan, bayrak=0;
    	out.print("Aranan sayı: ");
    	aranan=new Scanner(System.in).nextInt();
    	bayrak=ikiliara(A,A.length,aranan);
    	if(bayrak==1)
    	out.println("Aranan sayı bulundu");
    	else
    		out.println("Aranan sayı bulunmadı");
    	
    }
}
