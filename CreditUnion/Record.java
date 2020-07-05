/*
	Krystian Kunowski
	Student ID : B00123405
	Technological University Dublin
	Assignment 2 
	Software Development 2

*/

import java.io.*;
//import java input/output stream

public class Record
//creating a class called Record
{
private int accountID;
private String firstNameID;
private String lastNameID;
private double balance;
private double limitOverDraft;
//initialize variable

public void read( RandomAccessFile file ) throws IOException
//creating a method called read ( reading records from file )
{
accountID = file.readInt();

char first[] = new char[15];

for ( int i=0; i < first.length; i++ )
		first[ i ] = file.readChar();

lastNameID = new String (first);

char last[] = new char[15];

for (int i =0; i<last.length; i++)
		last[i] = file.readChar();

firstNameID = new String (last);

balance = file.readDouble();
limitOverDraft = file.readDouble();
}
public void write( RandomAccessFile file) throws IOException
//creating a method called write ( writing records into file )
{
StringBuffer buf;

file.writeInt( accountID );

if (lastNameID != null)
		buf = new StringBuffer( lastNameID);

else
buf = new StringBuffer( 15 );

buf.setLength( 15 );

file.writeChars( buf.toString() );

if ( firstNameID != null )
buf = new StringBuffer( firstNameID );
else
buf = new StringBuffer( 15);

buf.setLength( 15 );

file.writeChars( buf.toString() );

file.writeDouble( balance);
if (lastNameID != null)

file.writeDouble( limitOverDraft );


}

public void setAccountID( int a ) { accountID = a; }

public int getAccounts() { return accountID;}

public void setFirstName( String f) {lastNameID = f;}

public String getFirstName() { return lastNameID; }

public void setLastName ( String l) { firstNameID = l; }

public String getLastName() { return firstNameID; }

public void setBalancePay( double b) {balance=b;}

public double getBalance() {return balance;}

public void setlimitOverDraft( double c) {limitOverDraft = c;}

public double getlimitOverDraft() {return limitOverDraft;}

public static int size() { return 80;}
//creating a methods to write/read records from/into fail
}


