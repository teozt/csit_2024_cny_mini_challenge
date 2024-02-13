import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class csit_decode{
    public static void main(String[] args){

		    String string1 = "3d0fu1njz4+Gy3XaM2WTPcyVXI29QVKyvCCqbzkgk3g=";
        String string2 = "msZPtEjMhbHiGZmqMue9Y6oieguWXtku3RYKS2ATWJY=";
        String string3 = "1Ej7U+8DSOqzme0qStVXMTyabDiLlSYZ/fe7slZHaH4S4OWBi/7R8plqr15jkeGl";
        String string4 = "dNLFGK/98AfFTXaQiB68n79U0Qu8EGHFqWRv0D4Eods=";
        String string5 = "AJdBdXVa4A5FvLSrne+q6n3Sk7kaDP31E3+doaUEGxA=";

        try {
            System.out.println(decrypt(string5, string1)); // MainActivity$sendOkHttpUnpinnd$1
            System.out.println(decrypt(string3, string1)); // MainActivity$sendOkHttpPinned$1
            
            System.out.println(decrypt(string2, string1)); // MainActivity$sendOkHttpPinnedd$1
            System.out.println(decrypt(string4, string1)); // MainActivity$sendOkHttpPinneddd$1

            // you_need_to_rot_it
            // CSIT{U@ccL_Ce05c3e0h5_L3@e_0s_Qe@t0a}
            // use_caesar_substitution_cipher
            // keep_trying_its_not_this_button


        }
        catch(Exception e) {
            System.out.println(e);  
        }
	
	}

    public static final String decrypt(String ciphertext, String secret) throws Exception {
        
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bytes = ciphertext.getBytes();
        
        byte[] decode = decoder.decode(bytes);
        Base64.Decoder decoder2 = Base64.getDecoder();
        byte[] bytes2 = secret.getBytes();
        
        byte[] decode2 = decoder2.decode(bytes2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(decode2, 0, decode2.length, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(2, secretKeySpec);
        byte[] doFinal = cipher.doFinal(decode);
        
        return new String(doFinal);
    }
}
