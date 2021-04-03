/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class User2 {
    private String c_username,mobile_no,recharge_date,p_amount;
    public User2(String c_username,String mobile_no,String recharge_date,String p_amount)
    {
        
        this.c_username=c_username;
        this.mobile_no=mobile_no;
        this.recharge_date=recharge_date;
        this.p_amount=p_amount;
    }
   
    public String getusername(){
        return c_username ;
    }
    public String getmobileno(){
        return mobile_no;
    }
    public String getdate(){
        return recharge_date;
    }
    public String getamount(){
        return p_amount;
    }
}
