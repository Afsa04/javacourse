package com.tnsif.multihreading;

public class ImplementingRunnable  implements Runnable{
	
		
		public static void main(String[] args) {
			
			ImplementingRunnable r=new ImplementingRunnable();
			//new state
			
			//r.start();
			Thread t1=new Thread(r);
			t1.start();
		}

		@Override
		public void run() {
			System.out.println("implementing runnable interface");
			
		}	
		
	}


	
