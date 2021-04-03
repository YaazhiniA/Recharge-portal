/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class User1 {
    private String network,packid,packtype,validity,noofcalls,data,amount;
    public User1(String network,String packid,String packtype,String validity,String noofcalls,String data,String amount)
    {
        this.network=network;
        this.packid=packid;
        this.packtype=packtype;
        this.validity=validity;
        this.noofcalls=noofcalls;
        this.data=data;
        this.amount=amount;
    }
   public String getnetwork(){
        return network;
    }
    public String getpackid(){
        return packid;
    }
    public String getpacktype(){
        return packtype;
    }
    public String getvalidity(){
        return validity;
    }
    public String getnoofcalls(){
        return noofcalls;
    }
    public String getdata(){
        return data;
    }
    public String getamount(){
        return amount;
    }
}
