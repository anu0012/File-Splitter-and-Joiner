import java.io.*;
class filejoiner
{
      public static void main(String args[]) throws IOException
      {
             if(args.length<1)
             {
                              System.out.print("Parameter are missing");
                              System.exit(0);
                              }
             if(args.length>1)
             {
                              System.out.print("Parameter are more than neccesary");
                              System.exit(0);
                              }
                              char i=65;
	
                             
            FileOutputStream fos=new FileOutputStream(args[0]);
             FileInputStream fis;
	
            
            while(true)
            {
                              
                 
                      File f1=new File(i+args[0]);
	
	      
                   if(f1.exists())
{
	
	fis=new FileInputStream(f1);
	 int ch;
                      
                 while((ch=fis.read())!=-1)
                fos.write(ch);
                
	      i++;
	fis.close();
	f1.delete();
		}
                        else
{
                        break;
}
	
	    }

fos.close();


                 
            
         
            
                 
                       
      }
}
             
             
             