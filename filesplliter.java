import java.io.*;
class filesplliter
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
             File f=new File(args[0]);
            
             if(!f.exists())
             {
                              System.out.print("Source file is missing");
                              System.exit(0);
              }
             System.out.println("Enter file size ");
             Console con=System.console();
             long n=Long.parseLong(con.readLine());
            
             long k=f.length();
	
             long x=k/n,p;
	char i=65;

             FileInputStream fis=new FileInputStream(args[0]);
	File f2=new File(args[0]);
	if(k%n==0)
{
             while(x!=0)
             {
	
                        File f1=new File(i+args[0]);
	                 
                      FileOutputStream fos=new FileOutputStream(f1);
                      int ch;
	while((f1.length())<n)
	{
	ch=fis.read();
                      
                      fos.write(ch);
                      
	     
	 
                      }
	                    
                      i++;
                      x--;
                      }
            }
else
{
             while((x+1)!=0)
             {
	
                        File f1=new File(i+args[0]);
	                 
                      FileOutputStream fos=new FileOutputStream(f1);
                      int ch;
	while((f1.length())<n)
	{
	 
	ch=fis.read();
                       if(ch==-1)
	break;
	     
                      fos.write(ch);
                    
	}
	                    
                      i++;
                      x--;
                      }
            }
               fis.close();
	f2.delete();  
                       
      }
}
             
             
             