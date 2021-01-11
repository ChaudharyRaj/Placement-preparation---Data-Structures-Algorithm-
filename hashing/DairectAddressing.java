package hashing;
import java.util.*;

public class DairectAddressing {

	public static void main(String[] args) {
		
		Scanner in =  new Scanner(System.in);
		int n = in.nextInt();
		HashTable ht = new HashTable(n);
		for(int i = 0;i<n; i++){
			int key = in.nextInt();
			int value =  in.nextInt();
			ht.insert(key, value);
		}
		ht.printHashTable();
	}
	
	
	static class LinkedHash{
		int key;
		int value;
		LinkedHash next;
		public LinkedHash(int key, int value){
			this.key = key;
			this.value =  value;
		}
	}
	
	static class HashTable{
		private int TABLE_SIZE;
		private int size;
		private LinkedHash[] table;
		
		/*Constructor*/
		 public HashTable(int capacity){
			size = 0;
			TABLE_SIZE = capacity;
			table =  new LinkedHash[TABLE_SIZE];
			for(int i =0; i<TABLE_SIZE; i++){
				table[i] = null;
			}
		}
		 
		 int getSize(){return size;}
		 
		 public void clear(){
			 for(int i = 0; i<TABLE_SIZE; i++)
				 table[i] = null;
			 size = 0;
		}
		 
		 
		/*Functio to get value  of key*/
		public int getValue(int key){
			
			int hash = (key%TABLE_SIZE);
			if(table[hash] == null){
				return -1;
			}else{
				LinkedHash entry = table[hash];
				while(entry != null &&  !(entry.key == key))
					entry = entry.next;
				if(entry == null)
					return -1;
				else
					return entry.value;
			}
		}
		
		/*Funtion to insert kye value pair*/
		
		public void insert(int key, int value){
			
			int hash = (key%TABLE_SIZE);
			
			if(table[hash] == null){
				table[hash] =  new LinkedHash(key,value);
			}else{
				
				LinkedHash entry = table[hash];
				while(entry.next !=null)
					entry = entry.next;
				
				if(entry.key ==  key){
					System.out.println("Dublicat key are not allowd");
					return;
				}
				else
					entry.next =  new LinkedHash(key,value);
			}
			size++;
		}
		
		public void printHashTable(){
			
			for(int i =0; i<TABLE_SIZE; i++){
				
				System.out.println("\nBucket"+(i+i)+" : ");
				LinkedHash entry = table[i];
				while(entry != null){
					System.out.println("[key = "+entry.key+" ,value"+entry.value);
					entry = entry.next;
				}
			}
		}
	}

}
