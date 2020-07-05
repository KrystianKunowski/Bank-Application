/*
	Krystian Kunowski
	Student ID : B00123405
	Technological University Dublin
	Assignment 2 
	Software Development 2

*/

import java.io.*; 
//import java input/output stream

public class CreateBankFile
//creating a class called CreateBankFile
 {
  private Record blank;
  private RandomAccessFile file;
//initialize variable

  public CreateBankFile()
//creating a method called CreateBankFile
   {
    blank = new Record();

  try
   {

    file = new RandomAccessFile( "bank.dat", "rw" );

    for (int i=0; i<100; i++)
    blank.write( file );

   }
//creating a RandomAccessFile "bank.dat" and
//writing 100 empty records into file
  
  catch(IOException e)

  {

   System.err.println("File not opened properly\n" + e.toString() );

   System.exit( 1 );

  }
//creating a catch IOException to display and track any errors
}
  

public static void main( String [] args )
//creating a main method
{
	CreateBankFile employees = new CreateBankFile();
}

}
