class Solution2 {
	//find max contineous substring length, without repeating its character
    public static void main(String args[]) {
		String s="abcdefghijkklmnopjiuopqqooitprstuvwxyzABnilijilkougejboihjhn;oiebfkjfb;ufufdsougf;oaugf;ouge;uorgufbiaosu;cvp976y4pw9qug;pugc9p7eut;b .m;o 894typ;o94y np8houjhg[98i4t[klng c[0 vb4 9yu8 [ncy4p9tc8on4wt[;lsdigysaopd;lfjkdudyd;udh;ay is th eogod ilyagfepiyhvfbpiaugfkj;gdbfpsaouftp938yr98t4kb;jc87yrb4;38630r9gqp8y-9f8ya9p83rgi3CDEFGHIJKLMNOPQRSTUVWXYZ01234567898y94j;lbiyvp8er;wiuo7r";
        int max=0,count=0,i,j,n=s.length();
        String s2="",temps=s;;
    for(j=0;j<n;j++)
    {
        s=s.substring(j);
        for(i=0;i<s.length();i++)
        {
            if(!s2.contains(s.charAt(i)+""))
            {
                s2+=s.charAt(i);
                count++;
            }
            else
            {
                if(count>max)
                {
                    max=count;
                }
                s2=""+s.charAt(i);
                count=1;
            }
        }
        if(count>max)
        {
            max=count;
        }
        s=temps;
        count=0;
        s2="";
    }
        System.out.println(max);
    }
}