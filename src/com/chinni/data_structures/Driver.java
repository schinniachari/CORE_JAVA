package com.chinni.data_structures;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Driver {
	private static FileWriter objFileWriter;
	private static BufferedWriter objBufferedWriter ;
	private static Vector<Integer>  inputData ;      // all keys from the input file
	private static Vector<Integer>  ascendingData;   // sorted data in ascending order
	private static Vector<Integer> descendingData;// sorted data in descending order
	 private static Vector<Integer> testData ;

	public static void main(String[] args) {
		String inputfile="/in.txt";
		String outputfile="/out.txt";
		inputData=new Vector<>();
		ascendingData=new Vector<>();
		descendingData=new Vector<>();
		testData = new Vector();
		
		String sFilePath = "/home/azeez/f_drive_data/EclipseWorkSpace/Assignment";
		String sFileName="out.txt";
		//String sFileData="This is the text to be written in file.";

		File objOutFile = new File(sFilePath,sFileName);
		//This constructor of File class with path and Filename will work on both UNIX and Windows.
		if(objOutFile.exists()) {
			objOutFile.delete();
			try {
				objOutFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				objOutFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			objFileWriter = new FileWriter(objOutFile );
			objBufferedWriter = new BufferedWriter(objFileWriter);
			//objBufferedWriter.write("hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testFile(inputfile,"out");
	}


	static void testFile(String inputfile,String outputfile) {

		Boolean correct=readData(inputfile);
		if(correct) {
			testData( "Random Order    ", inputData,      false );
			testData( "Ascending Order ", ascendingData,  false );
			testData( "Descending Order", descendingData, true  );
		}
		try {
			objBufferedWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	public static final Boolean readData(String inputfile) {
		Vector<Integer> asc=new Vector<>();
		Vector<Integer> dsc=new Vector<>();

		File f = new File(inputfile);
		if(!f.exists()) {
			System.err.println("File " + f.getName() + " not found");
			return false;
		}

		StringBuilder buffer = new StringBuilder();
		byte[] bytes = new byte[1024];
		int readBytesCount = 0;
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(f));
			while( (readBytesCount = in.read(bytes)) != -1) {
				buffer.append(new String(bytes, 0, readBytesCount));
			}
		} catch(Exception exc) {
			exc.printStackTrace();
			return false;
		}
		//return buffer.toString();
		if(buffer.toString()!=null) {
			String data=buffer.toString();
			String[] strs = data.split("\\s+");
			for (int i = 0; i < strs.length; i++) {
				if(strs[i].matches("[0-9]+")) {
					int value= Integer.parseInt(strs[i]);
					inputData.add(value);
				}else {
					System.out.println(strs[i]+" - is not a node");
					break;
				}
			}
			if(strs.length==inputData.size()) {
				asc=inputData;
				Collections.sort(asc);

				for(int i=0;i<asc.size();i++) {
					//System.out.println("asc"+i+"-"+asc.get(i));
					ascendingData.add(asc.get(i));
					testData.add(asc.get(i));
				}
				dsc=asc;
				Comparator  comparator=Collections.reverseOrder();
				Collections.sort(dsc, comparator);

				for(int i=0;i<dsc.size();i++) {
					//System.out.println("dsc"+i+"-"+dsc.get(i));
					descendingData.add(dsc.get(i));
				}
				inputData.clear();
				for (int i = 0; i < strs.length; i++) {
					if(strs[i].matches("[0-9]+")) {
						int value= Integer.parseInt(strs[i]);
						inputData.add(value);
					}else {
						System.out.println(strs[i]+" - is not a node");
						break;
					}
				}

				return true;
			}

		}else {

			System.out.println("there is no data");
		}
		return false;

	}

	static void testData(String description, Vector<Integer> data, boolean testInsertDelete) {

		Heap heap = new Heap();
		// TODO Auto-generated method stub
		try {
			objBufferedWriter.newLine();
			objBufferedWriter.newLine();
			objBufferedWriter.write(" *** " +description+" Start *** ");
			objBufferedWriter.newLine();
			objBufferedWriter.newLine();
			objBufferedWriter.write(" ----Inserting input data Start --- ");
			objBufferedWriter.newLine();
			objBufferedWriter.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(" *** " +description+" Start *** ");
		System.out.print("\n");
		System.out.println(" --- Inserting input data Start --- ");
		System.out.print("\n");

		for(int key:data) {
			heap.insert(key);
		}
		/*for(int i=0;i<ascendingData.size();i++) {
		System.out.println("data"+ascendingData.get(i));
	}*/
		printDataHeap(ascendingData, heap );
		checkHeap( ascendingData, heap );
		compareDataHeap( "inserting input data", ascendingData, heap );
		if ( testInsertDelete ) 
		{
			testInsertDifferences(heap);

			testDeleteDifferences(heap);
		}
		try {
		
			objBufferedWriter.write(" *** "+description+" End *** ");
			objBufferedWriter.newLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*** "+description+" End *** ");
		System.out.println("\n");

	}
	static void printDataHeap(Vector<Integer> data, Heap heap) {
		// TODO Auto-generated method stub
		System.out.print("Sorted data:");
		try {
			objBufferedWriter.write("Sorted data:");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for ( int i = 0; i < data.size(); i++ ) 
		{
			try {
				objBufferedWriter.write(" "+data.get(i));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" "+data.get(i));
		}
		/*Vector<Integer> value=heap.deleteMin();
		System.out.print("\n");
		System.out.print("Sorted heap:");
		for(int i=0;i<value.size();i++) {
			System.out.print(value.get(i)+" ");

		}*/

		Vector<Integer> ascendingHeap =new Vector();
		for ( int j = 0; j < heap.size(); ++j) 
		{
			ascendingHeap.add(heap.getElement(j));
		}

		//SORT_IN_ASCENDING_ORDER( ascendingHeap )   // replace with appropriate actual code
		Collections.sort(ascendingHeap);
		try {
			objBufferedWriter.newLine();
			objBufferedWriter.write("Sorted heap:");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("\n");
		System.out.print("Sorted heap:");

		for ( int i = 0; i < ascendingHeap.size(); ++i ) 
		{
			try {

				objBufferedWriter.write(" "+ascendingHeap.get(i));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" "+ascendingHeap.get(i));
		}

		try {
			objBufferedWriter.newLine();
			objBufferedWriter.write("Heap:       ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("\n");
		System.out.print("Heap:       ");

		for ( int i = 0; i < heap.size(); ++i ) 
		{ 

			try {

				objBufferedWriter.write(" "+heap.getElement(i));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print( " "+heap.getElement(i));
		}
		try {

			objBufferedWriter.newLine();
			objBufferedWriter.newLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print("\n");
		System.out.print("\n");

		/*Vector<Integer> ascendingHeap;
		 for ( int j = 0; j < heap.size(); ++j ) {
			 ascendingHeap.add(heap.getElement(j);
		 }*/
	}

	static void testDeleteDifferences (Heap heap)
	{
		Vector<Integer> data = ascendingData;
		Heap   testHeap = heap;

		while ( data.size() > 0) 
		{


			testHeap.deleteMin();
			System.out.println("--- Deleting "+data.get(0)+" ---");
			System.out.println("\n");

			try {

				objBufferedWriter.write("--- Deleting "+data.get(0)+" ---");
				objBufferedWriter.newLine();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			data.remove(0);

			checkHeap(data,testHeap);

			printDataHeap( data, testHeap );
			compareDataHeap( "deleting", data, testHeap );

		}

	}
	static void testInsertDifferences (Heap heap) {
		
		//System.out.println("size"+ascendingData.size());
		for ( int i = 0; i < ascendingData.size(); ++i ) 
		{
			for ( int k=0; k<=2; ++k ) 
			{
				for ( int j=-2; j<=2; ++j ) 
				{
					int value1=ascendingData.get(i)+j;
					int value2=ascendingData.get(i)+j+k;
					//System.out.print(value1+"-");
					//System.out.print(value2);
					//System.out.println("\n");
					testInsertOne( heap,value1, value2);
					
				}

			}
		}


	}




	static void testInsertOne (Heap heap,int startElement,int endElement)
	{
		Heap   testHeap =heap;
		Vector<Integer> finaldata=new Vector();
		
		/*for(int i=0;i<testData.size();i++) {
		System.out.println("testData "+i+"-"+testData.get(i));	checkHeap
		}*/

		
		try {
			objBufferedWriter.write("--- Inserting " +startElement+".."+endElement+" --");
			objBufferedWriter.newLine();
			objBufferedWriter.newLine();
			objBufferedWriter.newLine();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("--- Inserting " +startElement+".."+endElement+" --");
		System.out.println("\n");

		for (int i = startElement; i<=endElement; ++i ) 
		{
			//System.out.println("value"+i);
			//testHeap.insert(i);
			//testData.add(i);
		}
		/*for(int i=0;i<testData.size();i++) {
		System.out.println("testData "+i+"-"+testData.get(i));	
		}*/



		//SORT_IN_ASCENDING_ORDER( testData ) ;  // replace with appropriate actual code
		//Collections.sort(testData);
		//checkHeap(testData,testHeap);
		//printDataHeap( testData, testHeap );
		/*for(int i=0;i<testData.size();i++) {
			if(testData.get(i)==startElement||testData.get(i)==endElement) {
				testData.remove(i);
			}else {
				finaldata.add(testData.get(i));
			}
		}*/
		//Collections.sort(finaldata);
		//testHeap.copy(finaldata);+
		//compareDataHeap( "inserting"+Integer.toString(startElement)+".."+Integer.toString(endElement), testData, testHeap );
	}
	// For each element in the data, attempt to insert [element-2,element-1,element,element+1,element+2]
	// individually and in groups.
	//
	// We are testing so called edge cases - frequent bugs when something is off by one, for example,

	static void compareDataHeap(String description,Vector<Integer> data,Heap heap) {

		if ( data.size() != heap.size() ) 
		{ 
			printDataHeap(data,heap);
			try {

				objBufferedWriter.write("Error: data size "+data.size()+ "heap size "+heap.size());
				objBufferedWriter.newLine();
				objBufferedWriter.write("Data size is not the same as heap size");
				objBufferedWriter.newLine();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Error: data size "+data.size()+ "heap size "+heap.size());
			System.out.println("\n");
			System.out.println("Data size is not the same as heap size");
			System.out.println("\n");
		}

		Vector<Integer> ascendingHeap=new Vector();
		for ( int j = 0; j < heap.size(); ++j ) 
		{
			ascendingHeap.addElement(heap.getElement(j));
		}
		//SORT_IN_ASCENDING_ORDER( ascendingHeap );   // replace with appropriate actual code
		Collections.sort(ascendingHeap);
		for ( int i = 0; i < data.size(); ++i ) 
			if (data.get(i)==ascendingHeap.get(i)) 
			{   

			}else {
				printDataHeap(data,heap);
				try {

					objBufferedWriter.write("While "+description+" at position "+ i);
					objBufferedWriter.newLine();
					objBufferedWriter.write(" sorted data  "+data.get(i));
					objBufferedWriter.newLine();
					objBufferedWriter.write(" sorted heap  "+ascendingHeap.get(i));
					objBufferedWriter.newLine();
					objBufferedWriter.write(" Sorted data and heap are different");
					objBufferedWriter.newLine();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("While "+description+" at position "+ i);
				System.out.println("\n");
				System.out.println(" sorted data  "+data.get(i));
				System.out.println("\n");
				System.out.println(" sorted heap  "+ascendingHeap.get(i));
				System.out.println("\n");
				System.out.println("Sorted data and heap are different");
				System.out.println("\n");
			}

		try {

			objBufferedWriter.write("data and heap are the same");
			objBufferedWriter.newLine();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println( "data and heap are the same");
	} 
	static void checkHeap(Vector<Integer> data,Heap heap) {

		for(int i=0;i<heap.size()/2;++i) {


			if(areHeapElementsOrdered(heap,i,i*2+1) && areHeapElementsOrdered(heap,i,i*2+2)) 
			{

			}else {
				printDataHeap(data,heap);
				try {

					objBufferedWriter.write("Error: heap violation at index " +i);
					objBufferedWriter.newLine();
					objBufferedWriter.write("heap[i]="+heapElement(heap,i));
					objBufferedWriter.newLine();
					objBufferedWriter.write("heap[i*2+1]="+heapElement(heap,i*2+1));
					objBufferedWriter.newLine();
					objBufferedWriter.write("heap[i*2+2]="+heapElement(heap,i*2+2));
					objBufferedWriter.newLine();
					objBufferedWriter.write("Not a heap");
					objBufferedWriter.newLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				System.out.println("Error: heap violation at index " +i);
				System.out.println("\n");
				System.out.println("heap[i]="+heapElement(heap,i));
				System.out.println("\n");
				System.out.println("heap[i*2+1]="+heapElement(heap,i*2+1));
				System.out.println("\n");
				System.out.println("heap[i*2+2]="+heapElement(heap,i*2+2));
				System.out.println("\n");
				System.out.println("Not a heap");
				System.out.println("\n");
			}
		}
	}
	static String heapElement(Heap heap,int i) {

		if(i<heap.size()){
			int value=heap.getElement(i);
			String pass=Integer.toString(value);
			return pass;
		}else {
			return "none";
		}
	}
	static boolean areHeapElementsOrdered(Heap heap,int i,int j) {
		if(i >= heap.size() || j >= heap.size() || heap.getElement(i)<= heap.getElement(j)) {
			return true;
		}
		return false;
	}

}
