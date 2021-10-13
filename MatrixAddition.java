package questions;

import java.util.Scanner;
// addition of two matrices

public class MatrixAddition{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Write m: ");
int m= sc.nextInt();
System.out.println("Write n: ");
int n= sc.nextInt();
int m1[][]= new int[m][n];
int m2[][]= new int[m][n];
System.out.println("Write m1 elements: ");
for(int i=0; i<m; i++){
for(int j=0; j<n; j++){
m1[i][j]= sc.nextInt();
}
}
System.out.println("Write m2 elements: ");
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
m2[i][j]= sc.nextInt();
}
}
int result[][]= new int[m][n];
for(int i=0; i<m; i++){
for(int j=0; j<n; j++){
result[i][j]= m1[i][j] + m2[i][j] ;
}
}
System.out.println("Result matrix is : ");
for(int i=0; i<m; i++){
for(int j=0; j<n; j++){
System.out.print(result[i][j]+ " ");
}
System.out.println();
}
}
}