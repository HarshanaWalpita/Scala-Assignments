//alphabet
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//get number of swifts
val shift = (scala.io.StdIn.readLine("Enter The Number You Want To Swift: ").toInt + alphabet.size) % alphabet.size
//get input message
val input_text = scala.io.StdIn.readLine("Enter Your Message: ")
//function to encrypt
val output_text1 = input_text.map( (c: Char) => { 
val x = alphabet.indexOf(c.toUpper)
    if (x == -1){
			c
	    }
		else{
			alphabet((x + shift) % alphabet.size)
		} 
	});
//function to decrypt
val output_text2 = output_text1.map( (c: Char) => { 
val x = alphabet.indexOf(c.toUpper)
    if (x == -1){
			c
	    }
		else{
			alphabet((x - shift) % alphabet.size)
		} 
	});
//print message
println("Encrypted Message: ");
println(output_text1);
println("Decrypted Message: ");
println(output_text2);

