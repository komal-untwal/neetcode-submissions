class Solution:

    def encode(self, strs: List[str]) -> str:
        enc= ""
        """for s in strs:
            enc = enc + " " + s
        print(enc)
        """
        for s in strs:
            n = len(s)
            enc = enc + str(n) + "#" + s
            print(enc) 
        return enc    

    def decode(self, s: str) -> List[str]:
        dec=[]
        i=0

        while i<len(s):
            j = i
            while (s[j] != "#"):
                j += 1

            len_interm = int(s[i:j])
            i = j + 1
            j = i + len_interm 

            dec.append(s[i:j])
            print(dec)
            i = j    
            
        return dec    

