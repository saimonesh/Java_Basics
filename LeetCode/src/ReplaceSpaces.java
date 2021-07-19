public class ReplaceSpaces {
    //Replace spaces in a string with %20

    //algorithm
    /*
    * 1.iterate the string and calculate the number of spaces
    * 2.create new array with the calucated spaces
    * 3.iterate the array and store the result in new array
    * */
    public String replace(char[] str, int length) {
        int spaceCount = 0, newLength;
        for (int i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        newLength = length + spaceCount * 2;
        char[] newStr=new char[newLength];
        for(int i=length-1;i>=0;i--)
        {
            if(str[i]==' ')
            {
                newStr[newLength-1]='0';
                newStr[newLength-2]='2';
                newStr[newLength-3]='%';
                newLength=newLength-3;
            }else
            {
                newStr[newLength-1]=str[i];
                newLength=newLength-1;
            }
        }
        return new String(newStr);
    }
}
