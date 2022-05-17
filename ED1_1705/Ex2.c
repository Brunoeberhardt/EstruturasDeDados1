 #include <stdio.h>

int main (){
 
    int i1 = 10;
    int i2 = 11;

    if (&i1 > &i2)
      {
	    printf ("i1 tem o maior endereco de memoria\n");
	        return;
      }
    printf ("i2 tem o maior endereco de memoria\n");
  
}