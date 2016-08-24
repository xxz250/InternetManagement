package com.chinatelecom.interceptor;

public class Encryptor {
	
	private static final String v = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* Convert binary contents to BASE64
     * Accepts: source
     * Returns: destination as BASE64
     */
	public static String encrypt(String src){
		char 	c0, c1, c2, byte1, byte2, byte3, byte4;
	    StringBuffer buf = new StringBuffer();

	    int	count = 0;
	    int src_len = src.length();
	    int i = ((src_len + 2) / 3) * 4 ;
	    int dest_len = i + 2 * ((i / 60) + 1);
	    i = 0;	    
	    while(src_len>0){
	    	 /* process tuplets */
		    c0 = src.charAt(count++);

		    /* byte 1: high 6 bits (1) */
		    byte1 = v.charAt(c0 >> 2);

		    /* byte 2: low 2 bits (1), high 4 bits (2) */
		    if(--src_len > 0){
		    	c1 = src.charAt(count++);
		    }
		    else{
		    	c1=0;
		    }
		    byte2  = v.charAt( ((c0 << 4) + (c1 >> 4)) & 0x3f );

		    /* byte 3: low 4 bits (2), high 2 bits (3) */
		    if(src_len > 0){
		    	if(--src_len > 0){
		    		c2 = src.charAt(count++);
		    	}
		    	else{
		    		c2=0;
		    	}
		    	byte3 = v.charAt( ((c1 << 2) + (c2 >> 6) ) & 0x3f) ;
		    }
		    else{
		    	c2 = 0;
		    	byte3 = '=';
		    }

		    /* byte 4: low 6 bits (3) */
		    if (src_len > 0 ){
		    	byte4 = v.charAt(c2 & 0x3f);
		    }
		    else{
		    	byte4 = '=';
		    }

		    buf.append(byte1).append(byte2).append(byte3).append(byte4);

		    /* count third character if processed */
		    if (src_len > 0){
		    	src_len--;
		    }

		    if ((++i) == 15){
		    	/* output 60 characters? */
		    	i = 0;	/* restart line break count, insert CRLF */
		    	buf.append("\r\n" );
		    }
	    }
	    buf.append("\r\n"); /* insert final CRLF */
	    if(buf.length() != dest_len){
	    	//Error Occurred
	    	return null;
	    }
	    return buf.toString();	/* return the resulting string */
    }
}
