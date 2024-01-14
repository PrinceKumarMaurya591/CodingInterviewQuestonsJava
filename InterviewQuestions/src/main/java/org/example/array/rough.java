//remove dublicate form array
package org.example.array;

class rough{
public static String rmd(String str){
    char[] ch=str.toCharArray();
    int tail=1;
    for(int i=1;i<ch.length;i++){
        for(int j=0;j<tail;j++){
            if(ch[i]==ch[j]){
                break;
            }
            if(j==tail)
            {
                ch[tail]=ch[i];
                tail++;


            }
        }
    }
    return new String(ch,0,tail);

}

    public static void main(String[] args) {
        String str="hello Pripncei";
        rmd(str);
    }
}