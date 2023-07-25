object Caeser{
    def main (args : Array[String]):Unit = {
        println("Enter String : ");
        var s: String = scala.io.StdIn.readLine();
        println("Enter shift : ")
        var num: Int = scala.io.StdIn.readInt();
        var encryptedString = caeserEncrypt(s,num);
        var decryptedString = caeserDecrypt(encryptedString,num);
        println(s"Encrypted Version : $encryptedString");
        println(s"Decrypted Version : $decryptedString");
    }

    def caeserEncrypt(s:String,shift:Int):String = {
        val alphabet : String = "abcdefghijklmnopqrstuvwxyz";
        var length:Int = s.length();
        var modifiedString : String = s.toLowerCase();
        var result : String = "";
        for(x <- 0 to s.length()-1 ){
            for(y <- 0 to 25){
                if(modifiedString.charAt(x) == alphabet.charAt(y)){
                    result = result + alphabet.charAt((y+shift)%25);
                }//else {
                //     result = result + modifiedString.charAt(x);
                // }
            }
        }
        result;
    }

    def caeserDecrypt(s:String, shift:Int):String = {
         val alphabet : String = "abcdefghijklmnopqrstuvwxyz";
         var length:Int = s.length();
         var result : String = "";
         for(x <- 0 to length-1){
            for(y <- 0 to 25){
                if(s.charAt(x) == alphabet.charAt(y)){
                    var index : Int = (y - shift)
                    result = result + alphabet.charAt(index%25);
                }
            }
         }
         result;
    }
}