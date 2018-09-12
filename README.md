# ee626ed8ab8c30511041d37a1b9cd534


C#
```
using System;
using System.Text;
using System.Security.Cryptography;
using CodeShare.Cryptography;

namespace CodeShare.Cryptography
{
    public static class SHA
    {

        public static string GenerateSHA256String(string inputString)
        {
            SHA256 sha256 = SHA256Managed.Create();
            byte[] bytes = Encoding.UTF8.GetBytes(inputString);
            byte[] hash = sha256.ComputeHash(bytes);
            return GetStringFromHash(hash);
        }

        public static string GenerateSHA512String(string inputString)
        {
            SHA512 sha512 = SHA512Managed.Create();
            byte[] bytes = Encoding.UTF8.GetBytes(inputString);
            byte[] hash = sha512.ComputeHash(bytes);
            return GetStringFromHash(hash);
        }

        private static string GetStringFromHash(byte[] hash)
        {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < hash.Length; i++)
            {
                result.Append(hash[i].ToString("X2"));
            }
            return result.ToString();
        }

    }
}
```

Java
```
MessageDigest md = null;
	String password = "primero";
        try {
            
            //SHA-512
            md= MessageDigest.getInstance("SHA-512");
            md.update(password.getBytes());
            byte[] mb = md.digest();
            System.out.println(Hex.encodeHex(mb));
            
            //SHA-384
            md= MessageDigest.getInstance("SHA-384");
            md.update(password.getBytes());
            byte[] mb0 = md.digest();
            System.out.println(Hex.encodeHex(mb0));
            
            //SHA-256
            md= MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] mb1 = md.digest();
            System.out.println(Hex.encodeHex(mb1));
            
            
            //SHA-1
            md= MessageDigest.getInstance("SHA-1");
            md.update(password.getBytes());
            mb = md.digest();
            System.out.println(Hex.encodeHex(mb));
            
            //MD5
            md= MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            mb = md.digest();
            System.out.println(Hex.encodeHex(mb));
            
        } catch (NoSuchAlgorithmException e) {
            //Error
        }

```
