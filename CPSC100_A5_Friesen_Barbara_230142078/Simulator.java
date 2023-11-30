public class Simulator
{
    public static void main(String[] args)
    {
        Encryptor encryptor0 = new Encryptor(0);
        Encryptor encryptor1 = new Encryptor(1);
        Encryptor encryptor2 = new Encryptor(2);
        Decryptor decryptor0 = new Decryptor(0);
        Decryptor decryptor1 = new Decryptor(1);
        Decryptor decryptor2 = new Decryptor(2);
        String str0 = "kitty";
        String str1 = "test string";
        String str2 = "Agent: James Bond";
        String encryptedString0 = "";
        String encryptedString1 = "";
        String encryptedString2 = "";
        String decryptedString0 = "";
        String decryptedString1 = "";
        String decryptedString2 = "";

        System.out.println("==============================");
        System.out.println("Simulating difficulty level 0:");
        encryptedString0 = encryptor0.encryptString(str0);
        System.out.println("Encrypting String: " + str0 + " ...");
        System.out.println("Encrypted as: " + encryptedString0);
        if (encryptor0.getDiff() == decryptor0.getDiff())
        {
            System.out.println("Decrypting String: " + encryptedString0 + " ...");
            decryptedString0 = decryptor0.decryptString(encryptedString0);
            System.out.println("Decrypted as: " + decryptedString0);
            if (decryptor0.getDecryptedStr().equals(encryptor0.getOriginalStr()) && encryptor0.getEncryptedStr().equals(decryptor0.getEncryptedStr()))
                System.out.println("Success!");
            else
                System.out.println("Fail!");
        }

        System.out.println("==============================");
        System.out.println("Simulating difficulty level 1:");
        encryptedString1 = encryptor1.encryptString(str1);
        System.out.println("Encrypting String: " + str1 + " ...");
        System.out.println("Encrypted as: " + encryptedString1);
        if (encryptor1.getDiff() == decryptor1.getDiff())
        {
            System.out.println("Decrypting String: " + encryptedString1 + " ...");
            decryptedString1 = decryptor1.decryptString(encryptedString1);
            System.out.println("Decrypted as: " + decryptedString1);
            if (decryptor1.getDecryptedStr().equals(encryptor1.getOriginalStr()) && encryptor1.getEncryptedStr().equals(decryptor1.getEncryptedStr()))
                System.out.println("Success!");
            else
                System.out.println("Fail!");
        }

        System.out.println("==============================");
        System.out.println("Simulating difficulty level 2:");
        encryptedString2 = encryptor2.encryptString(str2);
        System.out.println("Encrypting String: " + str2 + " ...");
        System.out.println("Encrypted as: " + encryptedString2);
        if (encryptor2.getDiff() == decryptor2.getDiff())
        {
            System.out.println("Decrypting String: " + encryptedString2 + " ...");
            decryptedString2 = decryptor2.decryptString(encryptedString2);
            System.out.println("Decrypted as: " + decryptedString2);
            if (decryptor2.getDecryptedStr().equals(encryptor2.getOriginalStr()) && encryptor2.getEncryptedStr().equals(decryptor2.getEncryptedStr()))
                System.out.println("Success!");
            else
                System.out.println("Fail!");
        }

        System.out.println("==============================");
        System.out.println("End of processing...");
    }
}
