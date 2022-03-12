//1.) Revise Arrays, 2-D arrays and questions discussed in class

// i also revised array question discussed in class


//2.) Convert 1-D array to 2-D array


class TwoDArray{
    public static void main(String args[]){

    int a[][]=new int[4][3];

    int d[]={10,20,30,40,50,60,70,80,90,100,110,120};

    int count=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)

            {
                if(count==d.length) break;
            a[i][j]=d[count];
            System.out.printf("a[%d][%d]= %d\n",i,j,a[i][j]);
            count++;
            }
        }
    System.out.println("Count is "+count);
    }
}