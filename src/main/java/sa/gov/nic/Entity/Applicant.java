/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.sa.gov.nic.Entity;

/**
 *
 * @author anoud
 */
public class Applicant {
    long ref ;
    byte [] faceimage;
    byte[] rthumb,rindex,rmiddle,rring,rlittle,lthumb,lindex,lmiddle,lring,llittle;
    String name = "";
    String natonality;
    String passport_num;
    String LocationID;
    String receive_time;
    String agent_id;

    public Applicant(long ref, byte[] faceimage, byte[] rthumb, byte[] rindex, byte[] rmiddle, byte[] rring, byte[] rlittle, byte[] lthumb, byte[] lindex, byte[] lmiddle, byte[] lring, byte[] llittle,String name, String natonality, String passport_num, String LocationID,String agent_id, String receive_time) {
        this.ref = ref;
        this.faceimage = faceimage;
        this.rthumb = rthumb; 
        this.rindex = rindex;
        this.rmiddle = rmiddle;
        this.rring = rring;
        this.rlittle = rlittle;
        this.lthumb = lthumb;
        this.lindex = lindex;
        this.lmiddle = lmiddle ;
        this.lring = lring;
        this.llittle = llittle;
        this.name=name;
        this.natonality = natonality;
        this.passport_num = passport_num;
        this.LocationID = LocationID;
        this.receive_time = receive_time;
        this.agent_id=agent_id;
    }

    public long getRef() {
        return ref;
    }

    public byte[] getFaceimage() {
        return faceimage;
    }

    public byte[] getRthumb() {
        return rthumb;
    }

    public byte[] getRindex() {
        return rindex;
    }

    public byte[] getRmiddle() {
        return rmiddle;
    }

    public byte[] getRring() {
        return rring;
    }

    public byte[] getRlittle() {
        return rlittle;
    }

    public byte[] getLthumb() {
        return lthumb;
    }

    public byte[] getLindex() {
        return lindex;
    }

    public byte[] getLmiddle() {
        return lmiddle;
    }

    public byte[] getLring() {
        return lring;
    }

    public byte[] getLlittle() {
        return llittle;
    }

    public String getName() {
        return name;
    }

    public String getNatonality() {
        return natonality;
    }

    public String getPassport_num() {
        return passport_num;
    }

    public String getLocationID() {
        return LocationID;
    }

    public String getReceive_time() {
        return receive_time;
    }
    
    
    
    
    

}
