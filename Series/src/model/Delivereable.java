package model;

import com.sun.corba.se.spi.oa.ObjectAdapter;

public interface Delivereable {
     void deliver();
     void refund();
     boolean isDeliver();
     int compareTo(Object a);
}
