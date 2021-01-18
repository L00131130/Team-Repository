/*
 * FindCustomer.java
 *
 * Created on January 1, 2008, 1:59 AM
 */

package test;
import java.io.Serializable;
import java.util.*;
import java.sql.*;
import java.io.*;


/**
 * @author ATUL
 */
public class FindCustomer implements Serializable
{
    public String customername, customerid;
    public Vector result;
    public void setCustomerid(String customerid)
    {
        if(customerid != null)
            this.customerid = customerid;
        
    }
    
    public String getCustomerid()
    {
        return(this.customerid);
    }
    
   
      }
    
    }


