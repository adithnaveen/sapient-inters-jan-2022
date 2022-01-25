package com.naveen.day6.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteExample  {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		acceptAndWrite();
		File file = new File("trainer.txt"); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		
		String line=null; 
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
	}

	private static void acceptAndWrite() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("Enter Trainer ID: ");
		int trainerId = Integer.parseInt(br.readLine()); 
		
		System.out.println("Enter Trainer Name: ");
		String trainerName = br.readLine(); 
		
		System.out.println("Enter Trainer Income: ");
		double trainerIncome = Double.parseDouble(br.readLine());
		 
		print(trainerId, trainerName, trainerIncome);
		
		writeToFile(trainerId, trainerName, trainerIncome);
	}

	private static void writeToFile(int trainerId, String trainerName, double trainerIncome)
				throws IOException {
		BufferedWriter bw = null; 
		try {
			File file = new File("trainer.txt"); 
			bw = new BufferedWriter(new FileWriter(file, true)); 
			
			bw.write("Trainer Id :" + trainerId);
			bw.write("Trainer Name :" + trainerName);
			bw.write("Trainer Income :" + trainerIncome +"\n");
			
		}catch(IOException ioe) {
			ioe.printStackTrace(); 
		}finally {
			bw.close();
		}
	}

	private static void print(int trainerId, String trainerName, double trainerIncome) {
		System.out.println("Trainer ID : " + trainerId);
		System.out.println("Trainer Name : " + trainerName);
		System.out.println("Trainer Income : " + trainerIncome);
	}
}
