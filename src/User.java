/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class User {
    private String pack_id,packtype,validity,noofcalls,data,amount;
    public User(String pack_id,String packtype,String validity,String noofcalls,String data,String amount)
    {
        
        this.pack_id=pack_id;
        this.packtype=packtype;
        this.validity=validity;
        this.noofcalls=noofcalls;
        this.data=data;
        this.amount=amount;
    }
   
    public String getpack_id(){
        return pack_id;
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
