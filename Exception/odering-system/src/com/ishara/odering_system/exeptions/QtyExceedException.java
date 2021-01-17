package com.ishara.odering_system.exeptions;

public class QtyExceedException extends Exception{
		public QtyExceedException(String messgae,Exception e) {
			super(messgae,e);
		}
		public QtyExceedException(String messgae) {
			super(messgae);
			
		}

}
