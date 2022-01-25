package com.naveen.day6.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Trainer implements Serializable{
 
	private static final long serialVersionUID = 1L;
	private int trainerId;
	private String trainerName; 
	private double trainerIncome;
	public Trainer() {}
	
	
	public Trainer(int trainerId, String trainerName, double trainerIncome) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerIncome = trainerIncome;
	}


	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerIncome=" + trainerIncome
				+ "]";
	}


	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public double getTrainerIncome() {
		return trainerIncome;
	}
	public void setTrainerIncome(double trainerIncome) {
		this.trainerIncome = trainerIncome;
	} 
	
}

public class StoreReadObject {

	/**
	 * 
	 * @param trainer
	 * @see mehtod to store trainer object 
	 * @author naveenkumar
	 * @since Jan 2022 
	 * 
	 */
	public static void storeObject(Trainer trainer) {
		ObjectOutputStream oos = null;  
		try {
			oos = new ObjectOutputStream(new FileOutputStream("trainer.ser"));
			oos.writeObject(trainer); 
			oos.writeInt(100);
			System.out.println("Trainer Saved..");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
	
	public static void storeObjectAutoClose(Trainer trainer) throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("trainer.ser"))){
			oos.writeObject(trainer);
			oos.writeInt(100);
			System.out.println("Trainer Stored...");
		}
	}
	
	public static Trainer readObject() throws IOException, ClassNotFoundException {
		try (
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("trainer.ser"))
			) {
			
			Trainer trainer = (Trainer) ois.readObject();
			System.out.println("The Integer value " + ois.readInt());
			return trainer; 
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// Trainer trainer = new Trainer(101, "Sangita", 1234); 
		// storeObject(trainer);
		Trainer trainer = readObject();
		System.out.println(trainer);
	}
}











