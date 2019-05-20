
package com.yzh.demo.resources;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import com.zte.demo.DemoConfiguration;
 
@Path("/demo")
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {
	
	private DemoConfiguration content;
	public DemoResource(DemoConfiguration content){
		this.content = content;
	}
	@GET
	@Path("/show")
	@Produces(MediaType.APPLICATION_JSON)
    public DemoConfiguration printYMLContent(){
		System.out.println("陈健  手机那算了lskjdlfjsl;dkfl");
	     return content;
   }
}
