public class Array {
    public static void main(String[] args) {
        // int nums[]={2,3,4};

        int nums []= new int [4];

        // nums[0]=11;
        // nums[1]=9;

        for(int i =0;i<4;i++){
            nums[i]=(int)(Math.random() * 10);
        }

        for(int i =0;i<4;i++){
            System.out.println(nums[i] + "");
        }

//Multi dimentional array

int arrays [][]=new int [3][4];

for(int i =0;i<3;i++){
    for(int j=0;j<4;j++){
        arrays[i][j]=(int)(Math.random() * 10);
    }
}


for(int i =0;i<3;i++){
    for(int j=0;j<4;j++){
        System.out.print(arrays[i][j] + " ");
    }
    System.out.println();
}


    }
}
